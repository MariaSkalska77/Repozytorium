package pl.sda.programwanie2.pantadeusz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class PanTadeusz {

    public static void main(String[] args) throws FileNotFoundException {

        String filepath = "C:\\Users\\u6068594\\IdeaProjects\\Repozytorium\\test\\resources\\pan-tadeusz.txt";
//New File - (path)
        Scanner scanner = new Scanner(new File(filepath));

        while( scanner.hasNextLine()) {
            String zdanie = scanner.nextLine();
            String[] slowa = zdanie.split(" ");

            for (String word : slowa) {
                if(word.isEmpty() ){
                    continue;
                }
                word = word.toLowerCase();
                word = word.replaceAll("[^a-z ęąśńćżźół]", "");//zamienia wszystkie znakioprocz od a do z na puste znaki, wycina znaki specjalne
                dodaj(word);
            }
        }
        System.out.println(licznikslow);

//        Set<Map.Entry<String, Integer>> entries = licznikslow.entrySet();
//        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return 0;
//            }

        }

    private static TreeMap<String, Integer> licznikslow = new TreeMap<>();

    private static void dodaj (String slowo){
        if(licznikslow.containsKey(slowo)){
            Integer ileRazy = licznikslow.get(slowo);
            ileRazy++;
            licznikslow.put(slowo, ileRazy);
        } else {
            licznikslow.put(slowo, 1);
        }
    }



}
