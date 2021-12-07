package chapterSix;

public class Account {
    private  String accountName;
    private int balance;

    public Account(String accountName){
        this.accountName = accountName;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void deposit (int amount){
        balance=balance+amount;
    }
    public void withdraw(int amount){
        balance =balance-amount;
    }
}

