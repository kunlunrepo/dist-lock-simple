package com.mk.dist.service;

import com.mk.dist.dao.StockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description :
 *
 * @author zhoujian
 * date :  2024-01-04 17:16
 */
@Service
public class StockService {

    @Autowired
    private StockDao stockDao;

    public synchronized String deductStock(Long goodId, Integer count) {
        // 1.查询商品的库存数量
        Integer stock = stockDao.selectStockByGoodsId(goodId);

        // 2.判断库存数量是否足够
        if (stock < count) {
            return "库存不足";
        }

        // 3.如果库存足够，则扣减库存数量，并返回成功信息
        Integer flag = stockDao.updateStockByGoodsId(goodId, stock - count);
        if (flag == 1) {
            return "扣减成功";
        } else {
            return "扣减失败";
        }
    }
}
