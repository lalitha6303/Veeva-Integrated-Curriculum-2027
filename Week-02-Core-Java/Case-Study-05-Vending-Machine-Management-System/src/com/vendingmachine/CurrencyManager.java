
package com.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class CurrencyManager {

    // Denomination -> available count in machine
    private HashMap<Integer, Integer> machineCurrency;

    // Customer's inserted money (temporary)
    private HashMap<Integer, Integer> insertedCurrency;

    // Supported denominations
    private static final int[] DENOMINATIONS =
            {200, 100, 50, 20, 10, 5, 2, 1};

    public CurrencyManager() {

        machineCurrency = new HashMap<>();
        insertedCurrency = new HashMap<>();
    }

    // 1. Add money to machine inventory
    public void addMachineCurrency(int denomination, int count) {

        if (!isValidDenomination(denomination) || count <= 0) {
            System.out.println("Invalid denomination or count!");
            return;
        }

        machineCurrency.put(
                denomination,
                machineCurrency.getOrDefault(denomination, 0) + count
        );

        System.out.println("Machine currency updated!");
    }

    // 2. Check supported denomination
    private boolean isValidDenomination(int denomination) {

        for (int d : DENOMINATIONS) {
            if (d == denomination) {
                return true;
            }
        }

        return false;
    }

    // 3. Accept customer's money
    public void insertCash(int denomination) {

        if (!isValidDenomination(denomination)) {
            System.out.println("Invalid denomination!");
            return;
        }

        insertedCurrency.put(
                denomination,
                insertedCurrency.getOrDefault(denomination, 0) + 1
        );

        System.out.println("Accepted: Rs." + denomination);
    }

    // 4. Calculate inserted amount
    public int getInsertedAmount() {

        int total = 0;

        for (Map.Entry<Integer, Integer> entry
                : insertedCurrency.entrySet()) {

            total += entry.getKey() * entry.getValue();
        }

        return total;
    }

    // 5. Create a temporary view of available money
    private HashMap<Integer, Integer> getCombinedCurrency() {

        HashMap<Integer, Integer> combined =
                new HashMap<>(machineCurrency);

        for (Map.Entry<Integer, Integer> entry
                : insertedCurrency.entrySet()) {

            int denomination = entry.getKey();
            int count = entry.getValue();

            combined.put(
                    denomination,
                    combined.getOrDefault(denomination, 0) + count
            );
        }

        return combined;
    }

    // 6. Find an exact change combination
    private HashMap<Integer, Integer> findChange(
            int amount,
            HashMap<Integer, Integer> available) {

        HashMap<Integer, Integer> change = new HashMap<>();

        if (amount == 0) {
            return change;
        }

        boolean[] reachable = new boolean[amount + 1];
        int[] previousAmount = new int[amount + 1];
        int[] previousDenomination = new int[amount + 1];

        reachable[0] = true;

        // Bounded coin-change dynamic programming
        for (int denomination : DENOMINATIONS) {

            int count = available.getOrDefault(denomination, 0);

            for (int i = 0; i < count; i++) {

                for (int value = amount;
                     value >= denomination;
                     value--) {

                    if (!reachable[value]
                            && reachable[value - denomination]) {

                        reachable[value] = true;
                        previousAmount[value] = value - denomination;
                        previousDenomination[value] = denomination;
                    }
                }
            }
        }

        if (!reachable[amount]) {
            return null;
        }

        // Reconstruct the exact change
        int remaining = amount;

        while (remaining > 0) {

            int denomination = previousDenomination[remaining];

            change.put(
                    denomination,
                    change.getOrDefault(denomination, 0) + 1
            );

            remaining = previousAmount[remaining];
        }

        return change;
    }

    // 7. Dispense change and commit payment
    public HashMap<Integer, Integer> dispenseChange(int amount)
            throws InsufficientChangeException {

        HashMap<Integer, Integer> combined = getCombinedCurrency();

        HashMap<Integer, Integer> change =
                findChange(amount, combined);

        if (change == null) {
            throw new InsufficientChangeException(
                    "Machine does not have proper change!"
            );
        }

        // Update machine balance after successful change calculation
        for (int denomination : DENOMINATIONS) {

            int available = combined.getOrDefault(denomination, 0);
            int returned = change.getOrDefault(denomination, 0);

            int remaining = available - returned;

            if (remaining > 0) {
                machineCurrency.put(denomination, remaining);
            } else {
                machineCurrency.remove(denomination);
            }
        }

        // Clear customer's temporary cash
        insertedCurrency.clear();

        return change;
    }

    // 8. Cancel and return inserted money
    public HashMap<Integer, Integer> cancelPayment() {

        HashMap<Integer, Integer> refund =
                new HashMap<>(insertedCurrency);

        insertedCurrency.clear();

        return refund;
    }

    // 9. Display machine currency
    public void displayMachineCurrency() {

        System.out.println("\n--- MACHINE CURRENCY ---");

        for (int denomination : DENOMINATIONS) {

            int count =
                    machineCurrency.getOrDefault(denomination, 0);

            System.out.println(
                    "Rs." + denomination + " : " + count
            );
        }
    }
    public boolean canReturnChange(int amount) {

        HashMap<Integer, Integer> combined =
                getCombinedCurrency();

        return findChange(amount, combined) != null;
    }
}
