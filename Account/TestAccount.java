// Author: Stephen Crocker
// Date: 09/18/2024 

package Account;

public class TestAccount {
    
    public static void main(String[] args) {
        //a. Acc1 with balance of $5000 and Acc2 with balance of $4000 by using 
        //parameterised constructors defined in Account class.
        Account Acc1 = new Account("A1", "John", 5000);
        Account Acc2 = new Account("A2", "Jane", 4000);
        
        //b. Display balance of both accounts using getBalance() method.
        System.out.println("\n"+"Account1 Balance: $" + Acc1.getBalance());
        System.out.println("Account2 Balance: $" + Acc2.getBalance());
        
        //c. Transfer $1000.00 from account 1 to account 2.
        Acc1.transferTo(Acc2, 1000);

        //d. Display balance of both accounts using getBalance() method again.
        System.out.println("Account1 Balance: $" + Acc1.getBalance());
        System.out.println("Account2 Balance: $" + Acc2.getBalance()+"\n");

    }
}
