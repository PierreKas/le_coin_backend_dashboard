package coin.cuisiniers.dashboard_backend.repository;

import coin.cuisiniers.dashboard_backend.model.ProductHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdHistoryRepository extends JpaRepository<ProductHistory,Integer> {
   @Query("SELECT h FROM ProductHistory h WHERE productCode=?1")
    public List<ProductHistory> findHistoryByCode(String productCode);
}
