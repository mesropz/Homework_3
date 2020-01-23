package HW3_9;

import java.util.ArrayList;
import java.util.Collections;

public class HW3_9 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("black");
        myColors.add("silver");
        myColors.add("aaaaaa");
        ArrayList<String> otherColors=new ArrayList<String>();
        otherColors.add("GREEN");
        otherColors.add("RED");
        otherColors.add("WHITE");

        System.out.println("ArrayList 1:"+myColors);
        System.out.println("ArrayList 2:"+otherColors);
        Collections.copy(myColors,otherColors);

        System.out.println("Copy of ArrayList:"+myColors);
    }
}
