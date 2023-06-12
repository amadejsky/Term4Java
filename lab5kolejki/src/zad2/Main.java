package zad2;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        PatientsQueue patientsQueue = new PatientsQueue();
        Patient patient = new Patient("John", "Firsts", "12", "aa", LocalTime.now());
        patientsQueue.addPatientToQueue(patient);
        patientsQueue.printPatientsList();
        patientsQueue.addPatientToQueue(new Patient("John", "Second", "12", "aa", LocalTime.now()));
        patientsQueue.addPatientToQueue(new Patient("John", "Third", "12", "aa", LocalTime.now()));
        patientsQueue.removePatientFromQueue(patient);
        System.out.println("next patient");
        System.out.println(patientsQueue.checkNextPatient());
        System.out.println("na badania");
        patientsQueue.sendToAdditionalChecks(patient);
        System.out.println("czas ostatniej wizyty ");
        System.out.println(patientsQueue.checkTimeOfLastPatient());
        System.out.println("lista pacjentow");
        patientsQueue.printPatientsList();
    }
}
