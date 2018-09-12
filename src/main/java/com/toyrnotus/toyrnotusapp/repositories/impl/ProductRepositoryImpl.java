package com.toyrnotus.toyrnotusapp.repositories.impl;

import com.toyrnotus.toyrnotusapp.entities.Product;
import com.toyrnotus.toyrnotusapp.repositories.ProductRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepositoryImpl implements ProductRepository {

    private static final Map<String, Product> DATABASE = new HashMap<>();
    static
    {
        Product data1 = new Product("2", "43 Piece dinner Set", new BigDecimal(12.95), "CoolKidZ", "InStock", "3_to_5", "Female");
        Product data2 = new Product("7", "Best Friends Forever Magnetic Dress Up", new BigDecimal(24.95), "CoolKidZ", "InStock", "3_to_5", "Female");
        Product data3 = new Product("6", "Princess Palace", new BigDecimal(24.95), "CoolKidZ", "InStock", "3_to_5", "Female");
        Product data4 = new Product("22", "Nutbrown Here", new BigDecimal(12.99), "CoolKidZ", "Sold Out", "Baby", "Neutral");

        DATABASE.put(data1.getProductId(), data1);
        DATABASE.put(data2.getProductId(), data2);
        DATABASE.put(data3.getProductId(), data3);
        DATABASE.put(data4.getProductId(), data4);
    }

    @Override
    public List<Product> findByAgeAndGender(String age, String gender) {
        List<Product> result = new ArrayList<>();

        DATABASE.forEach((key, value) -> {
            if (value.getAge().equals(age) && value.getGender().equals(gender)) {
                result.add(value);

            }
        });

        return result;
    }
}
