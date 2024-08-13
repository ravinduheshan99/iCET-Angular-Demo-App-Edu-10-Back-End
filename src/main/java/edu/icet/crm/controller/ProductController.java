package edu.icet.crm.controller;

import edu.icet.crm.model.Product;
import edu.icet.crm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    final ProductService productService;

    //no need to specify the method like "create-product" separately in mappings
    @PostMapping
    void persist(@RequestBody Product product){

    }

}
