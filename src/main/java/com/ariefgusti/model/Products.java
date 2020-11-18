package com.ariefgusti.model;

import java.sql.Date;

import javax.persistence.*;;

@Entity
@Table(name = "products")
public class Products {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    @Column(name = "nama")
    private String nama;

    @Column(name = "harga_satuan")
    private Integer hargaSatuan;

    @Column(name = "seller_id")
    private long sellerId;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "date_updated")
    private Date dateUpdated;

    public Products(String nama, Integer hargaSatuan, long sellerId, Date dateCreated, Date dateUpdated) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.sellerId = sellerId;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
	}

}
