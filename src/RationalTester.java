
public class RationalTester {   //Driver class
    //--------------------------------------------------------------------------------
    //  Creates some rational number objects and performs various operations on them.
    //--------------------------------------------------------------------------------
    public static void main (String[] args){
        RationalNumber r1 = new RationalNumber(6,8);
        RationalNumber r2 = new RationalNumber(1,3);
        RationalNumber r3, r4, r5, r6, r7;



        //r1.setComparable(4);
        //r2.setComparable(4);

        RationalNumber.comparable(r1, r2);

        r3 = r1.reciprocal();

        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);
        RationalNumber.comparable(r1, r2);
        System.out.println("The reciprocal of r1 is: " + r3);
        RationalNumber.comparable(r1, r3);
        RationalNumber.comparable(r2, r3);

        System.out.println("r1 + r2 is  " + r4 + " called r4");
        System.out.println("r1 - r2 is  " + r5 + " called r5");
        System.out.println("r1 * r2 is  " + r6 + " called r6");
        System.out.println("r1 / r2 is  " + r7 + " called r7");


        RationalNumber.comparable(r4, r5);
        RationalNumber.comparable(r6, r7);
    }
}