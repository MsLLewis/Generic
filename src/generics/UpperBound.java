package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBound {

    /**
     *  Upper Bound (? extends Type)
     * Definition: Specifies that a wildcard can be any type that is a subclass of (or the same as) a specified type.
     * Keyword: extends
     * Purpose: Useful when you need to read data but don’t need to modify the collection.
     * Example Use Case: You have a method that works with a list of numbers (e.g., Integer, Double), and you don’t care about the exact type.
     *
     *
     */


    public void processList(List<? extends Number> list) {
        System.out.println("Processing the list: ");
        for(Number num : list){
            System.out.println(num);
        }
    }

}
