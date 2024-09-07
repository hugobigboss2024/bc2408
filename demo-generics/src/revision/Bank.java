package demo-generics.src.revision;

import java.util.LinkedList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new LinkedList<>();
    }

    public void add(Account account) {
        this.accounts.add(account);
    }

    public double sumOfBalance(AccountType type) {
        return -1.0;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        // Add Saving Account
        System.out.println(bank.sumOfBalance(AccountType.SAVING));
    }
}
