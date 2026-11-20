import java.util.*;
import java.util.stream.Collectors;
public class PatientStream {
    public static void main(String[] args) {
        List<Patient> info = Arrays.asList(
                new Patient(101, "ravi", "Cardiology", "dr.kumar", "heratdisease", "medication", "critical", "icu", 120, 150, 180, true),

                new Patient(102, "Priya", "Neurology", "Dr. Anu",
                        "Migraine", "Tablets", "LOW",
                        "OUTPATIENT", 85, 120, 110, true),

                new Patient(103, "Kiran", "Cardiology", "Dr. Raj",
                        "Heart Attack", "Surgery", "HIGH",
                        "ICU", 110, 160, 190, true),

                new Patient(104, "Anu", "General", "Dr. Ravi",
                        "Fever", "Medication", "MEDIUM",
                        "INPATIENT", 90, 120, 100, false),

                new Patient(105, "Suresh", "Neurology", "Dr. Priya",
                        "Stroke", "Treatment", "CRITICAL",
                        "ICU", 95, 170, 200, false),

                new Patient(106, "Divya", "Cardiology", "Dr. Kumar",
                        "Chest Pain", "Medication", "MEDIUM",
                        "ICU", 105, 140, 150, true)
        );

// 1. Find all active ICU patients

        List<Patient> activeIcu = info.stream()
                .filter(p -> p.isActive())
                .filter(p -> p.getPatientType().equalsIgnoreCase("ICU"))
                .collect(Collectors.toList());

// Display active ICU patients
        System.out.println("Active ICU Patients:");

        activeIcu.forEach(System.out::println);


// 2. Find active ICU patients with heart rate > 100

        List<Patient> elevatedHeartRate = info.stream()
                .filter(p -> p.isActive())
                .filter(p -> p.getPatientType().equalsIgnoreCase("ICU"))
                .filter(p -> p.getHeartRate() > 100)
                .collect(Collectors.toList());

// Display elevated heart rate patients
        System.out.println("\nActive ICU Patients with Elevated Heart Rate:");

        elevatedHeartRate.forEach(System.out::println);


// 3. Sort all patients by severity

        List<Patient> sortedPatients = info.stream()
                .sorted(Comparator.comparing(Patient::getSeverity))
                .collect(Collectors.toList());

// Display sorted patients
        System.out.println("\nPatients Sorted by Severity:");

        sortedPatients.forEach(System.out::println);


    }
}

