// Question 2: Bank Account Management System
// Create a Java class BankAccount with the following specifications:
// •	Private attributes: accountNumber, balance
// •	Protected attribute: accountHolderName
// •	Public methods:
// o	deposit(double amount) to add money to the account
// o	withdraw(double amount) to deduct money (ensure sufficient balance)
// o	displayAccountDetails() to print account information
// Then create another class SavingsAccount that extends BankAccount and:
// •	Adds an interest rate field
// •	Provides a method calculateInterest()
// Demonstrate how access modifiers control visibility of variables in inheritance.
class BankAccount{
    private int accountNumber,balance;
    protected String accountHoldername;

     BankAccount(int number,String name){
        this.accountNumber=number;
        this.accountHoldername=name;
    }
    
    public void deposit(int amount){
        this.balance+=amount;
    }
    public void withdraw(int amount){
        //mimic to withdraw
        if(this.balance>=amount){
            this.balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void display(){
        System.out.printf("Balance is %d %n",this.balance);
    }

}
class Savingaccount extends BankAccount{
    int interest;
    int interestrate=7;
    
    Savingaccount(int number, String name){
        super(number, name);
    }
    
    void Calculateinterest(int amount,int time){
         interest=(amount*interestrate*time)/100;
        System.out.printf("Interest is %d",interest);    
    }
}
public class Accounts{
    public static void main(String[] args){
        BankAccount b=new BankAccount(123456,"John Doe");
        b.deposit(1000);
        b.withdraw(500);
        b.display();
        Savingaccount s=new Savingaccount(789012,"Jane Doe");
        s.Calculateinterest(1000, 2);
    }
}