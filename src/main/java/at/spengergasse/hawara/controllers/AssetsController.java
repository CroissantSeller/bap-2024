package at.spengergasse.hawara.controllers;

import at.spengergasse.hawara.domain.Assets;
import at.spengergasse.hawara.exceptions.NotFoundException;
import at.spengergasse.hawara.persistence.AssetsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetsController {
    private final AssetsRepository repository;

    AssetsController(AssetsRepository repository){this.repository = repository;}
    @GetMapping("/assets")
    List<Assets> all(){return repository.findAll();}

    @PostMapping("/assets")
    Assets newAssets(@RequestBody Assets newAssets){return repository.save(newAssets);}

    @GetMapping("/assets/{id}")
    Assets one(@PathVariable Long id) throws NotFoundException{
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Asset with the id "+id+" does not exist!"));
    }

    @PutMapping("/assets/{id}")
    Assets replaceAssets(@RequestBody Assets newAssets, @PathVariable Long id){
        return repository.findById(id)
                .map(assets -> {
                    assets.setHistory(newAssets.getHistory());
                    assets.setExpenses(newAssets.getExpenses());
                    assets.setIncome(newAssets.getIncome());
                    assets.setTotalAssets(newAssets.getTotalAssets());
                    return repository.save(assets);
                })
                .orElseGet(() -> {
                    newAssets.setId(id);
                    return repository.save(newAssets);
                });
    }

    @DeleteMapping("/assets/{id}")
    void deleteCompany(@PathVariable Long id){repository.deleteById(id);}
}
