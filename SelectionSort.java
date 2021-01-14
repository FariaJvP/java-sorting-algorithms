import java.util.Arrays;

public class SelectionSort {

    public int[] createRandomNumbers(int positions, int quantity)
    {
        int[] randomNumbers = new int[positions];
        for(int i = 0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = 1 + (int)(Math.random()*quantity);
        }
        return randomNumbers;
    }

    public static int smallestValue(int[] array, int begin, int end)
    {
        int current = begin;
        for(int i = current; i < end; i++)
        {
            if(array[i] < array[current])
            {
                current = i;
            }
        }
        return current;
    }

    public static void selectionSort(int[] array)
    {
        for (int j = 0; j < array.length; j++)
        {
            int smallest = smallestValue(array, j, array.length);
            int currentValue = array[j];
            int smallestValue = array[smallest];

            array[j] = smallestValue;
            array[smallest] = currentValue;
        }
    }

    public static void main(String[] args)
    {
        SelectionSort random = new SelectionSort();
        int[] x = random.createRandomNumbers(30,250);
        System.out.println(Arrays.toString(x));

        selectionSort(x);
        System.out.println(Arrays.toString(x));
    }
}