/**
 * For every element in the array starting at 0,
 * iterate through the entire array and select the minimun element and swap with current position.
 */
public class SelectionSort {

    public static void main(String args[]){
        int[] input = {5,33,4,2,66,7,8,10,344,5};
        int[] sorted = sort(input);

        for(int i : sorted){
            System.out.print(i + "  ");
        }
    }

    private static int[] sort(int[] input){
        int min = 0;
        int minIndex = 0;
        for(int i=0;i<input.length;i++){
            min = input[i];
            minIndex = i;
            for(int j=i;j<input.length;j++){
                if(min>input[j]){  // Change this to less than to sort in descending order.
                    min = input[j];
                    minIndex = j;
                }
            }
            //swap input[i] with input[minIndex]
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
        return input;
    }
}
