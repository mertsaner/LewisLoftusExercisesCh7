
public class RationalTester {   //Driver class
    //--------------------------------------------------------------------------------
    //  Creates some rational number objects and performs various operations on them.
    //--------------------------------------------------------------------------------
    public static void main (String[] args){
        RationalNumber r1 = new RationalNumber(6,8);
        RationalNumber r2 = new RationalNumber(1,3);
        RationalNumber r3, r4, r5, r6, r7;

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        r1.setComparable(4);
        r2.setComparable(4);


        public void comparable (RationalNumber number, RationalNumber number2)
        {
            if((number.numerator/number.denominator) > (number2.numerator/number2.denominator))
            {
                System.out.println(number + " is bigger than " + number2 );
            }
            else if ((number.numerator/number.denominator) == (number2.numerator/number2.denominator)) {
                System.out.println(number + " is equal to " + number2);
            }
            else
                System.out.println(number2 + " is bigger than " + number );
        }


        comparable(r1, r2);

        if (r1.isLike(r2))
            System.out.println("r1 and r2 are equal.");
        else
            System.out.println("r1 and r2 are NOT equal.");

        r3 = r1.reciprocal();
        System.out.println("The reciprocal of r1 is: " + r3);

        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);

        System.out.println("r1 + r2: " + r4);
        System.out.println("r1 - r2: " + r5);
        System.out.println("r1 * r2: " + r6);
        System.out.println("r1 / r2: " + r7);
    }
}