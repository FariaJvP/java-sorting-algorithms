import java.util.Arrays;

public class InsertionSort
{
    public int[] createRandomNumbers(int positions, int quantity)
    {
        int[] randomNumbers = new int[positions]; //creates an array with N positions
        for(int i = 0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = 1 + (int)(Math.random()*quantity);
        }
        return randomNumbers;
    }

    public int[] sort(int[] array, int end)
    {
        for(int current = 1; current < end; current++)
        {
            int analyzing = current;
            while ( analyzing > 0 && array[analyzing] < array[analyzing - 1] )
            {
                int analyzed = array[analyzing];
                int leftValue = array[analyzing -1];

                array[analyzing] = leftValue;
                array[analyzing-1] = analyzed;

                analyzing--;
            }
        }
        return array;
    }

    public static void main(String[] args)
    {
        InsertionSort random = new InsertionSort(); //instantiates an object to use the method
        int[] arrayOfRandomNumbers = random.createRandomNumbers(30,500); //assigns the result of the method to a variable
        System.out.println(Arrays.toString(arrayOfRandomNumbers)); //show original values

        InsertionSort insertionSort = new InsertionSort(); // instantiates an object to use the method
        int[] arrayOfSortedNumbers = insertionSort.sort(arrayOfRandomNumbers, arrayOfRandomNumbers.length); //assigns the result of to a variable
        System.out.println(Arrays.toString(arrayOfSortedNumbers)); //show sorted values
    }
}
