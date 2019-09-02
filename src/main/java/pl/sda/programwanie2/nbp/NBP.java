package pl.sda.programwanie2.nbp;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class NBP {

    public static void main(String[] args) throws IOException {
        String usd = "http://api.nbp.pl/api/exchangerates/rates/a/usd/today/?format=json";
        String euro = "http://api.nbp.pl/api/exchangerates/rates/a/eur/today/?format=json";
        String funt = "http://api.nbp.pl/api/exchangerates/rates/a/gbp/today/?format=json";
        String frank = "http://api.nbp.pl/api/exchangerates/rates/a/chf/today/?format=json";

        String[] tablicaKursow = {usd, euro, funt, frank};

        for (int i = 0; i < tablicaKursow.length; i++) {
            System.out.println(sciagnijKurs(tablicaKursow[i]));
        }
//        //ile kupimy za 100zl
//        for (int i = 0; i < tablicaKursow.length; i++) {
//            System.out.println("za 100zl kupisz" + (100 / Double.parseDouble(getExchange(sciagnijKurs(tablicaKursow[i])))));
//        }
    }

    public static String getExchange(Kurs kurs) {
        return kurs.rates.get(0).mid;
    }

    private static String sciagnijKurs(String link) throws IOException {

        URL page = new URL(link);
        URLConnection connection = page.openConnection();
        InputStream inputStream = connection.getInputStream();

        Scanner scanner = new Scanner(inputStream);
        String kursJson = scanner.nextLine();
        Gson gson = new Gson();
        Kurs kurs = gson.fromJson(kursJson, Kurs.class);

        return (kurs.code + " " + kurs.rates.get(0).mid + "PLN");
    }
}