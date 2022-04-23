package ru.gb.lesson6.homework6.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.gb.homework3.model.Product;
import ru.gb.homework3.service.ProductService;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
@Slf4j
public class ShopController {

    private final ProductService productService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("product", new Product());
        return "product-add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processForm(Product product) {
        if (product.getId() == null) {
            productService.save(product);
        } else {
            productService.add(product);
        }
        return "redirect:/product/all";
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getProductId(Model model, @PathVariable Integer id) {
        Product product;
        product = productService.findById(id);
        model.addAttribute("product", product);
        return "product";
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String getAllMessages(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product-list";
    }

}
