package Strategy;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Strategy s1 = new QuickSort();
        Strategy s2 = new BubbleSort();
        Context context = new Context(s1);

        int[] longArr = new int[200];
        for(int i = 0; i < 200; i++){
            longArr[i] = random.nextInt(500);
        }
        int[] longArr2 = Arrays.copyOf(longArr, longArr.length);
/*        int[] arr = {10,12,2,41,21,33,6,4,2,19,67,109,17};
        int[] arr2 = {10,12,2,41,21,33,6,4,2,19,67,109,17};*/

        long startTime = System.nanoTime();
        context.executeStrategy(longArr);
        long endTime = System.nanoTime();

        // System.out.println(Arrays.toString(longArr));
        System.out.println("Time elapsed:");
        System.out.println(endTime - startTime);

        System.out.println();

        context.setStrategy(s2);
        long startTime2 = System.nanoTime();
        context.executeStrategy(longArr2);
        long endTime2 = System.nanoTime();

        // System.out.println(Arrays.toString(longArr2));
        System.out.println("Time elapsed:");
        System.out.println(endTime2 - startTime2);


    }
}
