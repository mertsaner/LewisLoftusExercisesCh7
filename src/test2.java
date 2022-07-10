public class test2 {

    public static void main(String[] args) {

        //int a = 26.4; // gives compile error
        int a = (int) 26.4; // gives 26
        double b = a; // gives 26.0
        double c = (double) a; // also gives 26.0


        System.out.println("a is:" + a);
        System.out.println("b is:" + b);
        System.out.println("c is:" + c);
    }
}
