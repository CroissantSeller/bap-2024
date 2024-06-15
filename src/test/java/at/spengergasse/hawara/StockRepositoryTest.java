package at.spengergasse.hawara;

import at.spengergasse.hawara.domain.Company;
import at.spengergasse.hawara.domain.Stock;
import at.spengergasse.hawara.persistence.StockRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StockRepositoryTest {


    private @Autowired StockRepository SRepo;

    Company companies = new Company(11L,"MICROSOFT CORP", 2.3f, 359.0500f, LocalDate.now());

    @Test
    public void saveStock() {

        var stock = Stock.builder()
                .stockName("PostAG-A")
                .value(12.3f)
                .buyDate(LocalDate.parse("2022-12-24"))
                .sellDate(LocalDate.now())
                .company(companies)
                .build();


        var saved = SRepo.saveAndFlush(stock);
        assertThat(saved).isSameAs(stock);
        assertThat(saved.getCompany()).isNotNull();

    }
}
