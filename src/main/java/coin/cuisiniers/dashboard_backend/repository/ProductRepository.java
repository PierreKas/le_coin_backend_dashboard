package coin.cuisiniers.dashboard_backend.repository;

import coin.cuisiniers.dashboard_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("SELECT p FROM Product p where remainingQuantity<10 and remainingQuantity<>0")
    List<Product> findLowQtyProducts();

    @Query("SELECT p FROM Product p where remainingQuantity=0")
    List<Product> findOutOfStockProducts();

}
