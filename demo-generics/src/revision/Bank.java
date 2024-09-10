package revision;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
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
        bank.add(new SavingAccount());
    }
}