
public class Patient {

    private int id;
    private String patientName;
    private String department;
    private String doctorName;
    private String diagnosis;
    private String treatment;
    private String severity;
    private String patientType;
    private int heartRate;
    private int bp;
    private int sugarValue;
    private boolean active;

    public Patient(int id, String patientName, String department,
                   String doctorName, String diagnosis, String treatment,
                   String severity, String patientType,
                   int heartRate, int bp, int sugarValue, boolean active) {

        this.id = id;
        this.patientName = patientName;
        this.department = department;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.severity = severity;
        this.patientType = patientType;
        this.heartRate = heartRate;
        this.bp = bp;
        this.sugarValue = sugarValue;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getSeverity() {
        return severity;
    }

    public String getPatientType() {
        return patientType;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getBp() {
        return bp;
    }

    public int getSugarValue() {
        return sugarValue;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + patientName +
                ", Department: " + department +
                ", Doctor: " + doctorName +
                ", Diagnosis: " + diagnosis +
                ", Treatment: " + treatment +
                ", Severity: " + severity +
                ", Type: " + patientType +
                ", Heart Rate: " + heartRate +
                ", BP: " + bp +
                ", Sugar: " + sugarValue +
                ", Active: " + active;
    }
}
