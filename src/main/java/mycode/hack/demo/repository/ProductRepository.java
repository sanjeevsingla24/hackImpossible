package mycode.hack.demo.repository;

import mycode.hack.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    // Native Query to get all products with price greater than 1000
    public List<Product> findAllProductsByPriceGreaterThan(int price);

    // JPQL Query to get all products with price less than 1000
    public List<Product> findAllProductsByPriceLessThan(int price);
}
