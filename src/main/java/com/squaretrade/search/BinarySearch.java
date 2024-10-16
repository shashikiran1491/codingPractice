/**
 *
 *
 * Input: k = 4, arr= [1, 2, 3, 4, 5]
 */


public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {11, 22, 33, 44, 55};
        int k = 445;
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int midIndex = (low+high) / 2;

            if(k == arr[midIndex]) {
                System.out.println("found at index : "+midIndex);
                return;
            } else if (k > arr[midIndex]) {
                low = midIndex + 1;
            } else if (k < arr[midIndex]) {

                high = midIndex - 1;
            }


        }

        System.out.println("-1");

    }


}
