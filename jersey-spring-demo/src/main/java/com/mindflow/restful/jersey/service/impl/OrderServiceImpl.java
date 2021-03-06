package com.mindflow.restful.jersey.service.impl;

import com.mindflow.restful.jersey.domain.Order;
import com.mindflow.restful.jersey.service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-21 10:32
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    private AtomicLong counter = new AtomicLong(1);

    public List<Order> getOrderList() {
        List<Order> orderList = new ArrayList<Order>();

        for(int i=0;i<5;i++){

            Order order = new Order();
            order.setId(counter.getAndIncrement());
            order.setCategory("3C/数码");
            order.setAmount(9250.5d);
            order.setReceiveAddress("北京市朝阳区");

            orderList.add(order);
        }

        return orderList;
    }

    public Order findOrderById(Long id) {

        Order order = new Order();
        order.setId(id);
        order.setCategory("3C/数码");
        order.setAmount(9250.5d);
        order.setReceiveAddress("北京市朝阳区");

        return order;
    }

    public long insert(Order order) {
        order.setId(counter.getAndIncrement());
        return order.getId();
    }

    public int update(Order order) {
        return 1;
    }

    public long delete() {

        return counter.get();
    }

    public int deleteOrderById(Long id) {

        return 1;
    }
}
