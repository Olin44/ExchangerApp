package com.API;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public interface APIHolder {
    @GET("{table}")
    Call<Currency> GetByTable(@Path("table") String table);
    @GET("{table}/last/{topCount}")
    Call<Currency> GetByTableAndCounts(@Path("table") String table, @Path("topCount") int topCount);
}
