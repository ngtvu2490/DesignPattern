package iterator.cafeMenu;

import java.util.Calendar;
import java.util.Iterator;

import iterator.MenuItem;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem item = items[position];
        position += 2;
        return item;
    }

    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
