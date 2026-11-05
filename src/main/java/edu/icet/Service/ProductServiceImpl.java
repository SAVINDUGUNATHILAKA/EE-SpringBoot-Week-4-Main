package edu.icet.Service;

import edu.icet.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl {

    public List<Product> getProductList(){
        return Arrays.asList(
                new Product("T-shirt","A mens T-shirt",200.0,null),
                new Product("B-shirt","A mens B-shirt",200.0,null),
                new Product("C-shirt","A mens C-shirt",200.0,null)
        );
    }
}
