package at.spengergasse.hawara.service;

import at.spengergasse.hawara.domain.Stock;
import at.spengergasse.hawara.persistence.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    private StockRepository repository;
    public StockService(StockRepository stockRepository){
        this.repository = stockRepository;
    }

    public Stock getStockById(String id){
        return repository.findById(id).orElse(null);
    }

    public List<Stock> getAllStocks(){
        return repository.findAll();
    }

    public void createStock(Stock stock){
        repository.save(stock);
    }

    public void updateStock(Stock stock){
        repository.save(stock);
    }

    public void deleteStock(String id){
        repository.deleteById(id);
    }
}