public class ComputerPrice {

    private int plytaGlowna;
    private int dyskTwardy;
    private int pamiecRam;
    private int monitor;
    private double vat;

    public ComputerPrice() {
        this.plytaGlowna = plytaGlowna;
        this.dyskTwardy = dyskTwardy;
        this.pamiecRam = pamiecRam;
        this.monitor = monitor;
        this.vat = vat;
    }
    public double getComputerPrice() {
        ComputerPrice price = new ComputerPrice();
        price.plytaGlowna = 15;
        price.dyskTwardy = 20;
        price.pamiecRam = 25;
        price.vat = 0.23;
        return (plytaGlowna + dyskTwardy + pamiecRam)+ (plytaGlowna + dyskTwardy + pamiecRam)*vat;

    }
    static double getMonitorPrice(){
        ComputerPrice price1 = new ComputerPrice();
        price1.monitor = 10;
        return (price1.monitor);

        }
    public double finalPrice(){
        return getComputerPrice() + getMonitorPrice();
    }

    }
