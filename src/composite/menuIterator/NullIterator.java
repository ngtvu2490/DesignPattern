package composite.menuIterator;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

    public boolean hasNext() {
        return false;
    }

    public MenuComponent next() {
        return null;
    }

}
