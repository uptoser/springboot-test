package me.ibeyond.springboottest.product.web;

import me.ibeyond.springboottest.base.model.ResponseEntity;
import me.ibeyond.springboottest.product.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {


    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<Product> getProducts() {
        Product product = new Product();
        product.setId("1");
        product.setName("电脑");
        product.setPrice("1233");
        return new ResponseEntity<>(200, "这个增却", product);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String insertingProducts() {
        return "getProducts";
    }
}
