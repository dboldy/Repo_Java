import java.util.Objects;
import java.util.stream.IntStream;

public class homeWork7 {
    public static void main(String[] args) {


        double[] numbers = {1.45, 6.77, 7.77};
        double exit = arraySum(numbers);
        System.out.println(exit);

        int n1 = 1, n2 = 7;
        int b = 0;
        for (int i = n1; i <= n2; i++)
            if (isPrime(i) == true)
                b++;
        System.out.println(b);


        String example = "level";
        if (isPalindrome(example))
            System.out.println("Yes");
        else
            System.out.println("No");


        String[] values = {"hello", "piece", "happy", "hello", "Happy", "hello"};
        checkDuplicate(values);

        String[] values1 = {"hello", "peace", "happy", "hello", "Happy", "hello","laugh"};
        String[] values2 = {"hello","grow","laugh","peace"};
       commonVal(values1,values2);
    }


    public static double arraySum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        double result1 = (sum + arr.length);

        return sum;


    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static boolean isPalindrome(String example) {

        int i = 0, b = example.length() - 1;
        while (i < b) {
            if (example.charAt(i) != example.charAt(b))
                return false;
            i++;
            b--;
        }
        return true;
    }

    public static void checkDuplicate(String[] array) {
      int r;
      boolean[] printed = new boolean [array.length];
      for ( r = 0; r < array.length-1; r++) {
       boolean isDuplicate = false;
       if (printed[r] == false)
       {

           for (int i = r + 1; i<array.length; i++){
               if (array[r].equals(array[r].toLowerCase())) {
                   isDuplicate = printed[i]=true;
                   break;
               }
           }
       }
       if (isDuplicate == true)
           System.out.println(array[r]);
    }
  }

  public static void commonVal (String[] arr1, String [] arr2){

        for(int t = 1; t < arr1.length; t++){
        for(int j = 0; j < arr2.length; j++){
            if (arr1[t].equals(arr2[j].toLowerCase())) {

                System.out.print(arr1[t] + " ");
                break;
              }
          }
          }
    }
}