package coin.cuisiniers.dashboard_backend.controller;

import coin.cuisiniers.dashboard_backend.model.ProductHistory;
import coin.cuisiniers.dashboard_backend.service.ProdHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/history")
public class ProdHistoryController {
    @Autowired
    public ProdHistoryService prodHistoryService;

    @GetMapping("/by-code/{productCode}")
    public ResponseEntity<List<ProductHistory>> getHistoryByCode(@PathVariable String productCode){
        List<ProductHistory> productHistoryList =prodHistoryService.getProductHistoryByCode(productCode);
        return new ResponseEntity<>(productHistoryList, HttpStatus.OK);
    }
}
