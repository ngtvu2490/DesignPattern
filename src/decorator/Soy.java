package decorator;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO 自動生成されたメソッド・スタブ
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        // TODO 自動生成されたメソッド・スタブ
        return 0.15 + beverage.cost();
    }

}
