package gb.spring.sem4TaskHome4.controllers;

import gb.spring.sem4TaskHome4.domain.Product;
import gb.spring.sem4TaskHome4.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Контроллеры обработки задач
 */
@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * Метод получение страницы по адресу:
     * http://localhost:8080/product
     * */


    @GetMapping("/products")
    public String viewProducts (Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    /**
     * Метод отправки данных из формы по адресу:
     * @return Возвращает страницу с результатов ввода пользователя
     * http://localhost:8080/products и вывод их на странице
     */
    @PostMapping("/products")
    public String addProduct(Product prod, Model model) {
        productService.addProduct(prod);
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }
}
