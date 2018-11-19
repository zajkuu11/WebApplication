package zajkuu.mvc.WebApplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zajkuu.mvc.WebApplication.domain.Customer;
import zajkuu.mvc.WebApplication.domain.Product;
import zajkuu.mvc.WebApplication.repository.ProductRepository;
import zajkuu.mvc.WebApplication.service.ProductService;

import java.util.LinkedList;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product update(Product product) {
        productRepository.save(product);
        return productRepository.findById(product.getId()).get();
    }

    @Override
    public Product getOne(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
        Iterable<Product> products = productRepository.findAll();
        List<Product> customerList = new LinkedList<>();
        for (Product product : products) {
            customerList.add(product);
        }
        return customerList;
    }

    @Override
    public void delete(Integer id) {
        productRepository.delete(productRepository.findById(id).get());
    }

    @Override
    public Product add(Product product) {
        productRepository.save(product);
        return productRepository.findById(product.getId()).get();
    }
}
