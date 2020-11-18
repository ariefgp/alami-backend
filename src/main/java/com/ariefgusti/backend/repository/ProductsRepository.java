package com.ariefgusti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ariefgusti.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
  List<Products> findBySellerId(long sellerId);

  List<Products> findByNameContaining(String nama);
}
