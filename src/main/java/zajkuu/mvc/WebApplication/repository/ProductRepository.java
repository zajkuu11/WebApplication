package zajkuu.mvc.WebApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zajkuu.mvc.WebApplication.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
