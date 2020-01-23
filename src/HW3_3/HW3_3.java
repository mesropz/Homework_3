//3. insert an element into the array list at the first position.
package HW3_3;

import java.util.ArrayList;

public class HW3_3 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");

        myColors.add(0, "grey");

        System.out.println(myColors);



    }
}
