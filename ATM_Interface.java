import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;
class User_Account{
    int Account_Balance = 41000;
}
public class ATM_Interface {
    void withdrawl(){
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount1 = amount.nextInt();
        User_Account account = new User_Account();
        if (account.Account_Balance >= amount1){
            account.Account_Balance -= amount1;
            System.out.println("Debited Successfully. Your Total Balance is:"+account.Account_Balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void deposit(){
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount1 = amount.nextInt();
        User_Account account = new User_Account();
        account.Account_Balance += amount1;
        System.out.println("Credited Successfully. Your Total Balance is:"+account.Account_Balance);
    }

    void checkBalance(){
        User_Account account = new User_Account();
        System.out.println("Your Balance is:"+ account.Account_Balance);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 'W' for Cash Withdrawl");
        System.out.println("Type 'D' for Cash Deposit");
        System.out.println("Type 'C' for Checking Balance");

        char choice = sc.next().charAt(0);

        ATM_Interface obj = new ATM_Interface();

        switch(choice){
            case 'W':
            obj.withdrawl();
            break;   
            case 'D':
            obj.deposit();
            break;
            case 'C':
            obj.checkBalance();
            break;
            default:
            System.out.println("Invalid Choice");
            break;
        }
    }
}
