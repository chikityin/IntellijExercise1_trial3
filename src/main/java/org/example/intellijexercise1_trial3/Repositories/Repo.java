package org.example.intellijexercise1_trial3.Repositories;

import org.example.intellijexercise1_trial3.Entities.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Repo {
    ArrayList<Customer> list1 = new ArrayList<>();

    public ArrayList<Customer> initialData() {
        Customer cc,dd;
        cc = new Customer();

        cc.setCname("Joe");
        cc.setCemail("xxx@yahoo.com");

        list1.add(cc);
        return list1;
    }
}
