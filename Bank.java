
public class Bank {
    private  String name;
    private int iD;
    private int pass;
    private static double totalAmount =5000;
    

    public Bank() {
    }

    public Bank(String name, int iD, int pass) {
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

    public static double getTotalAmount() {
        return totalAmount;
    }

    public static void setTotalAmount(double totalAmount) {
        Bank.totalAmount = totalAmount;
    }
    
    public Bank getObj(){
        Bank bracBank = new Bank();
        bracBank.getTotalAmount();
        bracBank.getName();
        return bracBank;
    }
    
    
    
    
    
 
       
    
    
    

   
}
