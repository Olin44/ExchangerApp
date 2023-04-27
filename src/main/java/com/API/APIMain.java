package com.API;

import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import java.util.List;


public class APIMain {
    public String URL = "http://api.nbp.pl/api/exchangerates/tables/";

    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(URL).addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
    }

    public void showAll() {
        CurrencyClient apiHolder = retrofit().create(CurrencyClient.class);
        List<Currency> response = (List<Currency>) apiHolder.getByTable("A");
        response.stream().forEach(System.out::println);
    }
}
