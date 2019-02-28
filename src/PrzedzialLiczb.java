import java.util.Scanner;
public class PrzedzialLiczb {
    public static void main(String[] args) {

        Scanner wpisz = new Scanner(System.in);
        System.out.println("Wpisz liczbe: ");
        int liczba = wpisz.nextInt();

        if (liczba<0){
            System.out.println("liczba mniejsza od zera");
        }
        if (liczba>10000){
            System.out.println("liczba wieksza od 10 000");
        }
        if (liczba>=0 && liczba<=10){
            System.out.println("liczba jest wieksza lub rowna 0 i mniejsza lub rowna 10");
        }
        if (liczba>=11 && liczba<=100){
            System.out.println("liczba wieksza lub rowna 11 i mniejsza lub rowna 99");
        }
        if (liczba>=101 && liczba<=1000){
            System.out.println("liczba wieksza lub rowna 101 i mniejsza lub rowna 1000");
        }
        if (liczba>= 1001 && liczba<=10000){
            System.out.println("liczba jest wieksza lub rowna 1001 i mniejsza lub rowna 10 000");
        }

    }

    }




