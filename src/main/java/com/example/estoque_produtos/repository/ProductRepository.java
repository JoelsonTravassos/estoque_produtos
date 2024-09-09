package com.example.estoque_produtos.repository;

import com.example.estoque_produtos.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String name);
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);
    List<Product> findByQuantityGreaterThan(Integer quantity);
}

