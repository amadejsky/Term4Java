package zad2;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        PatientsQueue patientsQueue = new PatientsQueue();
        Patient patient = new Patient("John", "Yes", "12", "aa", LocalTime.now());
        patientsQueue.addPatientToQue(patient);
        patientsQueue.printPatientList();
        patientsQueue.addPatientToQue(new Patient("John", "Second", "12", "aa", LocalTime.now()));
        patientsQueue.removePatientFromQue(patient);
        System.out.println("next patient");
        System.out.println(patientsQueue.checkNextPatient());
        patientsQueue.sendToAdditionalChecks(patient);
        System.out.println(patientsQueue.checkTimeOfLastPatient());
        patientsQueue.printPatientList();

    }
}
