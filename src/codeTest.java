public class codeTest {
    public static void main(String[] args) {
        int[] numbers = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int inputNum = 24;
        int[] newNumbers = removeNumbers(numbers, inputNum);
        int userSpeed = 89;
        checkSpeed(userSpeed);
        System.out.println("Array after removal contains: " );
        for (int x : newNumbers) {
            System.out.print( x + " ");

        }
    }
    public static int[] removeNumbers(int[] inArray, int inNum) {
        int j = 0;
        int arraySize = 0;
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] != inNum) {
                arraySize++;
            }
        }

        int [] numberRemoved = new int [arraySize];
        for (int i =0; i < inArray.length; i++ ) {
        if (inArray[i] != inNum) {
            numberRemoved[j] = inArray[i];
            j++;
        }
        }
        return numberRemoved;
    }
    public static void checkSpeed (int inSpeed) {
       int points = (inSpeed - 70);
        if (points < 1) {
            System.out.println("user speed = " + inSpeed + " Thank you for driving with speed limit");
        }else if (points > 0 && points <5){
            System.out.println("user speed = " + inSpeed + points + " points ");
        }else {
            System.out.println("user speed = " + inSpeed + points + "points (license suspended)");
        }

    }
}