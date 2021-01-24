// Project Work
import java.util.*;
class PrintJob{
    int Job[], Newjob, Capacity, Front, Rear;
    PrintJob(){    // default constructor
        Capacity=20;
        Front=Rear=-1;
    }

    void createJob(){   // initializing the array
        Job=new int[Capacity];
    }

    void addJob(){ // taking input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter New Job");
        Newjob=sc.nextInt();
        if(Rear==Capacity-1)
            System.out.println("Printjob is fill, cannot add anymore.");
        else{
            if(Front==-1){
                Front=0;
            }
            Rear++;
            Job[Rear]=Newjob;
        }
    }

    void removeJob(){   //printing output
        if(Rear==-1 && Front==-1)
            System.out.println("Printjob is Empty");
        else if (Rear==Front){
            int k=Front;
            Front=-1;
            Rear=-1;
            System.out.println(Job[k]);
        }
        else
            System.out.println(Job[Front++]);
    }
    
    // main method
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        PrintJob obj=new PrintJob();
        int ch;
        obj.createJob();
        System.out.println("Enter 1 to add job");
        System.out.println("Enter 2 to remove job");
        System.out.println("Enter 0 to exit");
        do{
            ch=sc.nextInt();
            switch (ch){
                case 1:
                System.out.println("Add Job Selected");
                obj.addJob();
                break;
                case 2:
                System.out.println("Remove Selected");
                obj.removeJob();
                break;
                case 0:
                System.out.println("Exit Selected");
                break;
                default:
                System.out.println("Invalid Input");
            }
        }while(ch!=0);
    }
}