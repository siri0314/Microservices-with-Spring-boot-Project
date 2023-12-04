package com.microservices.ProductService.service;

import com.microservices.ProductService.model.ProductRequest;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
}
