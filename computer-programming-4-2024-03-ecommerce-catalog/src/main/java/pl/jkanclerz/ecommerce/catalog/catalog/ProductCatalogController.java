package pl.jkanclerz.ecommerce.catalog.catalog;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import pl.jkanclerz.ecommerce.catalog.catalog.Product;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class ProductCatalogController {
    ProductCatalog productCatalog;

    public ProductCatalogController(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @GetMapping("/api/hello")
    String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/api/names")
    List<String> getNames(){
        return Arrays.asList("Patryk","Kuba","Arek","Michał");
    }


    @GetMapping("/api/products")
    List<Product> getProducts(){
        return productCatalog.findAllProducts();
    }

}
