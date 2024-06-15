package at.spengergasse.hawara;

import at.spengergasse.hawara.domain.IncomeCategories;
import at.spengergasse.hawara.domain.IncomeSources;
import at.spengergasse.hawara.persistence.IncomeSourcesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class IncomeSourcesRepositoryTest{

    private @Autowired IncomeSourcesRepository ISR;


    LocalDate dateString = LocalDate.parse("2023-10-22");

    @Test
    public void saveISR(){
        var IS = IncomeSources.builder()
                .date(dateString).amount(1400.0f).IncomeCategory(IncomeCategories.FixedIncome).build();
    }

    @Test
    public void ensureSavingAndReadingWorks(){
        var IS = IncomeSources.builder()
                .date(dateString).amount(1400.0f).IncomeCategory(IncomeCategories.FixedIncome).build();

        var saved = ISR.saveAndFlush(IS);
        assertThat(saved).isSameAs(IS);
        assertThat(saved.getId()).isNotNull();
    }
}