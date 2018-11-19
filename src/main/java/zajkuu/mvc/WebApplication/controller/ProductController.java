package zajkuu.mvc.WebApplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import zajkuu.mvc.WebApplication.domain.Product;
import zajkuu.mvc.WebApplication.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        Product product = productService.getOne(id);
        model.addAttribute("product", product);
        return "product";
    }
    @RequestMapping("/")
    public String allProducts(Model model) {
        List<Product> productList = productService.getAll();
        model.addAttribute("products", productList);
        return "productList";
    }
    @RequestMapping("/update/{id}")
    public String productToUpdate(@PathVariable Integer id, Model model){
        Product product = productService.getOne(id);
        model.addAttribute(product);
        return "productEdit";
    }

    @RequestMapping("/update")
    public String updateProduct(Product product){
        /*Product toUpdate;
        toUpdate = product;*/
        productService.update(product);
        return "redirect:/product/";
    }

    @RequestMapping("/new")
    public String newProduct(Model model){
        model.addAttribute("product",
                new Product());
        model.addAttribute("title",
                "Creation");
        model.addAttribute("button",
                "Create product");
        return "productEdit";
    }
    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.delete(id);
        return "redirect:/product/";
    }
}
