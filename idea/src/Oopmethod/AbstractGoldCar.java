package idea.src.Oopmethod;

public class AbstractGoldCar extends AbstractCard {
    @Override
    public void pay(double money2) {
        System.out.println("you need to pay" + money2);// 300
        System.out.println("your card money is:" + getMoney());// 5000
        double rs = money2 * 0.8;
        System.out.println("now need to pay" + rs);// 240
        setMoney(getMoney() - rs);// 4760

    }
}
