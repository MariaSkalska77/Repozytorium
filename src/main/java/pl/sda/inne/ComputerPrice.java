package pl.sda.inne;

public class ComputerPrice {

    private int plytaGlowna;
    private int dyskTwardy;
    private int pamiecRam;
    private int monitor;
    private double vat;

    public ComputerPrice(int plytaGlowna, int dyskTwardy, int pamiecRam, double vat, int monitor) {
        this.plytaGlowna = plytaGlowna;
        this.dyskTwardy = dyskTwardy;
        this.pamiecRam = pamiecRam;
        this.monitor = monitor;
        this.vat = vat;
    }
    public double getComputerPrice() {
        return (plytaGlowna + dyskTwardy + pamiecRam)*vat;

    }
    double getMonitorPrice(){

        return (monitor*vat);

        }
    public double finalPrice(){
        return getComputerPrice() + getMonitorPrice();
    }

//    public static void main(String[] args) {
//        ComputerPrice cenakompa = new ComputerPrice(15, 20, 30, 1.23, monitor);

    }


