package at.spengergasse.hawara.controllers;

import at.spengergasse.hawara.domain.StockList;
import at.spengergasse.hawara.exceptions.NotFoundException;
import at.spengergasse.hawara.persistence.StockListRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockListController {
    private final StockListRepository repository;

    StockListController(StockListRepository repository){this.repository = repository;}
    @GetMapping("/stocklist")
    List<StockList> all(){return repository.findAll();}

    @PostMapping("/stocklist")
    StockList newStockList(@RequestBody StockList newStockList){
        return repository.save(newStockList);
    }

    @GetMapping("/stocklist/{id}")
    StockList one(@PathVariable Long id) throws NotFoundException{
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("StockList with the id "+id+" does not exist!"));
    }

    @PutMapping("/stocklist/{id}")
    StockList replaceStockList(@RequestBody StockList newStockList, @PathVariable Long id){
        return repository.findById(id)
                .map(stockList -> {
                    stockList.setListOfStock(newStockList.getListOfStock());
                    return repository.save(stockList);
                })
                .orElseGet(() -> {
                    newStockList.setId(id);
                    return repository.save(newStockList);
                });
    }
}