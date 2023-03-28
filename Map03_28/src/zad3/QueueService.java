package zad3;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class QueueService {
    private Queue<LocalDateTime> freeVisit;
    private Queue<Patient> patients;

    public QueueService(){
        freeVisit = new LinkedList<>();
        patients = new LinkedList<>();
    }

    private void checkIfCanBeConsumed(){
        if(freeVisit.peek()!=null&&patients.peek()!=null){
            LocalDateTime
        }
    }
}
