package zad3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        QueueService queueService = new QueueService();
        queueService.addPatient(new Patient("a", "b", "c", "d", false));
        queueService.addPatient(new Patient("a1", "b", "c", "d", false));
        queueService.addPatient(new Patient("a2", "b", "c", "d", true));
//        queueService.addPatient(new Patient("a2", "b", "c", "d", false));
//        queueService.addPatient(new Patient("a2", "b", "c", "d", false));
//        queueService.addPatient(new Patient("a2", "b", "c", "d", true));
        System.out.println("lista pacjentow ");
        queueService.printPatientsList();
        System.out.println("dodajemy wizyty i umawiamy oczekujacych ");
        queueService.addFreeVisit(LocalDateTime.now());
        queueService.addFreeVisit(LocalDateTime.now());
        queueService.addFreeVisit(LocalDateTime.now());
        queueService.addFreeVisit(LocalDateTime.now());
        queueService.addFreeVisit(LocalDateTime.now());
        queueService.addFreeVisit(LocalDateTime.now());
        queueService.addFreeVisit(LocalDateTime.now());
        System.out.println("pozostale wolne wizyty ");
        queueService.checkFreeVisits();
        System.out.println("Czas pierwzej wolnej wizyty");
        queueService.nextVisitTime();
    }
}
