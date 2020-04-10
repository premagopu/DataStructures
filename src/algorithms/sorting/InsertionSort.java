package algorithms.sorting;

public class InsertionSort {

    // O(n^2)
    public static void main(String[] args) {
        int[] b = insertionSort(new int[]{6,3,5,2,8,1,0});
        for (int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }

    public static int[] insertionSort(int[] a){
        for (int i = 1;i<a.length;i++){
            int element = a[i]; // comparing element of the right subset
            int j=i-1; // last position of the left subset
            while (j>=0 && a[j]> element){
                a[j+1]=a[j];
                j--;
            }
            a[j+1] =element;
        }
        return a;
    }
}
