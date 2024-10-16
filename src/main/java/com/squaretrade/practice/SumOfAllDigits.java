public class SumOfAllDigits {

    /**
     * Sum Of All Digits In 47862 = 27
     *
     *
     *
     */

    public static void main(String[] args) {

        int num = 416872;
        int sum = 0;

        while(num > 0) {
            int temp = num%10;
            sum = sum + temp;
            num = num/10;
        }

        System.out.println(sum);


    }


}
