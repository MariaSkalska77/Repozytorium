package pl.sda.programwanie2.nbp;

import java.util.ArrayList;

public class Kurs {
    public String currency;
    public String effectiveDate;
    public String code;
    public ArrayList<Rates> rates;

    public String getCurrency() {
        return currency;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Rates> getRates() {
        return rates;
    }

    public Kurs(String currency, String effectiveDate, String code, ArrayList<Rates> rates) {
        this.currency = currency;
        this.effectiveDate = effectiveDate;
        this.code = code;
        this.rates = rates;
    }

}
