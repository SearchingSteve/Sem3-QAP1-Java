// Author: Stephen Crocker
// Date: 09/18/2024 

package Account;
public class Account{

    // Instance variables
    private String id;
    private String name;
    private int balance = 0;

    // Account info no balance
    public Account(String id, String name){
        this.id = id;
        this.name = name;
        
    }

    // Account info with balance
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    // Getters
    // Get account ID
    public String getID(){
        return id;
    }

    // Get account name
    public String getName(){
        return name;
    }

    // Get account balance
    public int getBalance(){
        return balance;
    }

    // Setters
    // Add to account balance
    public int credit(int amount){
        balance += amount;
        return balance;
    }

    // Subtract from account balance
    public int debit(int amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer from one account to another
   public int transferTo(Account another, int amount){
        if(amount <= balance){
            balance -= amount;
            another.balance += amount;
            System.out.println("Transfer of $" + amount + " to " + another.getName() + " successful");
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }


    // Method to stringify account info
    public String toString(){
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
    
    
}