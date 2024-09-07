package demo-generics.src.revision;

// Saving Account -> prefix "001"
// The first saving account -> "0010001"
// The second saving account -> "0010002"
// Commerical Account -> prefix "002"
// The first Commerical account -> "0020003"
// The second Commerical account -> "0020004"
public class SavingAccount extends Account {
    public static final String ACC_PREFIX = "001";

    public SavingAccount() {
        super(ACC_PREFIX);
    }

    // @Override
    // public double getBalance() {
    // if (super.getBalance() > 1_000_000)
    // System.out.println("The balance > 1,000,000.");
    // return super.getBalance();
    // }
}