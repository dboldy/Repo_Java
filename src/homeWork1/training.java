package homeWork1;

public class training {
    public static void main(String[] args) {
        String msg = "have a nice day to you all";
        String[] words = msg.split(" ");
        for (String abbreviation : words) {
            System.out.print(Character.toUpperCase(abbreviation.charAt(0)));

        }
    }
}