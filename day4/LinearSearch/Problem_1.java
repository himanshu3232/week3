package LinearSearch;

//Linear Search Problem 1: Search for the First Negative Number
public class Problem_1 {
    public static void main(String[] args) {

        //given array
        int[] arr = {1,2,3,5,-1,10,1};

        //resultant index
        int index = linearSearch(arr);

        System.out.println(index);
    }

    static int linearSearch(int[] arr){

        //stores index
        int index = 0;

        //iterate through array
        for(int i : arr){
            if(i<0) return index;
            index++;
        }

        //if no negative number is found
        return -1;
    }
}
