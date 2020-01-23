//16. test an array list is empty or not.
package HW3_16;

import java.util.ArrayList;

public class HW3_16 {
    public static void main(String args[]) {
        ArrayList<String> myColors = new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("blauck");
        myColors.add("silver");

        System.out.println(myColors);


        if(myColors.isEmpty()){
            System.out.println("arrayLsit is empty!");
        }
        else{
            System.out.println("arrayLsit is not empty!");

        }
    }
}
