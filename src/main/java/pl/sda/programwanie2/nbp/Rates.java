package pl.sda.programwanie2.nbp;

public class Rates {
    public String no;
    public String effectiveData;
    public String mid;

    public String getNo() {
        return no;
    }

    public String getEffectiveData() {
        return effectiveData;
    }

    public String getMid() {
        return mid;
    }

    public Rates(String no, String effectiveData, String mid) {
        this.no = no;
        this.effectiveData = effectiveData;
        this.mid = mid;
    }
}
