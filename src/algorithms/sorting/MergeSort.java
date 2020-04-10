package algorithms.sorting;

public class MergeSort {
    // O(n log n) but consumes space

    public static void main(String[] args) {
        int [] b = new int[]{5,3,7,1,2,9};
        sort(b,0,b.length-1);

        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }


    public static void sort(int[] a, int start, int end){

        if(end > start) {
            int mid =(start + end)/2;
            sort(a, start, mid); // sort left half
            sort(a, mid + 1, end); // sort right half
            merge(a, start, mid, end);
        }

    }

    public static void merge(int[] a, int start, int mid, int end){

        int[] temp = new int[end-start+1];

        int leftSlot = start;
        int rightSlot  = mid+1;
        int k=0;

        while(leftSlot <= mid && rightSlot <=end){
            if(a[leftSlot]<a[rightSlot]){
                temp[k]= a[leftSlot];
                leftSlot++;
            }else {
                temp[k] = a[rightSlot];
                rightSlot++;
            }
            k=k+1;
        }


        if (leftSlot<=mid){
            while (leftSlot<=mid) {
                temp[k] = a[leftSlot];
                leftSlot++;
                k++;
            }
        }else if(rightSlot<=end){
            while (rightSlot<= end){
                temp[k] = a[rightSlot];
                rightSlot++;
                k++;
            }
        }

        for (int i = 0;i<temp.length;i++){
        a[start+i] = temp[i];
        }
    }

}
