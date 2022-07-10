/**
 * Modified RationalNumber class so that it implements the Comparable interface.
 * To perform the comparison, it computes and equivalent floating point value from the
 * numerator and denominator for both RationalNumber objects, then compare them using tolerance
 * value of 0.0001.
 * Main modified according to changes
 * @Author
 */

public class RationalNumber implements Comparable {

    private float numerator, denominator;       //Types is changed to show decimal values

    //-----------------------------------------------------------------
    //  Constructor: Sets up the rational number by ensuring a nonzero
    //  denominator and making only the numerator signed.
    //-----------------------------------------------------------------
    public RationalNumber(float numer, float denom) {
        if( denom == 0)
            denom = 1;

        //  Make the numerator "store" the sign
        if (denom < 0) {
            numer = numer * -1;
            denom = denom * -1;
        }
        numerator = numer;
        denominator = denom;
        reduce ();
    }


    /**
     *
     *  To perform the comparison, it computes and equivalent floating point value from the
     *  * numerator and denominator for both RationalNumber objects, then compare them using tolerance
     *  * value of 0.0001.
     * @return
     */
    public static void comparable(RationalNumber number, RationalNumber number2)
    {
       if((number.numerator/number.denominator) > (number2.numerator/number2.denominator))
       {
           System.out.println(number + " is bigger than " + number2 );
       }
       else if ((number.numerator/number.denominator) == (number2.numerator/number2.denominator))
       {

           //System.out.println(number.numerator);
           //System.out.println(number.denominator);
     //      number.numerator = (float) number.numerator;
     //      number2.numerator = (float) number2.numerator;

           double result = (float) (number.numerator/number.denominator);
           System.out.println("Division result is: " + result);

           System.out.println((number.numerator/number.denominator));
           System.out.println(number2.numerator/number2.denominator);

           System.out.println(number + " is equal to " + number2);
       }
       else {
           System.out.println(number2 + " is bigger than " + number);
       }
    }

    //--------------------------------------------------------------------
    //  Returns the numerator of this rational number
    //--------------------------------------------------------------------
    public float getNumarator(){
        return numerator;
    }

    //--------------------------------------------------------------------
    //  Return the denominator of this rational number.
    //--------------------------------------------------------------------
    public float getDenominator(){
        return denominator;
    }

    public void setNumerator(float numerator){
        this.numerator = numerator;
    }
    public void setDenominator(float denominator){
        this.denominator = denominator;
    }


    //--------------------------------------------------------------------
    //  Returns the reciprocal of this rational number
    //--------------------------------------------------------------------
    public RationalNumber reciprocal(){ //RationalNumber here identifies return type
        return new RationalNumber(denominator, numerator);      //It returns newly created instance of the class RationalNumber
    }

    //--------------------------------------------------------------------
    // Adds this rational number to the one passed as a parameter
    // A common denominator is found by multiplying the individual denominators
    //--------------------------------------------------------------------
    public RationalNumber add(RationalNumber op2) //add function take op2 object as a input value
    {
        float commonDenominator = denominator * op2. getDenominator();
        float numerator1 = numerator * op2.getDenominator();
        float numerator2 = op2.getNumarator() * denominator;
        float sum = numerator1 + numerator2;

        return new RationalNumber(sum, commonDenominator); //returns newly created instance of the class RationalNumber
    }

    //---------------------------------------------------------------------
    //  Subtracts the rational number passed as a parameter from this
    // Rational number.
    //----------------------------------------------------------------------
    public RationalNumber subtract(RationalNumber op2){
        float commonDenominator = denominator * op2.getDenominator();
        float numerator1 = numerator * op2. getDenominator();
        float numerator2 = op2.getNumarator() * denominator;
        float difference = numerator1 - numerator2;

        return new RationalNumber(difference, commonDenominator);

    }

    //----------------------------------------------------------------------
    //  Multiplies this rational number by the one passed as a parameter.
    //----------------------------------------------------------------------
    public RationalNumber multiply(RationalNumber op2){
        float numer = numerator * op2.getNumarator();
        float denom = denominator * op2.getDenominator();

        return new RationalNumber(numer, denom);
    }

    //----------------------------------------------------------------------
    //  Divides this rational number by the one passed as a parameter
    //  by multiplying by the reciprocal of the rational.
    //----------------------------------------------------------------------
    public RationalNumber divide(RationalNumber op2){
        return multiply(op2.reciprocal());
    }

    //-----------------------------------------------------------------------
    // Determines if this rational number is equal to the one passed as a parameter.
    // Assume they are both reduced.
    //------------------------------------------------------------------------
    public boolean isLike(RationalNumber op2){
        return (numerator == op2.getNumarator() && denominator == op2.getDenominator());
    }

    //----------------------------------------------------------------------------
    // Return this rational number as a string
    //----------------------------------------------------------------------------
    public String toString(){
        String result;
        if (numerator == 0)
            result = "0";
        else
        if (denominator == 1)
            result = numerator + "";
        else
            result = numerator + "/" + denominator;
        return result;
    }

    //-------------------------------------------------------------------------------
    // Reduces this rational number by dividing both the numarator
    // and the denominator by their greatest common divisor.
    //-------------------------------------------------------------------------------
    private void reduce ()
    {
        if (numerator != 0) {
            float common = gcd(Math.abs(numerator), denominator);

            numerator = numerator / common;
            denominator = denominator / common;
        }
    }

    //----------------------------------------------------------------------------------
    //   Computes and returns the greatest common divisor of the two positive parameters.
    //   positive parameter. Uses Euclid's algorithm.
    //----------------------------------------------------------------------------------
    public float gcd(float num1, float num2){        //If is declared private then no other method can reach it from other classes
        while (num1 != num2)                   // Since it is non-static method we cannot make direct call like in the static methods
            if (num1 > num2)                    //We create instance of the class and then call it
                num1 = num1 - num2;
            else
                num2 = num2 - num1 ;
        return num1;
    }

//    @Override
//    public void setComparable(int comparable) {
//
//    }
//
//    @Override
//    public int getComparable() {
//        return 0;
//    }
}