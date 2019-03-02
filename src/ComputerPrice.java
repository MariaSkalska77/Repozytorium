public class ComputerPrice {

    private int plytaGlowna;
    private int dyskTwardy;
    private int pamiecRam;
    private int monitor;
    private double vat;

    public ComputerPrice(int plytaGlowna, int dyskTwardy, int pamiecRam, double vat) {
        this.plytaGlowna = plytaGlowna;
        this.dyskTwardy = dyskTwardy;
        this.pamiecRam = pamiecRam;
        this.monitor = monitor;
        this.vat = vat;
    }
    public double getComputerPrice() {
        return (plytaGlowna + dyskTwardy + pamiecRam)+ (plytaGlowna + dyskTwardy + pamiecRam)*vat;

    }
    static double getMonitorPrice(int monitor){

        return (monitor);

        }
    public double finalPrice(){
        return getComputerPrice() + getMonitorPrice();
    }

    public static void main(String[] args) {
        ComputerPrice cenakompa = new ComputerPrice(15, 20, 30, 1.23 );

    }

    }
