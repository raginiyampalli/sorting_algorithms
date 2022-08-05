/**
 * Decrease and Conquer
 * Start from left to right, for every element start 0th position if it's left  element is less than the current number - swap the elements.
 */
public class InsertionSort {

    public static void main(String args[]){
        int[] sample = {67,5,7,1,0};
        int[] result = sort(sample);
        for(int val : result){
            System.out.print(val + "  ");
        }

    }

    public static int[] sort(int[] input){
        for(int i=0;i<input.length;i++){
            int j=i-1;
            while(j>=0){
                if(input[i]<input[j]){
                    //swap i and j
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                    i=j;
                    j=i-1;
                } else {
                    j--;
                }
            }
        }
        return input;
    }
}
