package com.API;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "Currency", url = "${feign.url}")
public interface CurrencyClient {

    @RequestMapping(method = RequestMethod.GET, value = "{table}")
    List<Currency> getByTable(@PathVariable("table") String table);

    @RequestMapping(method = RequestMethod.GET, value = "{table}/last/{topCount}")
    List<Currency> getByTableAndCounts(@PathVariable("table") String table, @PathVariable("topCount") int topCount);
}
