package pl.coderslab.jeespringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.jeespringmvc.beans.Cart;
import pl.coderslab.jeespringmvc.beans.CartItem;
import pl.coderslab.jeespringmvc.beans.Product;
import pl.coderslab.jeespringmvc.beans.ProductDao;

import java.util.Random;
import java.util.stream.Collectors;

@Controller
public class CartController {

    private Cart cart;
    private ProductDao productDao;

    @Autowired
    public CartController(Cart cart, ProductDao productDao) {
        this.cart = cart;
        this.productDao = productDao;
    }

    @GetMapping("/cart")
    @ResponseBody
    public String getCartItems() {
        String cartSummary = cart.getCartItems().stream()
                .map(cartItem -> cartItem.getProduct().getName() + " -> " + cartItem.getQuantity())
                .collect(Collectors.joining("; "));

        return cartSummary;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart(@RequestParam int id, @RequestParam int quantity) {
        Product prod = productDao.getProducts().stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nie ma produktu o id = " + id));

        cart.getCartItems().add(new CartItem(prod, quantity));
        return "addtocart";
    }
}
