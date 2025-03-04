package com.example.SpringWeb.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	private int ProdId;
	private String ProdName;
	private int ProdPrice;
	
	// Default constructor
    public Products() {
    }
	public Products(int prodId, String prodName, int prodPrice) {
		super();
		ProdId = prodId;
		ProdName = prodName;
		ProdPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Products [ProdId=" + ProdId + ", ProdName=" + ProdName + ", ProdPrice=" + ProdPrice + "]";
	}
	public int getProdId() {
		return ProdId;
	}
	public void setProdId(int prodId) {
		ProdId = prodId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public int getProdPrice() {
		return ProdPrice;
	}
	public void setProdPrice(int prodPrice) {
		ProdPrice = prodPrice;
	}


}
