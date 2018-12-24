package decorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO 自動生成されたメソッド・スタブ
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        // TODO 自動生成されたメソッド・スタブ
        return 0.10 + beverage.cost();
    }

}
