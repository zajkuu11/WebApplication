package zajkuu.mvc.WebApplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zajkuu.mvc.WebApplication.domain.Customer;
import zajkuu.mvc.WebApplication.domain.Product;
import zajkuu.mvc.WebApplication.service.ProductService;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductService productService;

    @Override
    public Customer update(Product product) {
        return null;
    }

    @Override
    public Customer getOne(Integer id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Customer add(Product product) {
        return null;
    }
}
