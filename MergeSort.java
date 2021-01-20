import java.util.Arrays;

public class MergeSort
{
    public int[] createRandomNumbers(int positions, int quantity)
    {
        int[] randomNumbers = new int[positions];
        for(int i = 0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = 1 + (int)(Math.random()*quantity);
        }
        return randomNumbers;
    }

    private static void merge(int[] values, int begin, int mid, int end)
    {
        int[] result = new int[values.length];

        int current = 0;
        int current1 = begin;
        int current2 = mid;

        while (current1 < mid && current2 < end)
        {
           int value1 = values[current1];
           int value2 = values[current2];
           if (value1 < value2)
           {
               result[current] = value1;
               current1++;
           }
           else
           {
               result[current]= value2;
               current2++;
           }
           current++;
        }
        while (current1 < mid)
        {
            result[current] = values[current1];
            current1++;
            current++;
        }
        while (current2 < end)
        {
            result[current]=values[current2];
            current2++;
            current++;
        }
        if (current >= 0) System.arraycopy(result, 0, values, begin, current);
    }

    private static void mergeSort(int[] values, int begin, int end)
    {
        int quantity = end - begin;
        if (quantity > 1)
        {
            int half = (begin + end) / 2;

            mergeSort(values,begin,half);
            mergeSort(values,half,end);
            merge(values, begin, half, end);
        }
    }

    public static void main(String[] args)
    {
        MergeSort random = new  MergeSort();
        int[] x = random.createRandomNumbers(30,250);
        System.out.println(Arrays.toString(x));

        mergeSort(x, 0, x.length);
        System.out.println(Arrays.toString(x));
    }
}
