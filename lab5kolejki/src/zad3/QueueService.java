package zad3;

import java.time.LocalDateTime;
import java.util.*;

public class QueueService {
    private Queue<LocalDateTime> freeVisits;
    private Queue<Patient> patients;

    public QueueService() {
        freeVisits = new LinkedList<>();
        patients= new PriorityQueue<>(Comparator.comparing(Patient::isVip).reversed());
    }
    //Jeżeli jest dostępny termin oraz w kolejce czeka pacjent należy zapisać danego
    //pacjenta na wolny termin wyświetlając odpowiednią informację na konsoli.
    private void checkIfCanBeConsumed() {
        if (freeVisits.peek() != null && patients.peek() != null) {
            LocalDateTime visit = freeVisits.poll();
            Patient patient = patients.poll();
            System.out.println("Patient " + patient + " is scheduled on " + visit);
        }
    }

    public void addFreeVisit(LocalDateTime freeVisit){
        freeVisits.offer(freeVisit);
        checkIfCanBeConsumed();

    }

    private void addFreeVisits(List<LocalDateTime> newVisits){
        for(LocalDateTime ldt:newVisits)
            addFreeVisit(ldt);
    }

    public void addPatient(Patient patient){
        patients.offer(patient);
        checkIfCanBeConsumed();
    }

    public void removePatient(Patient patient){
        patients.remove(patient);
    }

    public void removeVisit(LocalDateTime visit){
        freeVisits.remove(visit);
    }

    public LocalDateTime nextVisitTime(){
        return freeVisits.peek();
    }

    public void checkFreeVisits(){
        for(LocalDateTime visit: freeVisits)
            System.out.println(visit);
    }

    public void printPatientsList(){

        Iterator<Patient> iterator = patients.iterator();
        for(int i=0;iterator.hasNext();i++){
            System.out.println(i+" "+iterator.next());
        }
    }
    //- Dodanie przez lekarza nowych dostępnych godzin (LocalDateTime) (przy dodawaniu
    //każdej godziny, jeśli jest oczekujący pacjent zapisz go na tę godzinę)
}
