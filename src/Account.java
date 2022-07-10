import java.io.Serial;
// This is my version of Account Java
public class Account {

    private String AccountName;
    //  All initializations are primitive data types
    // We will see in some cases, our data types will be objects
    private int AccountNumber; //const could be used
    private double balance;
    final double RATE = 0.035;

    public Account (String name, int AccountNumber, double initialBalance){ //Constructor
        AccountName = name;
        this.AccountNumber = AccountNumber;  //this. almost always in left hand side
        //AccountNumber = AccountNumber2; //or this.AccountNumber = AccountNumber;
        balance = initialBalance;
    }

    public double deposit (double deposit){
        balance = balance + deposit;
        //New Value of deposit equals this deposit(deposit amount entered) + earlier deposit
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double withdrawAmount, double fee){
        balance = balance - withdrawAmount - fee;
        return balance;
    }

    public void addInterest() {
        balance =  balance + (balance * RATE);
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountName='" + AccountName + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", balance=" + balance +
                '}';
    }
}