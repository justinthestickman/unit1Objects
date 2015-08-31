import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int num = generator.nextInt(6);
        System.out.println(num);
    }
}