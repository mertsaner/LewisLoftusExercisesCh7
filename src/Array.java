import java.util.Arrays;
//This program sorts an array

public class Array {
    public static void main(String[] args) {

        String[] fruits = new String[]{"Pineapple", "Apple", "Orange", "Banana"};
        Arrays.sort(fruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits: " + (i+1) + " : " + fruits[i]);
        }
    }
}

//Outcome will be;
//fruits 1 : Apple
//fruits 2 : Banana
//fruits 3 : Orange
//fruits 4 : Pineapple
