package zajkuu.mvc.WebApplication.service;

import java.util.List;

import zajkuu.mvc.WebApplication.domain.Customer;

public interface CustomerService {
    Customer update(Customer customer);//U

    Customer getOne(Integer id);//R
    List<Customer> getAll();

    void delete(Integer id);//D

    Customer add(Customer customer);//C
}
