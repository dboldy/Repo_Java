package homeWork3;

public class homeWork3 {


    public static void main(String[] args) {
        String myFirstName = "Darya";
        System.out.println(" My first name - " + myFirstName);

        String myLastName = "Boldyrava";
        System.out.println("My last name - " + myLastName);


        int myFirstLength = myFirstName.length();
        System.out.println(" Lenght of my first name - " + myFirstName.length());
        boolean myLastNameStartswith_K = myLastName.startsWith("K");
        System.out.println(" Does " + myLastName + " starts with K ? " + myLastNameStartswith_K);

        char lastChar = myFirstName.charAt(4);
        System.out.println("Last char at first name - " + lastChar);

        boolean lastNmeEndsWith_M = myLastName.endsWith("M");
        System.out.println("Does my last name ends with M ? " + lastNmeEndsWith_M);

        String myStatement = "I am a good programmer ";
        System.out.println("My statement - " + myStatement);

        String[] words = myStatement.split("\\s");
        int count = words.length;
        System.out.println("Number of words in my statement - " + count);

        System.out.println("My statement with replaced chars - " + myStatement.replace('r', 'f'));

        String myName = "Darya";
        int indexOfName = myName.lastIndexOf("a");
        System.out.println("Length of my name : " + indexOfName);

        String strnew = " Hello dear, how are you? ";
        int str = strnew.length();
        if(str >= 10) {
            System.out.println("Is the string value more than 10? : True");
        }
        else if (str <= 10) {
            System.out.println("Is the string value more than 10? : False");
        }






    }
}
