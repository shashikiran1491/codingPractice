public class PrintFibonacci {

    /**
     * Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1
     * N = 5
     * o/p = 1,1,2,3,5
     */

    public static void main(String[] args) {

        int n = 7;
        int i = 1;
        int j = 1;

        for(int k=0; k<n; k++) {
            if(k < 2) {
                System.out.println(i);
            } else {
                System.out.println(i + j);
                i = j;
                j = k;
            }
        }
    }
}
