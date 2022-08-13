import java.util.ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        Collections.sort(fruits);

        //My method
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("fruits: " + (i + 1) + " : " + fruits.get(i));
        }

        //Auto Method
   //     int i=0;
   //     for(String temp: fruits){
   //         System.out.println("fruits " + ++i + " : " + temp);
   //     }


    }
}
