package HW3_1;
//1. create a new array list, add some colors (string) and print out the collection----------------

import java.util.ArrayList;

public class HW3_1 {
    public static void main(String[] args) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");

        System.out.println(myColors);
    }
}
