package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.ProductEntity;
import edu.icet.crm.model.Product;
import edu.icet.crm.repository.ProductRepository;
import edu.icet.crm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ObjectMapper mapper;
    private final ProductRepository repository;

    @Override
    public Product persist(Product product) {
        ProductEntity entity = mapper.convertValue(product, ProductEntity.class);
        ProductEntity savedEntity = repository.save(entity);
        product.setId(savedEntity.getId());
        Product savedProduct = mapper.convertValue(savedEntity,Product.class);
        return savedProduct;
    }
}
