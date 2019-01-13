package template.sort;

import java.util.Arrays;

public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = { new Duck("Daffy", 8), new Duck("Deway", 2), new Duck("Howard", 7), new Duck("Louie", 2), new Duck("Donald", 10) };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        Arrays.stream(ducks).forEach(System.out::println);
    }

}
