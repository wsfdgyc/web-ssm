package com.heitian.ssm.mapper;

import com.heitian.ssm.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductMapper {
    List<Product> selectAllProduct();
}
