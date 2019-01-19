package composite.menuIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private double price;
    private boolean isVegetarian;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }

    Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

}
