import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]){
        int[] t1={54,6,2,76,4,0};
        int[] result = mergeSort(t1);
        for(int i:result){
            System.out.print(i + "  ");
        }
    }

    public static int[] mergeSort(int[] input){
        if(input.length<=1){
            return input;
        } else {
            int mid = input.length/2;
            int[] left = mergeSort(Arrays.copyOfRange(input,0,mid));
            int[] right = mergeSort(Arrays.copyOfRange(input,mid,input.length));
            return merge(left,right);
        }

    }

    public static int[] merge(int[] array1, int[] array2){
        int[] result = new int[array1.length+array2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<array1.length && j<array2.length){
            if(array1[i]<array2[j]){
                result[k] = array1[i];
                i++;
            }else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }

        while(i<array1.length){
            result[k] = array1[i];
            i++;
            k++;
        }

        while(j<array2.length){
            result[k] = array2[j];
            j++;
            k++;
        }

        return result;
    }
}
