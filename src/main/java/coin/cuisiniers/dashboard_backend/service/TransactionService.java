package coin.cuisiniers.dashboard_backend.service;

import coin.cuisiniers.dashboard_backend.model.Transaction;
import coin.cuisiniers.dashboard_backend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    public TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions (){
        return transactionRepository.findAll();
    }
    public List<Transaction> getTransactionsByDate (String theDate){
        return transactionRepository.findTransationsByDate(theDate);
    }
}
