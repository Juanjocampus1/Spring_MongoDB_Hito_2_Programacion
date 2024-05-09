package com.empresa.Hito_2_3T_Programacion.Controller;

import com.empresa.Hito_2_3T_Programacion.Entities.Products;
import com.empresa.Hito_2_3T_Programacion.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Products createProduct(@RequestBody Products products) {
        return productService.save(products);
    }

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public List<Products> findAll() {
        return productService.findAll();
    }

    @GetMapping("/findById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Products findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Products updateProduct(@PathVariable Long id, @RequestBody Products products) {
        return productService.update(id, products);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id) {
        productService.delete(id);
    }
}