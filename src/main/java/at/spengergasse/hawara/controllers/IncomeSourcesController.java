package at.spengergasse.hawara.controllers;

import at.spengergasse.hawara.domain.IncomeSources;
import at.spengergasse.hawara.exceptions.NotFoundException;
import at.spengergasse.hawara.persistence.IncomeSourcesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IncomeSourcesController {
    private final IncomeSourcesRepository repository;

    IncomeSourcesController(IncomeSourcesRepository repository){this.repository = repository;}
    @GetMapping("/incomesources")
    List<IncomeSources> all(){return repository.findAll();}

    @PostMapping("/incomesources")
    IncomeSources newIncomeSources(@RequestBody IncomeSources newIncomeSources){return repository.save(newIncomeSources);}

    @GetMapping("/incomesources/{id}")
    IncomeSources one(@PathVariable Long id) throws NotFoundException{
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Income source with the id"+id+" not found!"));
    }

    @PutMapping("/incomesources/{id}")
    IncomeSources replaceIncomeSources(@RequestBody IncomeSources newIncomeSources, @PathVariable Long id){
        return repository.findById(id)
                .map(incomeSources -> {
                    incomeSources.setIncomeCategory(newIncomeSources.getIncomeCategory());
                    incomeSources.setDate(newIncomeSources.getDate());
                    incomeSources.setAmount(newIncomeSources.getAmount());
                    return repository.save(incomeSources);
                })
                .orElseGet(() -> {
                    newIncomeSources.setId(id);
                    return repository.save(newIncomeSources);
                });
    }

    @DeleteMapping("/incomesources/{id}")
    void deleteIncomeSources(@PathVariable Long id){repository.deleteById(id);}
}
