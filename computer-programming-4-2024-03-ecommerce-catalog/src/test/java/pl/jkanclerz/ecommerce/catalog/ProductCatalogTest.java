package pl.jkanclerz.ecommerce.catalog;

import org.junit.jupiter.api.Test;
import pl.jkanclerz.ecommerce.catalog.catalog.Product;
import pl.jkanclerz.ecommerce.catalog.catalog.ProductCatalog;

import static org.assertj.core.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

public class ProductCatalogTest {

    @Test
    void itListAvailableProducts() {
        ProductCatalog catalog = thereIsProductCatalog();

        List<Product> products = catalog.allProducts();

        assert products.isEmpty();
    }



    @Test
    void itAllowsToAddProduct() {
        ProductCatalog catalog = thereIsProductCatalog();

        catalog.addProduct("Lego set 8083", "Nice one");
        List<Product> products = catalog.allProducts();

        assertThat(products)
                .hasSize(1);
    }

    @Test
    void itLoadsSingleProductById() {
        ProductCatalog catalog = thereIsProductCatalog();
        String id = catalog.addProduct("Lego set 8083", "Nice one");

        Product loaded = catalog.getProductDetails(id);

        assertThat(id).isEqualTo(loaded.getId());
    }

    @Test
    void itChangePriceForProducts() {
        ProductCatalog catalog = thereIsProductCatalog();
        String id = catalog.addProduct("Lego set 8083", "Nice one");

        catalog.changePrice(id, BigDecimal.valueOf(10.10));
        Product loaded = catalog.getProductDetails(id);

        assertThat(loaded.getPrice()).isEqualTo(BigDecimal.valueOf(10.10));
    }

    private static ProductCatalog thereIsProductCatalog() {
        return new ProductCatalog();
    }
}
