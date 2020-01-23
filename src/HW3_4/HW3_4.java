//4. retrieve an element (at a specified index) from a given array list.
package HW3_4;

import java.util.ArrayList;

public class HW3_4 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add(0, "grey");

        String retriveElement=myColors.get(3);

        System.out.println(retriveElement);

    }
}
