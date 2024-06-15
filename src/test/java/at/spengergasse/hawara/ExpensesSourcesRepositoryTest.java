package at.spengergasse.hawara;

import at.spengergasse.hawara.domain.ExpensesCategories;
import at.spengergasse.hawara.domain.ExpensesSources;
import at.spengergasse.hawara.persistence.ExpensesSourcesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ExpensesSourcesRepositoryTest {

    @Autowired
    private ExpensesSourcesRepository ESR;
    LocalDate dateString = LocalDate.parse("2023-10-21");
    @Test
    public void saveESR(){
        var ES = ExpensesSources.builder()
                .date(dateString).amount(600.0f).ExpensesCategory(ExpensesCategories.Food).build();
    }

    @Test
    public void ensureSavingAndReadingWorks(){
        var ES = ExpensesSources.builder()
                .date(dateString).amount(600.0f).ExpensesCategory(ExpensesCategories.Food).build();

        var saved = ESR.saveAndFlush(ES);
        assertThat(saved).isSameAs(ES);
        assertThat(saved.getId()).isNotNull();
    }
}
