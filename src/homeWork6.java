public class homeWork6 {
    public static void main(String[] args) {
        int[] numbers = {22, 25, 36, 47, 58, 67,};

        double result = arrayAvg(numbers);
        System.out.println(result);

        String names[] = {"Darya", "Hendra", "Daniel", "Joe"};
        String nameToSearch = "darya";
        nameSearch(names, nameToSearch);

    }

    public static double arrayAvg(int[] inputArray) {
        double sum = 0;
        for (int i = 0; i < inputArray.length; i++)
            sum = sum + inputArray[i];
        double average = (sum / inputArray.length);
        return average;

    }

    public static void nameSearch(String[] arrayInput, String givenName) {
        for (int b = 0; b < arrayInput.length; b++) {
            if (arrayInput[b].equalsIgnoreCase(givenName))
            {
                System.out.println(b);
            }

        }

        }

    }



