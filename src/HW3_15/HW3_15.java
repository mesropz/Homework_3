//15. empty an array list.
package HW3_15;

import java.util.ArrayList;

public class HW3_15 {
    public static void main(String args[]) {
        ArrayList<String> myColors = new ArrayList<String>();
        myColors.add("yellow");
        //myColors.add("blue");
        myColors.add("green");
        myColors.add("blauck");
        myColors.add("silver");

        myColors.clear();
        System.out.println(myColors);
    }
}
