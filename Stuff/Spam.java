import java.util.Random;

public class Spam
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        while (0 == 0)
        {
            for (int counter = 1; counter <= 10; counter++)
            {
                int num = generator.nextInt(100001);
                System.out.print(num);
            }
            int num = generator.nextInt(100001);
            System.out.println(num);
        }
    }
}