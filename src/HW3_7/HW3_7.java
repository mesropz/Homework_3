package HW3_7;

import java.util.ArrayList;

public class HW3_7 {
    public static void main(String args[]) {
        ArrayList<String> myColors=new ArrayList<String>();
        myColors.add("yellow");
        myColors.add("blue");
        myColors.add("green");
        myColors.add("black");
        myColors.add("silver");
        if(myColors.contains("black")){
            System.out.println(myColors);
        }
        else{
            System.out.println("No black!");
        }
    }
}
