package HW3_5;

import java.util.ArrayList;

public class HW3_5 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");

        System.out.println(myColors);
        myColors.set(1, "brown");
        System.out.println(myColors);
    }
}
