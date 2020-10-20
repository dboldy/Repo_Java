public class codeTest {
    public static void main(String[] args) {
        int[] array = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int inputNum = 24;
        array(arr1());

        int[]array1 =   {1, 2, 4, 3, 1, 6, 1}
        int inputNum2 = 11;
        array1(arr1());

        int[] missingNum = {1, 3, 5, 4, 2, 7};
        int[] missingNum1 = {-1, -3, 4, 2};
        int[] missingNum2 =  {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
        missingNum(searchArray());
        missingNum1(searchArray());
        missingNum2(searchArray())
    }

    public static int searchArray(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            if (i != inputArr[i]) {
                return i;
            }
        }
                return inputArr.length;
            }

    public static void  arr1(String[] arrayInput, String inputNum) {
        for (int b = 0; b < arrayInput.length; b++) {
            if (arrayInput[b] != inputNum)
                return nameOfReturn;
            int[] values = new int[numOfReturn];
            int i;
            if (arrayInput[b] != inputNum) {
                values[i] = arrayInput[b];
                i++;
            }
                return;
        }
    }
}