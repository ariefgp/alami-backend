package com.ariefgusti.backend.product;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String name);
}
