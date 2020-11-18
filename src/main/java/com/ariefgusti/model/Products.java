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
    
    public long getProductId() {
		return productId;
    }
    
    public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
    }
    
    public Integer getHargaSatuan() {
		return hargaSatuan;
	}

	public void setHargaSatuan(Integer hargaSatuan) {
		this.hargaSatuan = hargaSatuan;
    }
    
    public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
    }

    public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
		return "Products [productId=" + productId + ", nama=" + nama + ", hargaSatuan=" + hargaSatuan + ", sellerId=" + sellerId + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + "]";
	}

}
