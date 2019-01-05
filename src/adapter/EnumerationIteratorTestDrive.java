package adapter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {

    public static void main(String[] args) {

        if (args.length == 0) {
            args = new String[4];
            args[0] = "Happy";
            args[1] = "New";
            args[2] = "Year";
            args[3] = "2019";
        }

        Vector<String> v = new Vector<String>(Arrays.asList(args));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
