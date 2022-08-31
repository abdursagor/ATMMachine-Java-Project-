
import java.util.Scanner;

public class ATMMachine {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Registration reg = new Registration();
        Bank oneBank = new Bank();
        Bank bracBank ;  

        System.out.println("Welcome to ATM Booth ....!!");
        System.out.println();
        while (true) {
            System.out.println("1. Create your acount. ");
            System.out.println("2. Log in to your acount.");
            System.out.println("3. Exit. ");
            System.out.print("Type Your Choice : ");
            int choice = input.nextInt();
            if (choice == 1) {
                reg.createID();

            } else if (choice == 2) {
                reg.logIn();
                //reg.setInfo(reg);
                oneBank.setName(reg.getName());
                oneBank.setiD(reg.getiD());
                oneBank.setPass(reg.getPass());
                System.out.println("Do you want to banking with us : y(1)/n(0)");
                System.out.println("Type your Choice :");
                int c = input.nextInt();
                while (c == 1) {
                    System.out.println("1. Deposit Money. ");
                    System.out.println("2. Withdraw Money. ");
                    System.out.println("3.Exit");
                    int d = input.nextInt();
                    if (d == 1) {
                        System.out.print("How much money : ");
                        int m = input.nextInt();
                        oneBank.setTotalAmount(oneBank.getTotalAmount() + m);
                        System.out.println("you have " + oneBank.getTotalAmount()+ " $");

                    } else if (d == 2) {
                        System.out.print("How much money : ");
                        int m = input.nextInt();
                        if (m > oneBank.getTotalAmount()) {
                            System.out.println("Not enough Money. ");
                        } else {
                            oneBank.setTotalAmount(oneBank.getTotalAmount() - m);
                            System.out.println("you have " + oneBank.getTotalAmount() + " $");
                        }

                    } else if (d == 3) {
                        break;
                    }

                }

            } else {
                break;

            }
            

        }
        
        bracBank = oneBank.getObj();
    }
    

}
