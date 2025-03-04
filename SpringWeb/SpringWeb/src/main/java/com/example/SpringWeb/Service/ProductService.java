package com.example.SpringWeb.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringWeb.Model.Products;
import com.example.SpringWeb.Repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
//	The below is list which is hardcoded values and it is not recommended so using databse h2 to store values
//	List<Products> products = new ArrayList<>(Arrays.asList(
//			new Products(1,"Iphone", 3000),
//			new Products(2, "Samsung", 2000)));
//	
	
	
	public List<Products> getProducts(){
		return repo.findAll();
	}

	public Products getProductById(int prodId) {
		
		return repo.findById(prodId).orElse(new Products());
	}
//		// TODO Auto-generated method stub
//		for(int i=0; i<=products.size(); i++) {
//			if(products.get(i).getProdId()== prodId) {
//				return products.get(0);
//			}
//				
//		}
////		return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
////		We can also use for loop for this fetching
//		return null;
//	}

	public void addProduct(Products prod) {
		// TODO Auto-generated method stub
//		products.add(prod);
		
		repo.save(prod);
	}

	public void updateProduct(Products prod) {
		repo.save(prod);
	}
//		// TODO Auto-generated method stub
//		int index=0;
//		for(int i = 0; i<products.size(); i++) 
//			if(products.get(i).getProdId() == prod.getProdId())
//				index=i;
//		products.set(index,prod);
//	}
//	

	public void deleteProdById(int prodId) {
		
		repo.deleteById(prodId);
		// TODO Auto-generated method stub
//		
//		for(int i = 0; i<products.size(); i++) 
//		{
//			if(products.get(i).getProdId() == prodId)
//			{
//				products.remove(i);
//			}
//			else {
//				System.out.println("No item found");
//			}
//		}

}
}
