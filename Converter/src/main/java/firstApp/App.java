package firstApp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class App
{
    public static void main( String[] args ) throws InterruptedException {
        int option;
        double toConvert;
        while (true) {
            System.out.println("Podaj numer konwersji");
            System.out.println("1. Kilogramy -> Funty");
            System.out.println("2. Kilogramy -> Uncje");
            System.out.println("3. Funty -> Kilogramy");
            System.out.println("4. Funty -> Uncje");
            System.out.println("5. Uncje -> Kilogramy");
            System.out.println("6. Uncje -> Funty");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            if(option > 0 && option <7) {
                System.out.println("Podaj masę do przeliczenia");
                Scanner scanner1 = new Scanner(System.in);
                toConvert = scanner1.nextDouble();
                if (toConvert > 0) {
                    switch (option) {
                        case 1:
                            Kilograms firstCase = new Kilograms(toConvert);
                            System.out.println(firstCase.kilogramsToPounds());
                            break;
                        case 2:
                            Kilograms secondCase = new Kilograms(toConvert);
                            System.out.println(secondCase.kilogramsToOunces());
                            break;
                        case 3:
                            Pounds thirdCase = new Pounds(toConvert);
                            System.out.println(thirdCase.poundsToKilograms());
                            break;
                        case 4:
                            Pounds fourthCase = new Pounds(toConvert);
                            System.out.println(fourthCase.poundsToOunces());
                            break;
                        case 5:
                            Ounces fifthCase = new Ounces(toConvert);
                            System.out.println(fifthCase.ouncesToKilograms());
                            break;
                        case 6:
                            Ounces sixth = new Ounces(toConvert);
                            System.out.println(sixth.ouncesToPounds());
                            break;
                        default:
                            break;
                    }
                } else
                    System.out.println("Podano wartość spoza zakresu!");
                TimeUnit.SECONDS.sleep(7);
            }
            else
                System.out.println("Podano numer spoza zakresu!");
                System.out.println(" ");
            }
    }


}
