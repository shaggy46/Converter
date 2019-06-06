package firstApp;

import java.util.Scanner;

import static firstApp.MapClass.converters;

public class App
{
    public static void main( String[] args ){

            ConvertMethods convertType = ChooseConversionMethod(); //tworze enum convertType
            Converter converter = converters.get(convertType); //tworze interfejs converter
            long value = 0;                                     //mapa o nazwie converters
            Scanner scanner1 = new Scanner(System.in);
            value = scanner1.nextLong();
            long result = converter.convert(value);
            System.out.println("Wynik wynosi: " + result);


    }
    public static ConvertMethods ChooseConversionMethod() {
        String choice;
        System.out.println("Wybierz numer konwersji");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        return converters.get(choice);
    }
}
