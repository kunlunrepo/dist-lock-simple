package com.mk.dist.controller;

import com.mk.dist.dao.StockDao;
import com.mk.dist.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2024-01-04 17:14
 */
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/stock/deductStock/{goodId}/{count}")
    public String deductStock(@PathVariable Long goodId, @PathVariable Integer count) {
        return stockService.deductStock(goodId, count);
    }
}
