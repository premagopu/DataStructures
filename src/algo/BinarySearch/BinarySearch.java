package algo.LinearSearch.BinarySearch;

public class BinarySearch
{

    public static void main(String[] args) {
        int[] container = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(container,9));
    }

    public static int binarySearch(int[] a, int element){
        int p =0;
        int r = a.length-1;
        while(p<r){
            int q= (p+r)/2;
            if(element<a[q]){
                r= q-1;
            }else if(element>a[q]){
                p=q+1;
            }else{
                return q;
            }
        }
        return -1;
    }
}
