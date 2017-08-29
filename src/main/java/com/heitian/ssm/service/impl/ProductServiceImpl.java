package com.heitian.ssm.service.impl;

import com.heitian.ssm.mapper.ProductMapper;
import com.heitian.ssm.model.Product;
import com.heitian.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    public List<Product> listProduct() {
        return productMapper.selectAllProduct();
    }
}
