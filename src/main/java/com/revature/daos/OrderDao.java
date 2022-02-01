package com.revature.daos;

import com.revature.models.Order;
import com.revature.models.Person;

import java.util.List;

public interface OrderDao {

    public void createOrder(Order o);
    public void createBuyerOrderRelation(Order o, Person b);

    public List<Order> readAllOrders();
    public List<Person> readBuyerList(int orderID);
    public Order readOrderById(int orderID);

    public void updateOrder(Order o);

    public void deleteOrder(Order o);


}
