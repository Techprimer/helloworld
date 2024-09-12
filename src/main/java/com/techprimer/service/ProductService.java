package com.techprimer.service;

import java.util.List;

import com.techprimer.entity.Product;

public interface ProductService {

	public Product addProduct(Product product);

	public Product getProduct(Long productId);

}
