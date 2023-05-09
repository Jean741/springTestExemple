package tn.ondev.testJU.repository;

import tn.ondev.testJU.entities.Product;

public interface ProductRepository {
    Product findById(Long id);
    void save(Product product);
    void deleteById(Long id);
}