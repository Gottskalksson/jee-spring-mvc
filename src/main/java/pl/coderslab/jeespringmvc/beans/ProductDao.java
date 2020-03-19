package pl.coderslab.jeespringmvc.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDao {

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Makaron", 1.25));
        products.add(new Product(2, "Olej", 2));
        products.add(new Product(3, "Miod", 10));

        return products;
    }
}
