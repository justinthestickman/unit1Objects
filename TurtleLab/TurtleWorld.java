import java.awt.Color;

public class TurtleWorld
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.setColor(Color.BLUE);
        turtle1.setShellColor(Color.BLUE);
        turtle1.setPenColor(Color.BLUE);
        turtle1.setPenWidth(5);
        turtle1.penDown();

        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setColor(Color.RED);
        turtle2.setShellColor(Color.RED);
        turtle2.setPenColor(Color.RED);
        turtle2.setPenWidth(1);
        turtle2.penDown();
        
        int steps = 0;
        
        for (int counter = 1; counter <= 200; counter++)
        {
            steps += 1;
            turtle1.forward(steps);
            turtle1.turn(45);
        }
        for (int counter = 1; counter <= 360; counter++)
        {
            turtle2.forward(500);
            turtle2.turn(175);
        }
    }
}
        