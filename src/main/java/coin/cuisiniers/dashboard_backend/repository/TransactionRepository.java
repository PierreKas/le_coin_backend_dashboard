package coin.cuisiniers.dashboard_backend.repository;

import coin.cuisiniers.dashboard_backend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
    @Query("SELECT t FROM Transaction t WHERE sellingDate LIKE?1 || '%'")
    public List<Transaction> findTransationsByDate(String theDate);
}
