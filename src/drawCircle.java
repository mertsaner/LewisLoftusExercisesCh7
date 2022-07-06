public class drawCircle {

    /**
    *   Draw a circle based on the method's parameters: a Graphics object through which to draw the circle,
     *   Two integer values representing the (x,y) coordinates of the center of the circle
    *   Another integer that represents the circle's raidus, and a Color object defines the circle's radius
     *   A Color object that defines the circle's color.
     *  The method doesn't return anything. ✅
     */
    public static void drawCircle(Graphics graph, int x, int y, int radius, Color color) {
        System.out.println("Program Started!");
    }

    public static void main (String [] args) {       //Driver of all
//        Graphics graph1 = new Graphics();
//        Color color1 = new Color();
//        drawCircle(graph1, color1);
            //OR
        drawCircle(new Graphics(),0,0,5, new Color("Blue"));
    }
}

class Color {
    private String color;
    public Color (String color){        //Constructor which initializes the objects
        this.color = color;
    }
}

class Graphics {
//    private int xValue;
//    private int yValue;
//    private int radius;

    public Graphics (){        //Constructor which initializes the objects
//        this.xValue = xValue;
//        this.yValue = yValue;
//        this.radius = radius;
    }
}


















