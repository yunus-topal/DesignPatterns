package Strategy;

public class BubbleSort implements Strategy{
    @Override
    public void execute(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
