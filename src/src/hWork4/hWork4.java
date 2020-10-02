package hWork4;

public class hWork4 {
    public static void main(String[] args) {
        int num = 555;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("divisible by both");
        } else if (num % 3 == 0) {
            System.out.println("divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("divisible by 5");
        } else {
            System.out.println(num);
        }


        double studentScore = 56;
        double maxScore = 160;
        double myPer = studentScore / maxScore * 100;
        char myGrade = 'A';
        if (myPer >= 91 && myPer < 101)
            myGrade = 'A';

        if (myPer >= 81 && myPer < 91)
            myGrade = 'B';

        if (myPer >= 71 && myPer < 81)
            myGrade = 'C';

        if (myPer >= 61 && myPer < 71)
            myGrade = 'D';

        if (myPer >= 51 && myPer < 61)
            myGrade = 'E';

        if (myPer <= 50)
            myGrade = 'F';
        {
            System.out.println("My percentage " + myPer + " My grade " + myGrade);
        }

    }

    char gear = 'D';
    String cMode = "Snow";


    switch(gear) {
        case 'P':
            System.out.println("You can park");
            break;
        case 'D':
            switch (cMode) {

                case "Snow":
                    System.out.println("You are on a Snow mode");
                    break;
                case "Eco":
                    System.out.println("You are on Eco mode");
                    break;
                case "Sport":
                    System.out.println("You are on a Sport mode");
                    break;
                default:
                    System.out.println("Invalid mode");
                    break;
            }

            break;

        case "N":
            System.out.println("Put car in car wash");
            break;

        case "R":
            System.out.println("Reverse the car");
            break;
        default:
            System.out.println("Invalid gear");
            break;
    }

}



