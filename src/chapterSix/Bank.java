package chapterSix;//package chapterSix;

import chapterSix.Account;

public class Bank {
    public static void main(String[] args) {
        Account increaseAccount = new Account("Increase Lois");
    Account mjAccount = new Account("chinonso N");

    System.out.printf("Increase initial balance is",+ increaseAccount.getBalance());
       System.out.println("MJ initial balance is"+mjAccount.getAccountName());

        increaseAccount.withdraw(43_000);
   }
}
