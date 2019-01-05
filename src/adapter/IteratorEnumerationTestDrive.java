package adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {

    public static void main(String[] args) {

        if (args.length == 0) {
            args = new String[4];
            args[0] = "Tokyo";
            args[1] = "Osaka";
            args[2] = "Hokaido";
            args[3] = "Fukuoka";
        }

        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorEnumeration(arr.iterator());
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

}
