package edu.icet.crm.controller;

import edu.icet.crm.model.Product;
import edu.icet.crm.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
@CrossOrigin
@Slf4j
public class ProductController {

    private final ProductService productService;

    //no need to specify the method like "create-product" separately in mappings
    @PostMapping
    public Product persist(@RequestBody Product product){
        log.info("Request Received to Create Product: {}", product);
        return productService.persist(product);
    }

}
