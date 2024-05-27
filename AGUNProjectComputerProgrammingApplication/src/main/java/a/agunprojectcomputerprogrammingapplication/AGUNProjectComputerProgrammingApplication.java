
package a.agunprojectcomputerprogrammingapplication;

import java.util.Scanner;

public class AGUNProjectComputerProgrammingApplication {

    public static void main(String[] args) {
        try {
            System.out.println("W E L C O M E  T O  O U R   S Y S T E M");
            Thread.sleep(1500);
            System.out.println("              M A B U H A Y");
             System.out.println("---------------------------------------");
             Thread.sleep(1500);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter First Name:");
            String Fname = scan.nextLine();
            System.out.println("----------------------");
            Thread.sleep(1500);
            System.out.println("Enter Last Name:");
            String Lname = scan.nextLine();
            System.out.println("----------------------");
            Thread.sleep(1500);
            System.out.println("Enter Phone Number:");
            String Pphone = scan.nextLine();
            while( !(Pphone.length() == 11)){
                Thread.sleep(1500);
                System.out.println("Please input 11-Numbers");
                System.out.println("Enter Phone Number:");
                Pphone = scan.nextLine();
            }
            System.out.println("----------------------");
            Thread.sleep(1500);
            System.out.println("Enter Password:");
            String Ppass = scan.nextLine();
            System.out.println("----------------------");
            Thread.sleep(2000);
            Form form = new Form (Fname,Lname,Pphone,Ppass);
            form.username();
            form.Confirm();
        } catch (InterruptedException ex) {
            System.out.println("Please Try Again");
        }
            }
}
