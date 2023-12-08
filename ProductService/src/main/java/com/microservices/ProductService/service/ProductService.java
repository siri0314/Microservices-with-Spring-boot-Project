package com.microservices.ProductService.service;

import com.microservices.ProductService.model.ProductRequest;
import com.microservices.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);
}
