package com.API;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import java.util.List;

public class APIMain {
    public String URL = "http://api.nbp.pl/api/exchangerates/tables/";

    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(URL).addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
    }
    public void showAll(){
        APIHolder apiHolder = retrofit().create(APIHolder.class);
        Response<List<Currency>> response = apiHolder.GetByTable("A").execute();
        List<Currency> currencies = response.body();
        currencies.stream().forEach(System.out::println);
    }
}
