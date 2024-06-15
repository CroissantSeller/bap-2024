package at.spengergasse.hawara;

import at.spengergasse.hawara.domain.*;
import at.spengergasse.hawara.persistence.StockListRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class StockListRepositoryTest {


    private @Autowired StockListRepository SLR;
    //private @Autowired StockRepository SRepo;

    @Test
    public void saveStockList(){
        LocalDate buyDate = LocalDate.parse("2024-01-17");
        LocalDate sellDate = LocalDate.parse("2024-02-18");
        LocalDate lastDividendPayment = LocalDate.parse("2023-11-17");
        Company company = new Company(11L,"MICROSOFT CORP", 2.3f, 359.0500f, lastDividendPayment);
        Users user = new Users(1L,new Username("lucilul"), new Password("hai22505@spengergasse.at"), new Email("Lucca123!"));
        Stock stock = new Stock("ATX", 3327.04f, sellDate, buyDate, company, user);
        ArrayList<Stock> stockl = new ArrayList<>();
        stockl.add(stock);
        var stockList = StockList.builder()
                .ListOfStock(stockl).build();

        //var savedstock = SRepo.saveAndFlush(stock);
        var saved = SLR.saveAndFlush(stockList);
        //assertThat(savedstock).isNotNull();
        assertThat(saved).isSameAs(stockList);
        assertThat(saved.getId()).isNotNull();
    }

}
