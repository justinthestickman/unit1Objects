import java.awt.Color;

public class TurtleWorld
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setColor(Color.GREEN);
        turtle.setShellColor(Color.GREEN);
        turtle.setPenColor(Color.BLUE);
        turtle.setPenWidth(5);
        turtle.penDown();
        int steps = 0;
        for (int counter = 1; counter <= 50; counter++)
        {
            steps = steps + 5;
            turtle.forward(steps);
            turtle.turn(45);
        }
    }
}
        