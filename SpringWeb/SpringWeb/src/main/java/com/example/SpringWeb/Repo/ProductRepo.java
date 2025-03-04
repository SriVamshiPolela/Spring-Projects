package com.example.SpringWeb.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringWeb.Model.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

}
