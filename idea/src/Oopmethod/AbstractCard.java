package idea.src.Oopmethod;

public abstract class AbstractCard {
    private String name;
    private double money;

    public abstract void pay(double money2);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
