import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int n = 2;
        int arr[] = {1};

        int expectedSum = n * (n+1)/2;

        int actualSum  = Arrays.stream(arr).reduce((a,b) -> a+b).getAsInt();

        System.out.println(expectedSum-actualSum);
    }

}
