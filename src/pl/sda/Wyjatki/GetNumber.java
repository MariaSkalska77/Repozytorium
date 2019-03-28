package pl.sda.Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try { //podajemy w lini po ktorej ma wystapic wyjatek
            int number = scanner.nextInt();
            System.out.println(number);
        }catch (InputMismatchException ime){
            System.out.println("wystapil blad");
        }
        finally {
            System.out.println("blad");

        }

    }
}