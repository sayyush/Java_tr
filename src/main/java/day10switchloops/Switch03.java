package day10switchloops;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

       //Ex : Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
       // Type code to print abbreviation(kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

        Scanner input = new Scanner(System.in);
        System.out.println("Ulke adinizi giriniz...");
        String countryName = input.nextLine().toLowerCase();

        switch(countryName){
            case "america":
                System.out.println("US");
               break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;

            case "turkey":
                System.out.println("TR");
                break;

            case "india":
                System.out.println("IN");
                break;

            case "peru":
                System.out.println("PE");
                break;

            case "spain":
                System.out.println("ES");
                break;

            case "bulgaria":
                System.out.println("BG");
                break;

            case "albania":
                System.out.println("AL");
                break;

            case "France":
                System.out.println("FR");
                break;

            default:
                System.out.println("Bu ulke tanimli degildir...");













        }










    }
}
