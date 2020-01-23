//11. compare two array lists.

        package HW3_11;

import java.util.ArrayList;
import java.util.Collections;

public class HW3_11 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("black");
        myColors.add("silver");
        ArrayList<String> anotherColors=new ArrayList<String>();
        anotherColors.add("GREEN");
        anotherColors.add("PURPLE");
        anotherColors.add("PINK");
        anotherColors.add("WHITE");
        anotherColors.add("GOLD");
        System.out.println("Array list 1: "+myColors);
        System.out.println("Array list 2: "+anotherColors);

        if (myColors.equals(anotherColors)==true) {
            System.out.println("Two arrayLists are the same");
        }
        else{
            System.out.println("They are not equal");
        };
    }
}
