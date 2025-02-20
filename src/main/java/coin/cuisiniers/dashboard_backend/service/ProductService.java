package coin.cuisiniers.dashboard_backend.service;

import coin.cuisiniers.dashboard_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import coin.cuisiniers.dashboard_backend.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public List<Product> getLowQtyProducts(){
        return productRepository.findLowQtyProducts();
    }

    public List<Product> getOutOfStockProducts(){
        return productRepository.findOutOfStockProducts();
    }

}
