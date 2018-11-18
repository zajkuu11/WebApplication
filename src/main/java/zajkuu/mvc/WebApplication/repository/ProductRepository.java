package zajkuu.mvc.WebApplication.repository;

import org.springframework.data.repository.CrudRepository;
import zajkuu.mvc.WebApplication.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
