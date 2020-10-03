// Project Work
// progress
import java.util.*;
class PrintJob{
    int Job[], Newjob, Capacity, Front, Rear;
    PrintJob(){
        Capacity=20;
        Front=Rear=-1;
    }
    
    void createJob(){
        Job=new int[20];
    }
    
    void addJob(){
        if(Rear==Capacity-1)
            System.out.println("Printjob is fill, cannot add anymore.");
        else{
            if(Front==-1){
                Front=0;
            }
            
        }
    }
}