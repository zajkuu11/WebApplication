package zajkuu.mvc.WebApplication.service;

import zajkuu.mvc.WebApplication.domain.Customer;
import zajkuu.mvc.WebApplication.domain.Product;

import java.util.List;

public interface ProductService {
    Customer update(Product product);//U

    Customer getOne(Integer id);//R
    List<Customer> getAll();

    void delete(Integer id);//D

    Customer add(Product product);//C
}
