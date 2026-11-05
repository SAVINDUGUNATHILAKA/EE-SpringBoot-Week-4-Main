package edu.icet.Service;

import edu.icet.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl {

    public List<Product> getProductList(){
        return Arrays.asList(
                new Product("T-shirt","A mens T-shirt",200.0,"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_t.png"),
                new Product("B-shirt","A mens B-shirt",200.0,"https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_t.png"),
                new Product("B-shirt","A mens B-shirt",200.0,"https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_t.png")
        );
    }
}
