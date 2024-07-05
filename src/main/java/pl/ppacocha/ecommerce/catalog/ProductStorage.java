package pl.ppacocha.ecommerce.catalog;

import java.util.List;

public interface ProductStorage {
    List<Product> allProducts();

    void add(Product product);

    Product getProductBy(String id);
}
