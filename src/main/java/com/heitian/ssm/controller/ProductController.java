package com.heitian.ssm.controller;

import com.heitian.ssm.model.Product;
import com.heitian.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("listProduct")
    public ModelAndView listCategory() {
        ModelAndView modelAndView = new ModelAndView("learn/listProduct");
        List<Product> productList = productService.listProduct();
        modelAndView.addObject("cs", productList);
        return modelAndView;
    }
}
