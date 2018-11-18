package zajkuu.mvc.WebApplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import zajkuu.mvc.WebApplication.domain.Customer;
import zajkuu.mvc.WebApplication.repository.CustomerRepository;
import zajkuu.mvc.WebApplication.service.CustomerService;

@Service
class CustomerServiceImpl implements CustomerService {
    //private Map<Integer, Customer> customers;

    @Autowired
    private CustomerRepository repo;


    @Override
    public Customer update(Customer customer) {
        repo.save(customer);
        return repo.findById(customer.getId()).get();
    }

    @Override
    public Customer getOne(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Customer> getAll() {
        Iterable<Customer> all = repo.findAll();
        LinkedList<Customer> list = new LinkedList<>();

        for(Customer c : all){
            list.add(c);
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        repo.delete(repo.findById(id).get());
    }

    @Override
    public Customer add(Customer customer) {
        /*customer.setId(generatorIdKey());
        customers.put(customer.getId(),customer);
        return customers.get(customer.getId());*/
        repo.save(customer);
        return repo.findById(customer.getId()).get();
    }

}
