package at.spengergasse.hawara.controllers;

import at.spengergasse.hawara.domain.Stock;
import at.spengergasse.hawara.exceptions.NotFoundException;
import at.spengergasse.hawara.persistence.StockRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    private final StockRepository repository;

    StockController(StockRepository repository){this.repository = repository;}

    @GetMapping("/stock")
    List<Stock> all(){return repository.findAll();}

    @PostMapping("/stock")
    Stock newStock(@RequestBody Stock newStock){
        return repository.save(newStock);
    }

    @GetMapping("@stock/{stockName}")
    Stock one(@PathVariable String stockName) throws NotFoundException{
        return repository.findById(stockName)
                .orElseThrow(() -> new NotFoundException("Stock with name "+stockName+" does not exist"));
    }

    @PutMapping("/stock/{stockName}")
    Stock replaceStock(@RequestBody Stock newStock, @PathVariable String stockName){
        return repository.findById(stockName)
                .map(stock -> {
                    stock.setStockName(newStock.getStockName());
                    stock.setValue(newStock.getValue());
                    stock.setCompany(newStock.getCompany());
                    stock.setBuyDate(newStock.getBuyDate());
                    stock.setSellDate(newStock.getSellDate());
                    return repository.save(stock);
                })
                .orElseGet(() -> {
                    newStock.setStockName(stockName);
                    return repository.save(newStock);
                });
    }

    @DeleteMapping("/stock/{stockName}")
    void deleteStock(@PathVariable String stockName){repository.deleteById(stockName);}
}
