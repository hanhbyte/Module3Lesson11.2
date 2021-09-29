package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getlistProduct();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product products);

    void remove(int id);
}
