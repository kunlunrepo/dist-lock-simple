package com.mk.dist.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2024-01-04 17:14
 */
@Mapper
public interface StockDao {

    @Select("select stock from goods_stock where goods_id=#{goodsId}")
    Integer selectStockByGoodsId(@Param("goodsId") Long goodsId);

    // 更新库存
    @Update("update goods_stock set stock=#{stock} where goods_id=#{goodsId}")
    Integer updateStockByGoodsId(@Param("goodsId") Long goodsId, @Param("stock") Integer stock);

}
