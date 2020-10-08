public class homeWork5 {
    public static void main(String[] args) {

        //Reverse statement
        String inputReverse = "happy holidays";
        StringBuilder input1 = new StringBuilder();
        input1.append(inputReverse);
        input1 = input1.reverse();
        System.out.println(input1);


        String msg = "have a nice day to you all";
        String[] words = msg.split(" ");
        for(String abbreviation :words)
            System.out.print(Character.toUpperCase(abbreviation.charAt(0)));

        System.out.println();

        String msg2 = "have happy and prosperous life";
        String[] words2 = msg2.split(" ");
        for(String abbreviation2 : words2)
            System.out.print(Character.toUpperCase(abbreviation2.charAt(0)));

        System.out.println();

        // String toTitleCase
        String[] strArray = {"once upOn a tiMe in the UNIVERSE", null,};
        for (String str : strArray)
            System.out.println(toTitleCase(str));
    }
    private static String toTitleCase(String str) {


        if (str == null || str.isEmpty())
            return "";

        if (str.length() == 1)
            return str.toUpperCase();

        String[] parts = str.split(" ");
        StringBuilder title = new StringBuilder(str.length());
        for (String part : parts) {

            if (part.length() > 1)
                title.append(part.substring(0, 1).toUpperCase())
                        .append(part.substring(1).toLowerCase());
            else
                title.append(part.toUpperCase());
            title.append(" ");
        }
            return title.toString().trim();

    }

}


















