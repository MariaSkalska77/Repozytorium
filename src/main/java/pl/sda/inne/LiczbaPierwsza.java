package pl.sda.inne;

import java.util.ArrayList;
import java.util.List;

public class LiczbaPierwsza {

    public static boolean czyJestPierwsza(int liczba) {

        if (liczba < 2) {
            return false;
        }
        for (int i = 2; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> rozlozNaCzynnikiPierwsze(int liczba1) {

        ArrayList czynnikiPierwsze = new ArrayList();
        if (czyJestPierwsza(liczba1)) {
            czynnikiPierwsze.add(liczba1);
        } else {
            while (liczba1 != 1) {
                for (int i = 2; i <= liczba1; i++) {
                    if (czyJestPierwsza(i)) {
                        if (liczba1 % i == 0) {
                            czynnikiPierwsze.add(i);
                            liczba1 = liczba1 / i;
                            break;
                        }
                    }
                }
            }

        }
        return czynnikiPierwsze;

    }

    public static void main(String[] args) {

        LiczbaPierwsza lp = new LiczbaPierwsza();
//        boolean wynik = lp.czyJestPierwsza(17);
//        System.out.println(wynik);
        List<Integer> lista = lp.rozlozNaCzynnikiPierwsze(187);
        System.out.println(lista);

    }
}


//56      2 3 5 7 11 13
//28
//14
//7
//                                            2 2 2 7