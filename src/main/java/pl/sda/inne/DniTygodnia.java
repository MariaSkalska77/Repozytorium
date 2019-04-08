package pl.sda.inne;

import java.util.Scanner;

public class DniTygodnia {
    public static void main(String[] args) {

        Scanner wpisz = new Scanner(System.in);
        System.out.println("Podaj cyfre od 1 do 7, ktora wskaze dzien tygodnia: ");
        int cyfra = wpisz.nextInt();

        switch(cyfra){
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
        }

    }
}
