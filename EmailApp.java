package emailapp;

public class EmailApp {
    public static void main(String[] args){

        Email emailTest = new Email("Jane","Doe");

        emailTest.setAlternateEmail("janed@gmail.com");
        emailTest.changePassword("jAne103091#%");


        System.out.println(emailTest.showInfo());
    }
}
