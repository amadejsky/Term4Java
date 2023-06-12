package zad2;

import java.time.LocalTime;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class PatientsQueue {
    private Deque<Patient> patientsQueue;

    public PatientsQueue() {
        patientsQueue = new LinkedList<>();
    }
    //program ma mieć następujące możliwości:
    //- Dodanie pacjenta do kolejki
    public void addPatientToQueue(Patient patient) {

        patientsQueue.add(patient);//lub offer
    }

    //- Usunięcie pacjenta z kolejki
    public void removePatientFromQueue(Patient patient) {

        patientsQueue.removeLastOccurrence(patient);
    }

    //- Pobranie informacji o następnym pacjencie w kolejce
    public Patient getNextPatient() {
       //pobieramy ale nie usuwamy - tylko podgladamy 1go w kolejce
        return patientsQueue.peek();
    }
    //- Przyjęcie kolejnego pacjenta w gabinecie
    public Patient checkNextPatient() {

        return patientsQueue.poll();
    }
    //- Dodanie pacjenta na początek kolejki (sytuacja kryzysowa)
    public void addPatientAsFirst(Patient patient) {

        patientsQueue.offerFirst(patient);
    }
    //- Skierowanie pacjenta na dodatkowe badania (przerzucenie pacjenta na koniec
    //kolejki)
    public void sendToAdditionalChecks(Patient patient) {
        patientsQueue.remove(patient);//usuwamy
        //zmieniamy mu czas na 10 min po ostatnim
        if (patientsQueue.peekLast()!=null){//jesli jest ostatni kolejka nie jest pusta
           LocalTime lastvisit=patientsQueue.peekLast().getVisitTime().plusMinutes(10);
            patient.setVisitTime(lastvisit);
        }
        patientsQueue.offerLast(patient);//przestawiamy na koniec

    }
    //- Wyświetlenie kolejki pacjentów
    public void printPatientsList() {
        for(Patient p :patientsQueue)
            System.out.println(p);
        //2 sposob
        Iterator<Patient> iterator = patientsQueue.iterator();
        for (int i = 0; iterator.hasNext(); i++) {
            System.out.println(i + ": " + iterator.next());
        }
    }
    //- Sprawdzenie informacji o planowanym końcu przyjmowania pacjentów (każdy
    //pacjent ma mieć informacje o godzinie przyjmowania.
    public LocalTime checkTimeOfLastPatient() {
        return patientsQueue.peekLast() != null ? patientsQueue.peekLast().getVisitTime() : null;
    }
}
