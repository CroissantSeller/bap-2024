package at.spengergasse.hawara.www;

import at.spengergasse.hawara.domain.Stock;
import at.spengergasse.hawara.persistence.CompanyRepository;
import at.spengergasse.hawara.persistence.StockRepository;
import at.spengergasse.hawara.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/stock")
public class WebStockController {
    @Autowired
    private StockService stockService;
    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/all")
    public String homePage(Model model) {
        List<Stock> stock = stockRepository.findAll();
        model.addAttribute("stock", stock);
        return "stock/dashboard";
    }

    @GetMapping("/addStock")
    public String register(Model model) {
        model.addAttribute("StockRequest", StockRequest.base());
        return "stock/addstock";
    }


/*    @PostMapping("/addStock")
    public String register(@ModelAttribute("StockRequest") Stock stock, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "stock/addstock";
        }
        stock.setBuyDate(LocalDate.now());
        stock.setSellDate(LocalDate.of(2030,10,10));

        stockService.createStock(Stock.builder().
                stockName(stock.getStockName()).
                value(stock.getValue()).
                sellDate(stock.getSellDate()).
                buyDate(stock.getBuyDate()).
                company(companyRepository.findByName(stock.getCompany().toString())).
                user(stock.getUser()).build());
        return "redirect:/stock/all";
    }*/
    @GetMapping("/updateStock/{name}")
    public String updateStock(Model model, @PathVariable String name) {
        Optional<Stock> stock = stockRepository.findById(name);
        model.addAttribute("StockRequest", stock);
        return "stock/updatestock";
    }
    @PostMapping("/updateStock/{name}")
    public String updateStock(@ModelAttribute("StockRequest") Stock newStock, @PathVariable String name){
        Stock stock = stockRepository.findById(name)
                .orElseThrow(() -> new IllegalArgumentException("Invalid stock id:" + name));
        stock.setStockName(newStock.getStockName());
        stock.setValue(newStock.getValue());
        stock.setBuyDate(newStock.getBuyDate());
        stock.setSellDate(newStock.getSellDate());
        stock.setCompany(newStock.getCompany());
        stockService.updateStock(stock);

        return "redirect:/stock/all";
    }

    @GetMapping("/delete/{name}")
    public String deleteStock(@PathVariable("name") String name ) {
        Stock stock = stockRepository.findById(name)
                .orElseThrow(() -> new IllegalArgumentException("Invalid stock id:" + name));
        stockRepository.delete(stock);
        return "stock/dashboard";
    }
}
