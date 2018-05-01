package com.example.naveengaur.retrofit2;

import java.util.ArrayList;

/**
 * Created by naveengaur on 2/5/18.
 */

public class companyData {
    private companyIdentifiers identifiers;
    private ArrayList<FinancialData>financialDataEntries;


    public companyData(companyIdentifiers identifiers, ArrayList<FinancialData> financialDataEntries) {
        this.identifiers = identifiers;
        this.financialDataEntries = financialDataEntries;
    }

    public companyIdentifiers getIdentifiers() {
        return identifiers;
    }

    public ArrayList<FinancialData> getFinancialDataEntries() {
        return financialDataEntries;
    }

    public void setIdentifiers(companyIdentifiers identifiers) {
        this.identifiers = identifiers;
    }

    public void setFinancialDataEntries(ArrayList<FinancialData> financialDataEntries) {
        this.financialDataEntries = financialDataEntries;
    }
}
