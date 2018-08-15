package algo.LinearSearch.Recursion;

public class Recursion {
    public static void main(String[] args) {

        reduceByOne(10);
        System.out.println( recursiveLinearSearch(new int[]{1,2,3,4,6,7},2,7));
        System.out.println( recursiveBinarySearch(new int[]{1,2,3,4,7,9, 16,19},0,8,8));
    }

    //Sample recursion implementation
    public static void reduceByOne(int n){
        if(n>=0){

         reduceByOne(n-1);
        }
        System.out.println(n);
    }


    //Recursive Linear search from xth position of the array
    public static int recursiveLinearSearch(int[] a,int x,int element){

        if(x > a.length-1){
            return -1;
        }else if(a[x] ==element){
            return x;
        }else {
            return recursiveLinearSearch(a,x+1,element);
        }

    }

    //Recursive Binary Search
    public static int recursiveBinarySearch(int[] a,int p, int r, int element){
        System.out.println("[ p "+p+" ... "+r+" ]");
        if(p>r) {
            return -1;
        }else{
            int q = (p+r)/2;
            if(element<a[q]){
                return recursiveBinarySearch(a,p,q-1,element);
            }else if(element>a[q]){
                return  recursiveBinarySearch(a,q+1,r,element);
            }else{
                return q;
            }
        }

    }




}
