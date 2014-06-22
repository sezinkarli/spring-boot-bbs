package main.jparepo;

import main.entity.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * User: beren
 * Date: 22.06.2014
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    public Product findByMaterialName(String materialName);
}
