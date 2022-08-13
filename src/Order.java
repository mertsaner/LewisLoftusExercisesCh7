/** JAVA LEWIS & LOFTUS EX 7.15
 *  @author mertsaner
 * This java file defines what each method of Order class does
 * */
public class Order {

    private String OrderName;
    private String OrderType;
    private double OrderPrice;
    private String OrderPreparationTime;
    private String OrderIngredients;

    //Constructor
    public Order(String OrderName, String OrderType, double OrderPrice, String OrderPreparationTime, String OrderIngredients) {
        this.OrderName = OrderName;
        this.OrderType = OrderType;
        this.OrderPrice = OrderPrice;
        this.OrderPreparationTime = OrderPreparationTime;
        this.OrderIngredients = OrderIngredients;
    }


    //Accessors and Mutators
    public String getOrderName() {return OrderName;}
    public void setOrderName(String OrderName){this.OrderName = OrderName;}

    public String getOrderType() {return OrderType;}
    public void setOrderType(String OrderType) {this.OrderType = OrderType;}

    public double getOrderPrice() {return OrderPrice;}
    public void setOrderPrice(double OrderPrice){this.OrderPrice = OrderPrice;}

    public String getOrderPreparationTime() {return OrderPreparationTime;}
    public void setOrderPreparationTime(String OrderPreparationTime) {this.OrderPreparationTime = OrderPreparationTime;}

    public String getOrderIngredients() {return OrderIngredients;}
    public void setOrderIngredients(String OrderIngredients) {this.OrderIngredients = OrderIngredients;}
    //


    @Override
    public String toString() {
        return "Order{" +
                "OrderName='" + OrderName + '\'' +
                ", OrderType='" + OrderType + '\'' +
                ", OrderPrice=" + OrderPrice +
                ", OrderPreparationTime=" + OrderPreparationTime +
                ", OrderIngredients='" + OrderIngredients + '\'' +
                '}';
    }
}
