//***********************************************************************
//  Transactions.java                   Author: Lewis/Loftus
//
//  Demonstrates the creation and use of multiple Account objects.
//***********************************************************************

public class Transactions {
    //-------------------------------------------------------------------
    //  Creates some bank accounts and requests various services
    //-------------------------------------------------------------------
    public static void main(String[] args){ //Main method modified to use the new constructor
        Account acct1 = new Account("Ted Murphy", 72354, 102.56);   //Object named acct1 created from Account class
        Account acct2 = new Account("Jane Smith", 69713, 40.00);    //Object named acct2 created from Account class
        Account acct3 = new Account("Edward Demsey", 93757, 759.32);//Object named acct3 created from Account class

        Account acct4 = new Account("Mark Mark", 23421);
        Account first = new Account("Mert Saner", 72354);   //Object named first created from Account class
        Account second = new Account("Ali Veli", 69713);    //Object named second created from Account class
        Account third = new Account("Ayse Fatma", 93757);   //Object named third created from Account class

        acct1.deposit(25.85);

        double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith balance after deposit: " + smithBalance);
        System.out.println("Smith balance after withdrawal: " + acct2.withdraw (430.75, 1.50));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);

        System.out.println("");
        System.out.println("NEWLY CREATED ACCOUNTS");
        System.out.println(acct4);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}