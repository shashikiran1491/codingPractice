public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "yy";


       /* for(int i=0; i<str.length(); i++) {

            boolean repeat = false;

            for(int j=0 ; j<str.length(); j++) {

                if(i == j) {
                    continue;
                }

                if(str.charAt(i) == str.charAt(j)) {
                    repeat = true;
                    break;
                }

            }

            if(repeat == false) {
                System.out.println(str.charAt(i));
                break;
            }



        }
*/

        System.out.println(nonrepeatingCharacter(str));
    }


    static char nonrepeatingCharacter(String str) {

        for(int i=0; i<str.length(); i++) {
            boolean repeat = false;
            for(int j=0 ; j<str.length(); j++) {

                if(i == j) {
                    continue;
                }

                if(str.charAt(i) == str.charAt(j)) {
                    repeat = true;
                    break;
                }

            }

            if(repeat == false) {
                return str.charAt(i);
            }
        }

        return (char)-1;
    }
}
