package com.exchanger.ExchangerApp;

import com.API.APIHolder;
import com.API.APIMain;
import com.API.Currency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class ExchangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangerApplication.class, args);}
}
