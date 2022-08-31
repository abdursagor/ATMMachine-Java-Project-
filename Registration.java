
import java.util.Scanner;


public class Registration {

    Scanner input = new Scanner(System.in);
    //static Registration[] regForm = new Registration[5];
    int i = 0;
    Bank oneBank = new Bank();
    //Registration reg = new Registration();

    private String name;
    private int iD;
    private int pass;

    public Registration() {
    }

    public Registration(String name, int iD, int pass) {
        this.name = name;
        this.iD = iD;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public void createID() {
        //String s = input.nextLine();
        System.out.print("Name : ");
        name = input.nextLine();
        System.out.print("ID : ");
        iD = input.nextInt();
        System.out.print("Password : ");
        pass = input.nextInt();
        //regForm[i].Name = name;
        //regForm[i].setiD(iD);
        //regForm[i].setPass(pass);
        System.out.println("REGISTRATION SUCCESSFULL");
        System.out.println("                        ");
    }

    /*public void setInfo(Registration reg) {
        this.regForm[i] = reg;
        i++;

    }*/
    public void logIn() {
        String s = input.nextLine();
        System.out.print("id :  ");
        int logiD = input.nextInt();
        System.out.print("pass :");
        int logPass = input.nextInt();
        if (pass == logPass && iD == logiD) {
            System.out.println("Log In Successfull");
            System.out.println("Welcome " + name);
            System.out.println("you have " + oneBank.getTotalAmount()+ " $");
            System.out.println("1. Deposit Money. ");
            System.out.println("2. Withdraw Money. ");
            System.out.println("3.Exit");
            System.out.println("                        ");
            int c = input.nextInt();
            if (c == 1) {
                System.out.println("How much money : ");
                int m = input.nextInt();
                oneBank.setTotalAmount(oneBank.getTotalAmount() + m);
                System.out.println("you have " + oneBank.getTotalAmount());

            } else if (c == 2) {
                System.out.println("How much money : ");
                int m = input.nextInt();
                if (m > oneBank.getTotalAmount()) {
                    System.out.println("Not enough Money. ");
                } else {
                    oneBank.setTotalAmount(oneBank.getTotalAmount() - m);
                }
                System.out.println("you have " + oneBank.getTotalAmount());

            }
        } else {
            System.out.println("Incorrect ID or Password");
            System.out.println("1.Do you want to create an ID .? ");
            System.out.println("2.Do you want to log in .? ");
            System.out.println("                        ");
            int a = input.nextInt();
            if (a == 2) {
                this.logIn();
            } else if (a == 1) {
                this.createID();
                System.out.println("1. Create your acount. ");
                System.out.println("2. Log in to your acount.");
                System.out.println("3. Exit. ");
                System.out.println("                        ");
                System.out.print("Type Your Choice : ");
                this.logIn();

            }

        }

    }

}
