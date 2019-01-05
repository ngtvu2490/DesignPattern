package adapter;

import java.util.Random;

public class DuckAdapter implements Turkey {

    private Duck duck;
    private Random rand;

    public DuckAdapter(Duck duck, Random rand) {
        this.duck = duck;
        this.rand = rand;
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }

}
