import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {

        Scanner wpisz = new Scanner(System.in);
        System.out.println("wpisz na ekran konsoli kod unicode: ");
        int x = wpisz.nextInt();


        if (x >= 48 && x <= 57) {
            System.out.println("jest to cyfra");
        }
        else if (x >= 65 && x <= 90) {
            System.out.println("jest to wielka litera");
        }
        else if (x >= 97 && x <= 122) {
            System.out.println("jest to mala litera");
        }else  {
            System.out.println("nie znaleziono liczby.");

        }

    }

}



