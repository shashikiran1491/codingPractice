import java.util.Arrays;

public class SumOfArrayElements {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};


        int sum = Arrays.stream(arr).reduce((a,b) -> a+b).getAsInt();
        System.out.println(sum);
    }

}
