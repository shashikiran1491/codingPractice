public class PyramidOfNumbers {

    public static void main(String[] args) {
        pattern1();

        pattern2();
    }

    private static void pattern2() {
        for(int i=1; i<10; i++) {
            for(int j=10-i; j>0; j--) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }


    private static void pattern1() {
        for(int i=1; i<10; i++) {

            for(int j=9-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int k=i; k>0; k--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
