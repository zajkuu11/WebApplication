package zajkuu.mvc.WebApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import zajkuu.mvc.WebApplication.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
