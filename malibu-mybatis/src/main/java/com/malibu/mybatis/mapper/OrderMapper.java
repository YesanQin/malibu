package com.malibu.mybatis.mapper;

import com.malibu.mybatis.dto.FlowTask;
import com.malibu.mybatis.dto.Order;

/**
 * Created by qinyisheng on 16/8/31.
 */
public interface OrderMapper {
    //CRUD
    /*
        增 Create
     */
    int insertOrder(Order order);
    /*
        查 Retrieve
     */
    Order selectOrderById(int order_id);
    /*
        改 Update
     */
    int updateOrder(int id);
    /*
        删 Delete
     */
    int deleteOrderById(int id);

    /*
    eg:  对于D和U操作,其本质上还是需要进行R操作的,R操作需要查询条件,
         实际情况下查询条件是复杂多变的,如何来表示这个查询条件呢?
         结构化查询!
    */
}
