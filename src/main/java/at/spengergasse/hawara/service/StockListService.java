package at.spengergasse.hawara.service;

import at.spengergasse.hawara.domain.StockList;
import at.spengergasse.hawara.persistence.StockListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockListService {

    private StockListRepository repository;
    public StockListService(StockListRepository stockListRepository){
        this.repository = stockListRepository;
    }

    public StockList getStockListById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<StockList> getAllStockLists(){
        return repository.findAll();
    }

    public void createStockList(StockList stockList){
        repository.save(stockList);
    }

    public void updateStockList(StockList stockList){
        repository.save(stockList);
    }

    public void deleteCompany(Long id){
        repository.deleteById(id);
    }
}