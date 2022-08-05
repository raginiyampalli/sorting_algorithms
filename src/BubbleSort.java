/**
 * Start from left, compare two elements and swap if left element is greater than right element- continue till the end of the array [ In this iteration,
 * last element is in the right spot]'
 * Continue this from 0 to i-1th element and then 0 to i-2th element.. so on..
 */
public class BubbleSort {

    public static void main(String args[]){
        int[] input = {7,4,60,2,4,10};
        int[] result = sort(input);
        for(int val : result){
            System.out.print(val + "  ");
        }
    }

    public static int[] sort(int[] input){
        for(int j=input.length-1;j>0;j--){
            for(int i=0;i<=j;i++){
                if(i<input.length-1 && input[i]>input[i+1]){
                    //swap i with i++ ;
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }
            }
        }

        return input;
    }
}
