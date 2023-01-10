import java.util.Arrays;
import java.util.Random;

public class ArrayChallange {
    public static void main(String[] args) {
       // int[] unsortedarray=getRandomArray(5);
       // System.out.println(Arrays.toString(unsortedarray));

        int[] sortedArray=sortIntegers(new int[]{99,9,999});
        System.out.println(Arrays.toString(sortedArray));
    }

  /*  public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arrayList = new int[len];
        for (int i = 0; i < len; i++) {
            arrayList[i] = random.nextInt(1000);
        }
        return arrayList;
    }*/
    private static int[] sortIntegers(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray=Arrays.copyOf(array,array.length);
        boolean flag=true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("--->"+ Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
    }


