//12. Write a program of swap two elements in an array list.
package HW3_12;

import java.util.ArrayList;
import java.util.Collections;

public class HW3_12 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("blauck");
        myColors.add("silver");

        System.out.println("ArrayList: "+myColors);
        Collections.swap(myColors,1,4);
        System.out.println("ArrayList after swap: "+myColors);

    }}
