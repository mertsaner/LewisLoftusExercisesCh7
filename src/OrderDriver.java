import java.util.Scanner;

public class OrderDriver {

        public static void main(String[] args) {        //DRIVER CLASS OF ORDER CLASS


            Order pizza = new Order("Margarita", "Main Menu", 23.99, "30 min", "Cheese, Whole Pizzabase, TomateSauce, Pepper, Garlic");
            Order Coke = new Order ("Coca-Cola", "Beverages", 5.99, "5 min", "Coca Cola (not disclosed)");
            Order russianSalad = new Order ("Russian Salad", "Special Items", 9.99, "15 min", "Potato, Carrot, Whole Eggs, Pickles, Can Peas, Beef slides(optional)");


            System.out.println("Menu of Mert in Hamburg with first Salary: ");
            System.out.println(pizza);
            System.out.println(Coke);
            System.out.println(russianSalad);

            double Bill = pizza.getOrderPrice() + Coke.getOrderPrice() + russianSalad.getOrderPrice();

            System.out.println("Total Bill to be Paid: " + Bill + " Euros ");
            System.out.println("Please enter to TIP Amount you would like leave: ");

            Scanner scan = new Scanner(System.in);
            double TIP = scan. nextDouble();

            System.out.println("Total Cost: " + (Bill+TIP) + " Euros");
            System.out.println("Would you like to pay credit Card?(cc) Or Cash(c)");
            Scanner scan2 = new Scanner(System.in);
            String input = scan2.nextLine();

            if(input.equals("c")) {
                System.out.println("Please pay " + (Bill + TIP) + " Euros" + " with your cash");
                System.out.println("Have a nice day, Sir!");
            }
            else if(input.equals("cc")) {
                System.out.println("Please pay " + (Bill + TIP) + " Euros" + " with your credit card");
                System.out.println("Have a nice day, Sir!");
            }
            else {
                System.out.println("Please pay " + (Bill + TIP) + " Euros");
                System.out.println("Have a nice day, Sir!");
            }
        }
}