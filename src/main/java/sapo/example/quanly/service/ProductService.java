package sapo.example.quanly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sapo.example.quanly.entities.Product;
import sapo.example.quanly.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    /* Lay ra DANH SACH TOAN BO SAN PHAM */
    public ServiceResult listProduct(){
        ServiceResult result = new ServiceResult();
        result.setData(productRepository.findAll());
        return result;
    }

    /*
    Lay ra thong tin 1 SAN PHAM bang ID
     */
    public ServiceResult inforProduct(long id){
        ServiceResult result = new ServiceResult();
        Product product = productRepository.findById(id).orElse(null);
        result.setData(product);
        return result;
    }

    /*
    Lay ra thong tin cac san pham trong 1 DANH MUC SAN PHAM
     */
    public ServiceResult findByPortfolio(String portfolio){
        ServiceResult result = new ServiceResult();
        List<Product> product = productRepository.findByPortfolio(portfolio);
        result.setData(product);
        return result;
    }

    /*
    CREATE thong tin SAN PHAM
     */
    public ServiceResult createProduct(Product product){
        ServiceResult result = new ServiceResult();
        if(productRepository.findByName(product.getName())!=null){
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("This product is existed!");
            return result;
        }
        result.setData(productRepository.save(product));
        return result;
    }

    /*
    UPDATE thong tin san pham
     */
    public ServiceResult updateProduct(Product product){
        ServiceResult result = new ServiceResult();
        if(!productRepository.findById(product.getId()).isPresent()){
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("This product not found!");
        } else {
            result.setData(productRepository.save(product));
        }
        return result;
    }

    /*
    Delete 1 san pham
     */
    public ServiceResult deleteProduct(long id){
        ServiceResult result = new ServiceResult();
        Product product = productRepository.findById(id).orElse(null);
        if(product == null){
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("This product not found!");
        }else{
            productRepository.delete(product);
            result.setStatus(ServiceResult.Status.SUCCESS);
            result.setMessage("Success");
        }
        return result;
    }

}
