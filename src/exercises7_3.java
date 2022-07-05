public class exercises7_3 {     //EX7.1
    public static void main(String[] args) {

        int result = product (1,2,3,4);
        int result2 = product (1,2,3,4, 5);
        int result3 = product (1,2,3,4, 5,6);

        System.out.println("Product of four: " + result);
        System.out.println("Product of five: " + result2);
        System.out.println("Product of six: " + result3);
    }
    public static int product(int first, int second, int third, int fourth){
        return first*second*third*fourth;
    }

    //Method overloading
    public static int product(int first, int second, int third, int fourth, int five){
        return first*second*third*fourth*five;
    }

    //Method overloading
    public static int product(int first, int second, int third, int fourth, int five, int six){
        return first*second*third*fourth*five*six;
    }



}
