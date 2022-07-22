package array;

public class SumArray
{

    public static void main(String[] args)
    {
        int array[] = {20, 10, 40, 130, 50};
        int sum = 0;

        for (int i= 0; i<array.length; i++)
        {
            sum += array[i];
        }

        System.out.println("Sum of array elements= " + sum);

    }
}

