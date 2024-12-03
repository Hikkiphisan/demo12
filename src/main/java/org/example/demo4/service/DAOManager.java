package org.example.demo4.service;

import org.example.demo4.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class DAOManager implements IDAOManager {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> selectAllManager() {
        customers.add(new Customer(1,"Nc","DDD@gmail.com","BN"));
        customers.add(new Customer(2,"S","S@gmail.com","QN"));
        customers.add(new Customer(3,"Ncg","Nc@gmail.com","HN"));
        return customers;
    }
}
