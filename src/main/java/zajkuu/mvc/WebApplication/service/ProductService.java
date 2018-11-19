package zajkuu.mvc.WebApplication.service;

import zajkuu.mvc.WebApplication.domain.Product;

import java.util.List;


public interface ProductService {
    Product update(Product product);//U

    Product getOne(Integer id);//R
    List<Product> getAll();

    void delete(Integer id);//D

    Product add(Product product);//C
}
