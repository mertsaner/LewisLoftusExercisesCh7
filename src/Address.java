//***********************************************************
//  Address.java    Author: Lewis/Loftus
//
//  Represents a street Address.
//***********************************************************

public class Address {
    private String streetAdress, city, state;
    private long zipCode;

    //------------------------------------------------------------
    // Constructor: Sets up this address with the specified data.
    //------------------------------------------------------------
    public Address(String street, String town, String st, long zip)
    {
        streetAdress = street;
        city = town;
        state = st;
        zipCode = zip;
    }

    //------------------------------------------------------------
    //  Returns a description of this Address object.
    //------------------------------------------------------------
    public String toString(){

        String result;

        result = streetAdress + "\n";
        result += city + "," + state + " " + zipCode;

        return result;
    }
}