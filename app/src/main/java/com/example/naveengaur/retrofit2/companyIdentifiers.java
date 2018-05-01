package com.example.naveengaur.retrofit2;

/**
 * Created by naveengaur on 2/5/18.
 */

public class companyIdentifiers {
    private  String ticker;
    private String name;
    private String cik;


    public companyIdentifiers(String ticker, String name, String cik) {
        this.ticker = ticker;
        this.name = name;
        this.cik = cik;
    }

    public String getTicker() {
        return ticker;
    }

    public String getName() {
        return name;
    }

    public String getCik() {
        return cik;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

}
