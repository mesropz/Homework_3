//10. reverse elements in a array list.
package HW3_10;

import java.util.ArrayList;
import java.util.Collections;

public class HW3_10 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("black");
        myColors.add("silver");

        System.out.println("Array list: "+myColors);

        Collections.reverse(myColors);

        System.out.println("Array list after reverse: "+myColors);
    }
}
