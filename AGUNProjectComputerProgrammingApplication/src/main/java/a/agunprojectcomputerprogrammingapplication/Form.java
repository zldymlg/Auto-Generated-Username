package a.agunprojectcomputerprogrammingapplication;

import java.util.Scanner;

public class Form {
    private String Fname;
    private String Lname;
    private String Pphone;
    private String Ppassword;
    private String Username;

    public Form(String Fname, String Lname, String Pphone, String Ppassword) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Pphone = Pphone;
        this.Ppassword = Ppassword;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getPphone() {
        return Pphone;
    }

    public void setPphone(String Pphone) {
        this.Pphone = Pphone;
    }

    public String getPpassword() {
        return Ppassword;
    }

    public void setPpassword(String Ppassword) {
        this.Ppassword = Ppassword;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void username() {
        int Usernamef3 = Lname.length();
        int Usernamef1 = Lname.length() - 3;
        Username = Fname.substring(0, 3) + Lname.substring(Usernamef1, Usernamef3) + Pphone.substring(0, 3);
        System.out.println("Your username will be ||"+Username+ "||");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("System Error 104");
        }
        
    }
    public void password (){
        Scanner scan = new Scanner (System.in); 
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------");
          System.out.print("Please input your username:");
        String uUsername = scan.nextLine();
        
         System.out.print("Please input your password:");
        String uPassword = scan.nextLine();

             while (!Username.equals(uUsername) || !Ppassword.equals(uPassword)) {
            System.out.println("----------------------");
            System.out.println("Invalid username or password. Please try again.");
            System.out.print("Please input your username:");
            uUsername = scan.nextLine();
            System.out.print("Please input your password:");
            uPassword = scan.nextLine();
        }
             System.out.print("Log-In Succesfully");
    }
    
       void Confirm(){
           Scanner scan = new Scanner (System.in); 
           System.out.println("Do you want to Continue?");
           String UserInput = scan.nextLine();
           if (UserInput.equalsIgnoreCase("confirm") || UserInput.equalsIgnoreCase("yes")){
               
               password();
    } else {
               System.out.println("Thank you for registering");
           }
}
}
