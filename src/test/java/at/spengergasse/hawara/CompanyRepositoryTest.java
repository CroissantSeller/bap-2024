package at.spengergasse.hawara;

import at.spengergasse.hawara.domain.Company;
import at.spengergasse.hawara.persistence.CompanyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CompanyRepositoryTest {

    private @Autowired CompanyRepository CRepo;

    @Test
    public void saveCompany(){
             var company = Company.builder()
                .name("TestCompany")
                .valuePerShare(50.0f)
                     .amountOfShares(12.3f)
                .lastDividendPayment(LocalDate.now()).build();

        var saved = CRepo.saveAndFlush(company);

        assertThat(saved).isNotNull();

        //See Teams meeting 29.09. for fixes

    }

}