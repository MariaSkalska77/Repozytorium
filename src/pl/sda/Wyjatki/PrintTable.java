package pl.sda.Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{ //kod w ktorym moga powstac bledy
             int index = scanner.nextInt();
        String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
        System.out.println(fruits[index]);}

        catch(ArrayIndexOutOfBoundsException aioobe){//obsluga drugiego wyjatku drugiego rodzaju - przekroczenie zakresu indeksu tablicy
            System.out.println("wystapil blad - proba dostepu do indeksu ktora nie istnieje " + aioobe);
        }

        catch(InputMismatchException ime){//obsluga pierwszego wyjatku - nie wprowadzono inta
            System.out.println("wystapil blad - nie wprowadzono inta"+ ime);
        }
        finally {
            System.out.println("blad");
        }
    }
}
