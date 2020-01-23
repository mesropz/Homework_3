package HW3_13;

import java.util.ArrayList;
import java.util.Collections;

public class HW3_13 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("blauck");
        myColors.add("silver");
        ArrayList<String> anotherColors=new ArrayList<String>();
        anotherColors.add("GREEN");
        anotherColors.add("PURPLE");
        anotherColors.add("PINK");
        anotherColors.add("WHITE");
        anotherColors.add("GOLD");


        System.out.println("ArrayList: "+myColors);
        myColors.addAll(anotherColors);
        System.out.println("ArrayList after swap: "+myColors);

    }
}
