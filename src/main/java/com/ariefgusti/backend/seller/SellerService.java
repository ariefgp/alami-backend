package com.ariefgusti.backend.seller;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SellerService {
    private final SellerRepository sellerRepository;

    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }

    public Optional<Seller> findById(Long id) {
        return sellerRepository.findById(id);
    }

    public Seller save(Seller stock) {
        return sellerRepository.save(stock);
    }

    public void deleteById(Long id) {
        sellerRepository.deleteById(id);
    }
}
