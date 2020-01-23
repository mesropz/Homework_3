//17. replace the second element of a ArrayList with the specified element.
package HW3_17;

import java.util.ArrayList;

public class HW3_17 {

    public static void main(String args[]) {
        ArrayList<String> myColors = new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("black");
        myColors.add("silver");

        System.out.println(myColors);

        String newElement="BLACK";

        myColors.set(1,newElement);

        System.out.println(myColors);

    }
}
