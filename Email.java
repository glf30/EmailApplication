package emailapp;

import java.util.Scanner;

public class Email {

    private String email;
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity = 500;
    private String altEmail;
    private int defaultPasswordLength = 10;
    private String company = "testcompany";



    // Constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Employee: " + this.firstName + " " + this.lastName);

        //Call a method asking for department and return it
        this.department = setDepartment();


        //call a method that returns a random pass
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //generate email
        if(department.equals("")){
            email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" +
                    company + ".com";
        } else {
            email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" +
                    department + "." + company + ".com";
        }



    }


    //Ask for department()
    private String setDepartment(){
        System.out.print("DEPT CODES: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");

        Scanner in = new Scanner(System.in);
        int dept = in.nextInt();

        if(dept == 1){
            return "sales";
        } else if(dept == 2){
            return "dev";
        } else if(dept == 3){
            return "acct";
        } else if(dept == 0){
            return "";
        } else {
            return "";
        }
    }



    //Generate a random pass
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i <length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }

        return new String(password);

    }


    //Change password

    //Set alternate email
    public void setAlternateEmail(String altEmail){
        this.altEmail = altEmail;
    }



    //set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public String getFirstname() {
        return firstName;
    }


    public String getLastname() {
        return lastName;
    }


    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + "" +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
