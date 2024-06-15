package at.spengergasse.hawara.service;

import at.spengergasse.hawara.domain.Company;
import at.spengergasse.hawara.domain.Users;
import at.spengergasse.hawara.persistence.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;
    public CompanyService(CompanyRepository companyRepository){
        this.repository = companyRepository;
    }

    public Company getCompanyById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Company> getAllCompanies(){
        return repository.findAll();
    }

    public void save(Company company){
        repository.save(company);
    }

    public void updateCompany(Company company){
        repository.save(company);
    }

    public void deleteCompany(Long id){
        repository.deleteById(id);
    }

}