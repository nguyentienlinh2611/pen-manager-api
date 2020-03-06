package sapo.example.quanly.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sapo.example.quanly.entities.Product;
import sapo.example.quanly.repository.ProductRepository;
import sapo.example.quanly.service.ProductService;
import sapo.example.quanly.service.ServiceResult;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private ProductService productService;

    @Autowired
    ProductRepository productRepository;

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ResponseEntity<Iterable<Product>> showListProduct() {
//        Iterable<Product> listProduct = productRepository.findAll();
//        return new ResponseEntity(listProduct, HttpStatus.OK);
//    }

    /*
    Path: /api/products - GET - Lay ra DANH SACH SAN PHAM
     */
    @GetMapping("/products")
    public ResponseEntity<ServiceResult> showListProduct(){
        return new ResponseEntity<ServiceResult>(productService.listProduct(), HttpStatus.OK);
    }

    /*
    Path: /api/products/{id} - GET - Thong tin 1 san pham
     */
    @GetMapping("/products/{id}")
    public ResponseEntity<ServiceResult> getInforProduct(@PathVariable Long id){
        return new ResponseEntity<ServiceResult>(productService.inforProduct(id), HttpStatus.OK);
    }

    /*
    Path: /api/products/{portfolio} - Get - Lay danh sach cac san pham trong danh muc
     */
    @GetMapping("/products/portfolio/{portfolio}")
    public ResponseEntity<ServiceResult> getProductByPortfolio(@PathVariable String portfolio){
        return new ResponseEntity<ServiceResult>(productService.findByPortfolio(portfolio), HttpStatus.OK);
    }

    /*
    Path: /api/products - POST - Tao 1 san pham
     */
    @PostMapping("/products")
    public  ResponseEntity<ServiceResult> createProduct(@RequestBody Product product){
        return new ResponseEntity<ServiceResult>(productService.createProduct(product), HttpStatus.OK);
    }

    /*
    Path: /api/products - PUT - Update thong tin san pham
     */
    @PutMapping("/products")
    public ResponseEntity<ServiceResult> updateProduct(@RequestBody Product product){
        return new ResponseEntity<ServiceResult>(productService.updateProduct(product), HttpStatus.OK);
    }

    /*
    Path: /api/products - DELETE - Delete 1 san pham
     */
    @DeleteMapping("/products/{id}")
    public ResponseEntity<ServiceResult> deleteProduct(@PathVariable Long id){
        return new ResponseEntity<ServiceResult>(productService.deleteProduct(id), HttpStatus.OK);
    }
}
