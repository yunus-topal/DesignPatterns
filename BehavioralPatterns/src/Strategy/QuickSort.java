package Strategy;

import java.util.Arrays;

public class QuickSort implements Strategy{
    @Override
    public void execute(int[] arr) {
        Arrays.sort(arr);
        return;
    }
}
