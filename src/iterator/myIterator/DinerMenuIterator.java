package iterator.myIterator;

import iterator.MenuItem;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem item = menuItems[position];
        position++;
        return item;
    }

}
