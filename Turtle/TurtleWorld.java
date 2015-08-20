import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        turtle.turnRight();
        turtle.forward(50);
        turtle.turn(135);
        turtle.forward(25);
        turtle.turnLeft();
        turtle.forward(100);
        turtle.turnRight();
        turtle.forward(20);
        turtle.turnRight();
        turtle.forward(100);
        turtle.turnLeft();
        turtle.forward(25);
    }
}
