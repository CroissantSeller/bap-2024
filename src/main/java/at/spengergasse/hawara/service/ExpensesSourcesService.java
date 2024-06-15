package at.spengergasse.hawara.service;
import at.spengergasse.hawara.domain.ExpensesSources;
import at.spengergasse.hawara.persistence.ExpensesSourcesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesSourcesService {

    private ExpensesSourcesRepository repository;
    public ExpensesSourcesService(ExpensesSourcesRepository expensesSourcesRepository){
        this.repository = expensesSourcesRepository;
    }

    public ExpensesSources getExpensesSourceById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<ExpensesSources> getAllExpensesSources(){
        return repository.findAll();
    }

    public void createExpensesSource(ExpensesSources expensesSources){
        repository.save(expensesSources);
    }

    public void updateExpensesSources(ExpensesSources expensesSources){
        repository.save(expensesSources);
    }

    public void deleteExpensesSources(Long id){
        repository.deleteById(id);
    }
}