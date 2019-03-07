package pl.sda;

public class TablicaTest1 {
    //zadanie3

    public void metoda(int [] newtablica){

        int evenNumber = 2;
        int count = 3;
        int tablica[] = new int[count];
        for (int i = 1; i < tablica.length; i = i + 2) {
            tablica[i] = tablica[i] + evenNumber;
            System.out.println(tablica);
        }

    }
    public void nowaMetoda(float [] newtablica1){
        float count1 = 5;
        float tablica1[] = new float[count1];
        for (int i = 1; i < tablica1.length; i = i + 2){
            tablica1[i] = tablica1[i] *2;
            System.out.println();


        }
    }

    public static void main(String[] args) {
        System.out.println(metoda);
        int x = 3;
        int suma = 0;
        int tablica1[] = new int[3];
        tablica1[0] = 1;
        tablica1[1] = 2;
        tablica1[2] = 3;

//        int tablica2[] = {3,6,9,12, 18};

        for (int i = 0; i < tablica1.length; i++) {
            suma += tablica1[i];
        }
        System.out.println(suma);


//        while (x<tablica1.length){
//            tablica1[0]+tablica1[1]);
//            x++; }


    }

}
