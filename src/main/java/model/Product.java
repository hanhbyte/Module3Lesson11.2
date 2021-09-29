package model;

public class Product {
    static int count = 0;
    private int id;
    private String name;
    private String url;
    private int price;

    public Product(String name, String url, int price) {
    }

    public Product(int id, String name, String url, int price) {
        count++;
        this.id = id;
        this.name = name;
        this.url = url;
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
