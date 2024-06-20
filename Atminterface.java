import java.util.Scanner;
public class Atminterface 
{
        public static void main(String args[] )  
    {
        int balance = 68504, withdraw, deposit;
        while(true)
        { 
            Scanner sc = new Scanner(System.in);    
            System.out.println("         ATM         ");  
            System.out.println("Choose 1 for Cash Withdraw");  
            System.out.println("Choose 2 for Cash Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.println("Choose the operation "); 
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                    System.out.print("Enter money to be withdraw:");  
                    withdraw = sc.nextInt();    
                if(balance >= withdraw)  
                {    
                    balance = balance - withdraw;  
                    System.out.println("withdraw sucessfull");
                    System.out.println("Please collect your money ");  
                    System.out.println("Balance After withdraw " + balance);
                }  
                else  
                {   
                    System.out.println("Insufficient Balance");  
                }  
                break;  
                case 2:  
                    System.out.print("Enter money to be deposit:");   
                    deposit = sc.nextInt();  
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully depsit");  
                    System.out.println("money after deposit " + balance);
                break;  
                case 3:    
                    System.out.println("Balance : "+ balance);  
                break;  
                case 4:    
                    System.exit(0); 
            
            }
        }         
    }  
}  
