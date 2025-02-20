package coin.cuisiniers.dashboard_backend.service;

import coin.cuisiniers.dashboard_backend.model.ProductHistory;
import coin.cuisiniers.dashboard_backend.repository.ProdHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdHistoryService {

    @Autowired
    public ProdHistoryRepository prodHistoryRepository;

    public List<ProductHistory> getProductHistoryByCode(String productCode){
        return prodHistoryRepository.findHistoryByCode(productCode);
    }
}
