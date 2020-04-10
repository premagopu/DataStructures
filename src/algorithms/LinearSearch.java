package algorithms;

public class LinearSearch {

    public static void main(String[] args) {
        int[] container = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(container,6));

    }

    //Search for the element in an array and return position of the element
    public static int linearSearch(int[] a, int element){

        for (int i=0;i<a.length;i++){
            if(a[i] == element){
                return i;
            }

        }
        return -1;
    }
}
