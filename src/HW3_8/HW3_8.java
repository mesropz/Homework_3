package HW3_8;

import java.util.ArrayList;
import java.util.Collections;

public class HW3_8 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("black");
        myColors.add("silver");
        myColors.add("aaaaaa");
        Collections.sort(myColors);
        System.out.println(myColors);
    }

}
