package iterator.myIterator;

import java.util.ArrayList;

import iterator.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }
}
