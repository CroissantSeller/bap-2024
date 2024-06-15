package at.spengergasse.hawara.controllers;
import at.spengergasse.hawara.domain.Company;
import at.spengergasse.hawara.exceptions.NotFoundException;
import at.spengergasse.hawara.persistence.CompanyRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CompanyController {
    private final CompanyRepository repository;

    CompanyController(CompanyRepository repository){
        this.repository = repository;
    }
    @GetMapping("/company")
    List<Company> all(){
        return repository.findAll();
    }

    @PostMapping("/company")
    Company newCompany(@RequestBody Company newCompany){
        return repository.save(newCompany);
    }

    @GetMapping("/company/{id}")
    Company one(@PathVariable Long id) throws NotFoundException {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Company with id "+id+" does not exist!")); //To be configured
    }

    @PutMapping("/company/{id}")
    Company replaceCompany(@RequestBody Company newCompany, @PathVariable Long id){
        return repository.findById(id)
                .map(company -> {
                    company.setName(newCompany.getName());
                    company.setAmountOfShares(newCompany.getAmountOfShares());
                    company.setValuePerShare(company.getValuePerShare());
                    company.setLastDividendPayment(newCompany.getLastDividendPayment());
                    return repository.save(company);
                })
                .orElseGet(() -> {
                    newCompany.setId(id);
                    return repository.save(newCompany);
                });
    }

    @DeleteMapping("/company/{id}")
    void deleteCompany(@PathVariable Long id){
        repository.deleteById(id);
    }
}