//14. clone an array list to another array list.
package HW3_14;

import java.util.ArrayList;

public class HW3_14 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        //myColors.add("blue");
        myColors.add("green");
        myColors.add("blauck");
        myColors.add("silver");

        ArrayList<String> myColorsClone=new ArrayList<String>();

        myColorsClone=(ArrayList<String>) myColors.clone();
        System.out.println(myColorsClone);

}}
