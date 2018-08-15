package algo.LinearSearch.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] input = { 3,2,6,4,1,6,9,11,10};
        quickSort(input,0,input.length-1);
        System.out.println(Arrays.toString(input));
    }

    public static void quickSort(int[] a , int start, int end){
        if(start<end){
            int mid = partition(a, start, end);
            quickSort(a,start,mid-1);
            quickSort(a,mid+1,end);
        }
    }


    public static int partition(int[] a, int start, int end){
        int pivot = a[end];
        int i = start-1; // i starts from -1
        for(int j = start;j<=end -1;j++){
            if(a[j]<=pivot){
                i++;
                int itemp = a[i];
                int jtemp = a[j];
                a[i]=jtemp;
                a[j]=itemp;

            }
        }

        //put the pivot value in correct slot
        //final swap

        int ival = a[i+1];
        a[end] = ival;
        a[i+1] = pivot;

        return i+1;
    }
}
