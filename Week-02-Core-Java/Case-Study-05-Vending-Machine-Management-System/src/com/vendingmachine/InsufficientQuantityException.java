
package com.vendingmachine;

public class InsufficientQuantityException extends Exception {

    public InsufficientQuantityException(String message) {
        super(message);
    }
}
