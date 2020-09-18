package homeWork1;

public class homeWork1 {
    public static void main(String[] args) {
        byte numberOfHoursInADAy = 24;
        short maxNumOfDaysInAYear = 365;
        short totalNumOfEmployees = 956;

        long populationInTheCountry;
        populationInTheCountry = 3282000000L;
        float interestRate;
        interestRate = 3.23F;
        double balanceInABankAccount;
        balanceInABankAccount = 9000000.456;

        boolean value = true;
        if (value) {
            System.out.println("Does the sun rise from the east? " + value);
        }
        value = false;
        if (!value) {

            System.out.println("Does the sun rise from the west? " + value);
        }

        String nameInitials = "DB";
        String myName = "Darya Boldyrava";


        System.out.println("Number of hours in a day: " + numberOfHoursInADAy);
        System.out.println("Max number of days in a year: " + maxNumOfDaysInAYear);
        System.out.println("Total amount of employees: " + totalNumOfEmployees);
        System.out.println("Population of the country: " + populationInTheCountry);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Balance in a bank account = " + balanceInABankAccount);
        System.out.println("Name initials - " + nameInitials);
        System.out.println("My name is " + myName);

    }

        }