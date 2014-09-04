import java.util.Random;

public class NumberGenerator
{
    public static void main(String[] args)
    {
        Random bradley = new Random();
        int rohit = bradley.nextInt(6) + 1;
        System.out.println(rohit);
    }}