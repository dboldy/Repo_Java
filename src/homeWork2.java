public class homeWork2 {
    public static void main(String[] args) {

        //F->C
        double fTemp = 65;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + " F is equal to " + cTemp + " Deg celsius ");

        //F->K       //(°F − 32) × 5/9 + 273.15 = K.
        double frTemp = 75;
        double kTemp = (frTemp - 32) * 5/9 + 273.15;
        System.out.println(frTemp + " F is equal to " + kTemp + " Kelvins ");

        //K->C      //...-273.15
        double kelvinsTemp = 293;
        double celTemp = (kelvinsTemp - 273.15);
        System.out.println(kelvinsTemp + " Kelvins is equal to " + celTemp + " Celsius ");

        //K->F     //...× 9/5 - 459.67
        double kelvinsT = 350;
        double faTemp = (kelvinsT * 9/5 - 459.67);
        System.out.println(kelvinsT + " Kelvins is equal to " + faTemp + " Fahrenheit ");

        //C->F    //...× 9/5 + 32
        double celsius = 75;
        double fahrenheit = (celsius * 9/5 + 32);
        System.out.println(celsius + " Celsius equal to " + fahrenheit + " Fahrenheit ");

        //C->K    //...+273.12
        double selsiusTemp = 55;
        double kelvinsTempreture = (selsiusTemp + 273.15);
        System.out.println(selsiusTemp + " Selsius is equal to " + kelvinsTempreture + " Kelvins ");
    }
}
