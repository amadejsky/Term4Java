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

    public void addPatientToQue(Patient patient){
        patientsQueue.add(patient);
    }

    public void removePatientFromQue(Patient patient){
        patientsQueue.removeLastOccurrence(patient);
    }

    public Patient getNextPatient(){
        return patientsQueue.peek();
    }

    public Patient checkNextPatient(){
        return patientsQueue.poll();
    }

    public void addPatientAsFirst(Patient p){
        patientsQueue.offerFirst(p);
    }
    public void sendToAdditionalChecks(Patient p){
        patientsQueue.remove(p);
        if(patientsQueue.peekLast()!=null) {
            LocalTime lastvisit=(patientsQueue.peekLast().getVisitTime().plusMinutes(10));
            p.setVisitTime(lastvisit);
        }
        patientsQueue.offerLast(p);
    }

    public void printPatientList(){
        for(Patient p:patientsQueue)
            System.out.println(p);

        Iterator<Patient> iterator = patientsQueue.iterator();
        for(int i=0;iterator.hasNext();i++){
            System.out.println(i+": "+iterator.next());
        }
    }

    public LocalTime checkTimeOfLastPatient(){
        return patientsQueue.peekLast() != null ? patientsQueue.peekLast().getVisitTime():null;
    }
}
