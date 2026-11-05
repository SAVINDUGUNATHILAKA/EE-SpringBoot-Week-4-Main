package edu.icet.Controller;

import edu.icet.Service.ProductServiceImpl;
import edu.icet.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    @GetMapping("/get-products")
    List<Product> getProduct(){
        ProductServiceImpl service = new ProductServiceImpl();
        List<Product> productList = service.getProductList();
        return productList;

    }


}
