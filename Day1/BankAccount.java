import java.util.Scanner;

public class BankAccount {

    int accountNumber;
    String accountHolderName;
    double accountBalance;

    BankAccount(int accountNumber, String accountHolderName, int accountBalance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.accountBalance=accountBalance;
    }
    public void deposit(double amount){
        accountBalance=accountBalance+amount;
    }
    public void withdraw(double amount){
        accountBalance=accountBalance-amount;
    }
    public void viewBalance(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Balance: "+accountBalance);
    }
    public static void main(String args[]){
        BankAccount account=new BankAccount(54644,"Surbhi",1000);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        int amt=sc.nextInt();
        account.deposit(amt);
        System.out.println("Enter the amount to withdraw:");
        amt=sc.nextInt();
        account.withdraw(amt);
        System.out.println("Your Balance is:");
        account.viewBalance();

    }


}
