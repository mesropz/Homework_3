package HW3_6;

import java.util.ArrayList;

public class HW3_6 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("black");
        myColors.add("silver");
        System.out.println(myColors);
        myColors.remove(3);
        System.out.println(myColors);
    }
}
