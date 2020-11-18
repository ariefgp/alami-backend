package com.ariefgusti.backend.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {
}
