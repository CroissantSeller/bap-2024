package at.spengergasse.hawara.www;

import at.spengergasse.hawara.domain.Company;
import at.spengergasse.hawara.domain.Stock;
import at.spengergasse.hawara.domain.StockList;
import at.spengergasse.hawara.persistence.CompanyRepository;
import at.spengergasse.hawara.persistence.StockListRepository;
import at.spengergasse.hawara.service.CompanyService;
import at.spengergasse.hawara.service.StockListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stockList")
public class WebStockList {
    @Autowired
    private StockListService SLService;
    @Autowired
    private StockListRepository SLRepository;

    @GetMapping("/all")
    public String homePage(Model model) {
        List<StockList> StockLists = SLRepository.findAll();
        model.addAttribute("StockList", StockLists);
        return "stockList/dashboard";
    }
}
