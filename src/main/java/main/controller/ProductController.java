package main.controller;

import main.entity.Product;
import main.jparepo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: beren
 * Date: 22.06.2014
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/{materialName}")
    public String getProduct(@PathVariable String materialName, Model model) {
        Product product = productRepository.findByMaterialName(materialName);
        model.addAttribute("product", product);
        return "product-page";
    }
}
