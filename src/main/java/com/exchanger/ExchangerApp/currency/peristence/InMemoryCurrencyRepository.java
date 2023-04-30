package com.exchanger.ExchangerApp.currency.peristence;

import com.exchanger.ExchangerApp.currency.domain.Currency;
import com.exchanger.ExchangerApp.currency.domain.CurrencyRepository;
import com.exchanger.ExchangerApp.currency.integration.CurrencyResponse;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class InMemoryCurrencyRepository implements CurrencyRepository {
    public final Map<String, Currency> currencyMap = new HashMap<>();

    @Override
    public void saveAll(List<CurrencyResponse> list) {
        list.forEach(currencyResponse -> currencyMap.put(currencyResponse.code(),
                Currency.from(currencyResponse)));
    }

    @Override
    public List<Currency> findAll() {
        return currencyMap.values()
                .stream()
                .toList();
    }
}
