public class ComputerPrice {

    static double getComputerPrice(int plytaGlowna, int pamiecRam, int dyskTwardy, int vat){
            double resultOfComputerPrice = (plytaGlowna + pamiecRam + dyskTwardy + vat);
            return resultOfComputerPrice;}

    static double getMonitorPrice(int monitor, double vat){
        double resultOfMonitorPrice = monitor + vat;
        return resultOfMonitorPrice;
    }
    static double getFinalPrice(int plytaGlowna, int pamiecRam, int dyskTwardy, int monitor, int vat){

    }

    public static void main(String[] args) {

        int plytaGlowna = 15;
        int pamiecRam = 20;
        int dyskTwardy = 30;
        int monitor = 10;
        int suma = 75;
        double vat = suma* 0.23;
        System.out.println();


    }
}
