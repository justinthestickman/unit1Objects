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
        turtle2.setColor(Color.BLUE);
        turtle2.setShellColor(Color.BLUE);
        turtle2.setPenColor(Color.BLUE);
        turtle2.setPenWidth(5);
        turtle2.penDown();
        
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setColor(Color.RED);
        turtle3.setShellColor(Color.RED);
        turtle3.setPenColor(Color.RED);
        turtle3.setPenWidth(5);
        turtle3.penDown();
        turtle3.turn(180);
        
        int steps = 0;
        for (int counter = 1; counter <= 25; counter++)
        {
            steps = steps + 5;
            turtle1.forward(steps);
            turtle1.turn(45);
        }
    }
}
        