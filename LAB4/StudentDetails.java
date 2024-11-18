package LAB4;
public class StudentDetails {
 public static void main(String[] args) {

     String[] rollNumbers = {"2022F-BSE-238", "2022F-BSE-201", "2022F-BSE-291"};

     String[] datesOfBirth = {"1-NOV", "7-NOV", "14-NOV"};

     RollNumberThread rollThread = new RollNumberThread(rollNumbers);
     DateOfBirthThread dobThread = new DateOfBirthThread(datesOfBirth);

     rollThread.start();
     dobThread.start();

     try {
         rollThread.join();
         dobThread.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }

     System.out.println("All tasks completed!");
 }
}
