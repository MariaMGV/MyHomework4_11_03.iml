package loopsAndArrays;
import java.util.Scanner;



public class ArraysActions
{
    public static void main(String[] args)
    {

        System.out.println("task 1:");

        int[] myArray = initialiseArray(5);
        double[] myArray2 = new double[10];
        printTheArray(myArray);

        System.out.println("-----------------------------------------");

        System.out.println("task 2:");
        averageNumber(myArray2);

        System.out.println("\n-----------------------------------------");

        System.out.println("task 3:");
        int[] myArray3 = {1, 2, 3, 4};
        oddAndEvenTotalInArray(myArray3);

        System.out.println("-----------------------------------------");

        System.out.println("task 4:");
        int number = 5;
        printNumberN(number);

        System.out.println("-----------------------------------------");

        System.out.println("task 5:");
        printNumNotDivisible(10);

        System.out.println("-----------------------------------------");

        System.out.println("task 6:");
        System.out.println("Please, enter a number greater than 1 - it will be N. I will calculate the sum of first N elements from the Fibonacci sequence: ");
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
      while ( numN <= 0 )
      {
         System.out.println("Invalid entry! Please, try again - number has to be greater than 1:");
          numN = scanner.nextInt();
      }

      if(numN == 1)
      {
          System.out.println("The first number from Fibonacci sequence is 0");
      }
      else {
        int[] arrayFibonacci = makeFibonacciArray(numN);
        int sum = calculateSum(arrayFibonacci, numN);
        System.out.printf("Sum of the first %d numbers from Fibonacci sequence is %d ", numN, sum);
    }

    }
    public static int[] initialiseArray(int x)
    {
        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = i * x;
        }
        return  myArray;
    }
    public static void printTheArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.printf("Current index is : %d. Value is: %d\n", i, array[i]);
    }

    public static void averageNumber(double[] array)
    {
        double sumArrayValues = 0;
        for (double i = 0; i < array.length; i++)
        {
            double value = i * 5;
            sumArrayValues = sumArrayValues + value;


        }
        double average = sumArrayValues / array.length;
        System.out.printf("The average value of the array is: %f", average);

    }
   public static void oddAndEvenTotalInArray(int[] array)
   {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                sumEven += array[i];
            }
            else
            {
                sumOdd += array[i];
            }

        }
        int total = sumEven + sumOdd;
        System.out.printf("The sum of even numbers is: %d \n", sumEven);
        System.out.printf("The sum of odd numbers is: %d \n", sumOdd);
        System.out.printf("The total is: %d \n", total);
   }
   public static void printNumberN(int number)
   {
        int N = number * 1;
        for (int i = 1; i <= N; i++)
        {
            if (i < N)
            {
                System.out.printf("%d, ", i);

            }
            if (i == N) {
                System.out.printf("%d ", i);
            }
        }
        System.out.print("= with for loop");
        System.out.println(" ");

        int counter = 1;
        while (counter <= N)
        {
            System.out.printf("%d ", counter);
            counter++;
        }
        System.out.print("= with while loop");
        System.out.println(" ");
    }

    public static void printNumNotDivisible(int number)
    {
        int numN = number * 1;
        for (int i = 0; i <= numN; i++)
        {
            if (i % 3 != 0 && i % 7 != 0)
            {
                System.out.printf("%d ", i);
            }
        }
        System.out.println(" ");
    }
    public static int[] makeFibonacciArray(int numN)
    {

        int[] arrayFib = new int[numN];
        arrayFib[0] = 0;
        arrayFib[1] = 1;
        for (int i = 2; i < numN; i++)
        {
            arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];
        }
        return arrayFib;
    }
    public  static int calculateSum(int [] array,int nNumber)
        {
            int sum = 0;
            for (int i = 0; i < nNumber; i++)
            {
                sum += array[i];
            }
            return sum;
        }

}









