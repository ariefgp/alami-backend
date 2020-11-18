package com.ariefgusti.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ariefgusti.model.Products;
import com.ariefgusti.repository.ProductsRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")
public class ProductsController {
    @Autowired
    ProductsRepository productsRepository;

    @GetMapping("/products")
    public ResponseEntity<List<Products>> getAllProducts(@RequestParam(required = false) String nama) {
		try {
			List<Products> products = new ArrayList<Products>();

			if (nama == null)
                productsRepository.findAll().forEach(products::add);
			else
                productsRepository.findByNameContaining(nama).forEach(products::add);

			if (products.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(products, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
    
    @PostMapping("/products")
    public ResponseEntity<Products> createProduct(@RequestBody Products products) {
        try {
			Products initProduct = productsRepository
					.save(new Products(products.getNama(), products.getHargaSatuan(), products.getSellerId(), products.getDateCreated(), products.getDateUpdated()));
			return new ResponseEntity<>(initProduct, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
    
}
