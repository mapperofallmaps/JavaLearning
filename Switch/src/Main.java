/**
 * Created by Daniel on 19/08/2017.
 */
public class Main {

    public static void main(String[] args) {

/*      int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/

        int switchValue = 5;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char charSwitchValue = 'C';

        switch(charSwitchValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("char was " + charSwitchValue);
                break;

            default:
                System.out.println("Was not A, B, C, D or E");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "may":
                System.out.println("May");
                break;

            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
