package com.tie.practical_testing.spring.api.service.product;

import com.tie.practical_testing.spring.api.service.product.response.ProductResponse;
import com.tie.practical_testing.spring.domain.product.Product;
import com.tie.practical_testing.spring.domain.product.ProductRepository;
import com.tie.practical_testing.spring.domain.product.ProductSellingStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductResponse> getSellingProducts() {
        List<Product> products = productRepository.findAllBySellingStatusIn(ProductSellingStatus.forDisplay());

        return products.stream()
                .map(ProductResponse::of)
                .collect(Collectors.toList());
    }

}