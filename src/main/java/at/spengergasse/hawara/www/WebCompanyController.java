package at.spengergasse.hawara.www;

import at.spengergasse.hawara.domain.Company;
import at.spengergasse.hawara.domain.Users;
import at.spengergasse.hawara.persistence.CompanyRepository;
import at.spengergasse.hawara.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/company")
public class WebCompanyController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/all")
    public String homePage(Model model) {
        List<Company> companies = companyRepository.findAll();
        model.addAttribute("company", companies);
        return "company/dashboard";
    }

    @GetMapping("/addCompany")
    public String register(Model model) {
        model.addAttribute("CompanyRequest", CompanyRequest.base());
        return "company/addcompany";
    }


    @PostMapping("/addCompany")
    public String register(@ModelAttribute("CompanyRequest") Company company, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "company/addcompany";
        }
        companyService.save(Company.builder().name(company.getName()).amountOfShares(company.getAmountOfShares()).valuePerShare(company.getValuePerShare()).lastDividendPayment(company.getLastDividendPayment()).build());
        return "redirect:/company/all";
    }
    @GetMapping("/updateCompany/{id}")
    public String updateCompany(Model model, @PathVariable Long id) {
        Optional<Company> company = companyRepository.findById(id);
        model.addAttribute("CompanyRequest", company);
        return "company/updatecompany";
    }
    @PostMapping("/updateCompany/{id}")
    public String updateCompany(@ModelAttribute("CompanyRequest") Company newCompany, @PathVariable Long id){
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid company id:" + id));
        company.setName(newCompany.getName());
        company.setAmountOfShares(newCompany.getAmountOfShares());
        company.setValuePerShare(newCompany.getValuePerShare());
        company.setLastDividendPayment(newCompany.getLastDividendPayment());
        companyService.updateCompany(company);

        return "redirect:/company/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteCompany(@PathVariable("id") long id ) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid company id:" + id));
        companyRepository.delete(company);
        return "company/dashboard";
    }
}
