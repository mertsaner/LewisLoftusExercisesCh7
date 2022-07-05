public class exercises7_2 {     //EX7.1
    public static void main(String[] args) {

        int result = product (2,2,3,4);
        int result2 = product (2,2,3,4, 5);

        System.out.println("Result is " + result);
        System.out.println("Result is " + result2);

    }
    public static int product(int first, int second, int third, int fourth){
        return first*second*third*fourth;
    }

    //Method overloading
    public static int product(int first, int second, int third, int fourth, int five){
        return first*second*third*fourth*five;
    }




}
