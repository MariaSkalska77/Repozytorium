import java.util.Scanner;
public class Oceny {
    public static void main(String[] args) {

        Scanner wpisz = new Scanner(System.in);
        System.out.println("Podaj cyfre, ktora odpowiada ocenie: ");
        int ocena = wpisz.nextInt();

        switch (ocena){
            case 1:
                System.out.println("niedostateczny");
                break;
            case 2 :
                System.out.println("dopuszcajacy");
                break;
            case 3 :
                System.out.println("dostateczny");
                break;
            case 4 :
                System.out.println("dobry");
                break;
            case 5 :
                System.out.println("bardzo dobry");
                break;
            case 6 :
                System.out.println("celujacy");
                break;
             default:
                 System.out.println("ocena poza skala");


        }

        }

    }





