package com.microservices.ProductService.model;

import lombok.Builder;
import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private long price;
    private long quantity;
}
