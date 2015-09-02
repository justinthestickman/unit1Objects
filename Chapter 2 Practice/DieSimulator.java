import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int num = generator.nextInt(6);
        num += 1;
        System.out.println(num);
        
        double num2 = Math.random();
        num2 *= 6;
        num2 += 1;
        System.out.println((int) num2);
    }
}