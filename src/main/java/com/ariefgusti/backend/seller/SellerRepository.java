package com.ariefgusti.backend.seller;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
