import java.awt.Color;

public class Turtle2
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Turtle turtle4 = new Turtle(turtleWorld);
        Turtle turtle5 = new Turtle(turtleWorld);
        turtle3.turn(270);
        turtle3.forward(100);
        turtle4.turn(90);
        turtle4.forward(100);
        turtle1.setPenColor(Color.RED);
        turtle1.penDown();
        turtle1.forward(100);
        turtle2.setPenColor(Color.BLUE);
        turtle2.penDown();
        turtle2.backward (100);
        turtle3.setPenColor(Color.GREEN);
        turtle3.penDown();
        turtle4.setPenColor(Color.GRAY);
        turtle4.penDown();
        turtle5.setPenColor(Color.BLACK);
        turtle5.penDown();
        turtle5.setPenWidth(3);
        
        for(int i=1; i<100; i++)
        {
            turtle2.forward(100); 
            turtle2.turn(130);
            turtle1.backward(100);
            turtle1.turn(40);
            turtle4.forward(100);
            turtle4.turn(89);
        }
        
        for(int z=1; z<2000; z++)
        {
            turtle3.forward(300);
            turtle3.turn(75);
            turtle5.forward(z/20);
            turtle5.turn(20);
            turtle2.forward(z/10);
            turtle2.turn(20);
            turtle1.forward(z/20);
            turtle1.turn(7);
        }
    }
}
