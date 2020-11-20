package com.ariefgusti.backend.product;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;

import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ariefgusti.backend.seller.Seller;

import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "Product")
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;

    private BigDecimal hargaSatuan;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "sellerId", referencedColumnName="sellerId", foreignKey = @ForeignKey(name = "SELLER_ID_FK")),
        @JoinColumn(name = "sellerName", referencedColumnName="name", foreignKey = @ForeignKey(name = "SELLER_NAME_FK")),
    })
    private Seller seller;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
    
}
