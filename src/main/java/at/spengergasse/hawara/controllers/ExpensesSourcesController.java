package at.spengergasse.hawara.controllers;

import at.spengergasse.hawara.domain.ExpensesSources;
import at.spengergasse.hawara.exceptions.NotFoundException;
import at.spengergasse.hawara.persistence.ExpensesSourcesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ExpensesSourcesController {
    private final ExpensesSourcesRepository repository;

    ExpensesSourcesController(ExpensesSourcesRepository repository){this.repository = repository;}

    @GetMapping("/expensessources")
    List<ExpensesSources> all(){return  repository.findAll();}

    @PostMapping("/expensessources")
    ExpensesSources newExpensesSources(@RequestBody ExpensesSources newExpensesSources){return repository.save(newExpensesSources);}

    @GetMapping("/expensessources/{id}")
    ExpensesSources one(@PathVariable Long id) throws NotFoundException{
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Expenses source with id "+id+" does not exist!"));
    }

    @PutMapping("/expensessources/{id}")
    ExpensesSources replaceExpensesSources(@RequestBody ExpensesSources newExpensesSources, @PathVariable Long id){
        return repository.findById(id)
                .map(expensesSources -> {
                    expensesSources.setExpensesCategory(newExpensesSources.getExpensesCategory());
                    expensesSources.setDate(newExpensesSources.getDate());
                    expensesSources.setAmount(newExpensesSources.getAmount());
                    return repository.save(expensesSources);
                })
                .orElseGet(() -> {
                    newExpensesSources.setId(id);
                    return repository.save(newExpensesSources);
                });
    }

    @DeleteMapping("/expensessources/{id}")
    void deleteExpensesSources(@PathVariable Long id){repository.deleteById(id);}
}