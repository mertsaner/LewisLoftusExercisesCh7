import java.util.Arrays;

public class SortFruitObject {

    public static void main(String[] args) {

        Fruit[] fruits = new Fruit [4];

        Fruit pineapple = new Fruit("Pineapple", "Pineapple description", 70);
        Fruit apple = new Fruit("Apple", "Apple description", 100);
        Fruit orange = new Fruit("Orange", "Orange description", 80);
        Fruit banana = new Fruit("Banana", "Banana descripiton", 90);

        fruits[0] = pineapple;
        fruits[1] = apple;
        fruits[2] = orange;
        fruits[3] = banana;

       // Arrays.sort(fruits);

        int i=0;
        for(Fruit temp: fruits){
            System.out.println("fruits" + ++i + " : " + temp.getFruitName() +
                    ", Quantity : " + temp.getQuantity());
        }
    }
}
