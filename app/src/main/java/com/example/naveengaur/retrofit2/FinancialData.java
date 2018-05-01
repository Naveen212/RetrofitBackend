package com.example.naveengaur.retrofit2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by naveengaur on 2/5/18.
 */

public class FinancialData {
    private int year;
    private HashMap<String,BigDecimal>xbrlElements;
    private LinkedHashMap<String,Double> ratios;


    public FinancialData(int year, HashMap<String, BigDecimal> xbrlElements, LinkedHashMap<String, Double> ratios) {
        this.year = year;
        this.xbrlElements = xbrlElements;
        this.ratios = ratios;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public HashMap<String, BigDecimal> getXbrlElements() {
        return xbrlElements;
    }

    public void setXbrlElements(HashMap<String, BigDecimal> xbrlElements) {
        this.xbrlElements = xbrlElements;
    }

    public LinkedHashMap<String, Double> getRatios() {
        return ratios;
    }

    public void setRatios(LinkedHashMap<String, Double> ratios) {
        this.ratios = ratios;
    }
}
