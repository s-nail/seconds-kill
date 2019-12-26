package com.mine.seconds.kill.dao;

import com.mine.seconds.kill.pojo.StockOrder;
import com.mine.seconds.kill.pojo.StockOrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockOrderMapper {
    int countByExample(StockOrderExample example);

    int deleteByExample(StockOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockOrder record);

    int insertSelective(StockOrder record);

    List<StockOrder> selectByExample(StockOrderExample example);

    StockOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockOrder record, @Param("example") StockOrderExample example);

    int updateByExample(@Param("record") StockOrder record, @Param("example") StockOrderExample example);

    int updateByPrimaryKeySelective(StockOrder record);

    int updateByPrimaryKey(StockOrder record);
}