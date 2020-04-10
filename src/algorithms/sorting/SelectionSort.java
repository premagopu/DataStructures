package algorithms.sorting;

public class SelectionSort {
    // O(n^2)
    public static void main(String[] args) {

        int[] b = selectionSort(new int[]{2,5,1,3,8,7,4});
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }

    //find minimum and swap
    public static int[] selectionSort(int[] a){
        int min;
        for (int i =0;i<a.length-1;i++){
            min = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j] < a[min]){
                    min =j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;
    }
}
