package at.spengergasse.hawara.service;

import at.spengergasse.hawara.domain.IncomeSources;
import at.spengergasse.hawara.persistence.IncomeSourcesRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IncomeSourcesService {

    private IncomeSourcesRepository repository;
    public IncomeSourcesService(IncomeSourcesRepository incomeSourcesRepository){
        this.repository = incomeSourcesRepository;
    }

    public IncomeSources getIncomeSourceById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<IncomeSources> getAllIncomeSources(){
        return repository.findAll();
    }

    public void createIncomeSource(IncomeSources incomeSource){
        repository.save(incomeSource);
    }

    public void updateIncomeSource(IncomeSources incomeSource){
        repository.save(incomeSource);
    }

    public void deleteIncomeSource(Long id){
        repository.deleteById(id);
    }
}