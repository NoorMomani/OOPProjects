package BankingSystem;

public class Account {
    String accId;
    double balance;
    Customer owner;

    public Account(String accId, double balance, Customer owner) {
        this.accId = accId;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public void deposit(double amount){
        if(amount > 0 ) {
            balance += amount;
        }
    }
    public boolean withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    public String toString(){
        return "Account{" +
                "accountId='" + accId + '\'' +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }


}
