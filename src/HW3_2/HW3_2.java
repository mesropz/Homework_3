//2. iterate through all elements in a array list
package HW3_2;
import java.util.ArrayList;


public class HW3_2 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");

        for(int i=0; i<myColors.size();i++){
            String name;
            name=myColors.get(i);
            System.out.println(name);
        }
    }
}
