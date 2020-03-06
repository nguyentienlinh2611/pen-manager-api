package sapo.example.quanly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sapo.example.quanly.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByPortfolio(String portfolio);
//    Prouct findByColor(String color);
    Product findByName(String name);
}
