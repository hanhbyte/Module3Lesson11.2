package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> productsMap;

    static {
        productsMap = new HashMap<>();
        productsMap.put(1, new Product("Iphone 5", "https://didongviet.vn/pub/media/catalog/product//a/p/apple-iphone-5s-vang-didongviet_.png", 1550));
        productsMap.put(2, new Product("Iphone 6", "https://didongviet.vn/pub/media/catalog/product//i/p/iphone-6s-didongviet_2.jpg", 1650));
        productsMap.put(3, new Product("Iphone 7", "https://clickbuy.com.vn/uploads/2019/03/iPhone-7-jetback.png", 1750));
        productsMap.put(4, new Product("Iphone 8", "https://dienthoaihay.vn/images/products/2020/08/27/original/iphone-8-plus-do_1598492332.jpg", 1850));
        productsMap.put(5, new Product("Iphone 9", "https://www.viettablet.com/images/thumbnails/480/516/detailed/27/iphone-9-plus-chinh-hang-xach-tay-vtb.jpg", 1950));
        productsMap.put(6, new Product("Iphone X", "https://cdn.tgdd.vn/Products/Images/42/114115/iphone-x-64gb-hh-600x600.jpg", 2050));
    }

    @Override
    public List<Product> getlistProduct() {
        return new ArrayList<>(productsMap.values());
    }

    @Override
    public void save(Product products) {
        productsMap.put(products.getId(), products);
    }

    @Override
    public Product findById(int id) {
        return productsMap.get(id);
    }

    @Override
    public void update(int id, Product products) {
        productsMap.put(id, products);
    }

    @Override
    public void remove(int id) {
        productsMap.remove(id);
    }
}
