package com.example.naveengaur.retrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    protected static Thread thread;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        update();
    }
    protected void update() {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {

                Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
                Api api = retrofit.create(Api.class);
                Call<companyData> call = api.getExamples("aapl",2);
                call.enqueue(new Callback<companyData>() {
                    @Override
                    public void onResponse(Call<companyData> call, Response<companyData> response) {
                        companyData example = response.body();
                        Log.d("CIK--------",example.getIdentifiers().getName().toString());
                        ArrayList<FinancialData> f=example.getFinancialDataEntries();
                        FinancialData f1=f.get(1);
                        Log.d("Year ----",""+f1.getYear());
                        HashMap<String,BigDecimal> xbrl=f1.getXbrlElements();

                        for(String key:xbrl.keySet())
                        {
                            BigDecimal value=xbrl.get(key);
                            Log.d(key,""+value);
                        }
                        LinkedHashMap<String,Double>ratios=f1.getRatios();
                        for(String key:ratios.keySet())
                        {
                            Double value=ratios.get(key);
                            Log.d(key,""+value);
                        }


                        //Ratios ratios=example.getRatios();

                        //ratios.setCashRatio(example.getRatios().getCashRatio());


                        //Log.d("CIK--------",""+example.getXbrlElements().getAssets());
                        //LinkedHashMap<String,Double> ratios=example.getRatios();
                        //int count=0;
                        //for(String key:ratios.keySet())
                        //{   double value=ratios.get(key);
                    }

                    @Override
                    public void onFailure(Call<companyData> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
                        //Log.d("cik-----", t.getMessage());


                    }
                });


            }
        });
        thread.start();
    }
}
