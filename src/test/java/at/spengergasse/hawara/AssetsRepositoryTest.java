package at.spengergasse.hawara;

import at.spengergasse.hawara.domain.Assets;
import at.spengergasse.hawara.domain.AssetHistory;
import at.spengergasse.hawara.domain.ExpensesSources;
import at.spengergasse.hawara.domain.IncomeSources;
import at.spengergasse.hawara.persistence.AssetsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AssetsRepositoryTest {

    @Autowired
    private AssetsRepository assetsRepository;

    /*
    @Test
    public void saveAndRetrieveAssets() {
        // Given
        Assets assets = Assets.builder()
                .history(createSampleAssetHistoryList())
                .expenses(createSampleExpensesList())
                .income(createSampleIncomeList())
                .totalAssets(1000.0f)
                .build();

        // When
        Assets savedAssets = assetsRepository.saveAndFlush(assets);
        Assets retrievedAssets = assetsRepository.findById(savedAssets.getId()).orElse(null);

        // Then
        assertThat(retrievedAssets).isNotNull();
        assertThat(retrievedAssets.getId()).isEqualTo(savedAssets.getId());
        assertThat(retrievedAssets.getHistory()).hasSize(2); // Adjust based on your test data
        assertThat(retrievedAssets.getExpenses()).hasSize(2); // Adjust based on your test data
        assertThat(retrievedAssets.getIncome()).hasSize(2); // Adjust based on your test data
        assertThat(retrievedAssets.getTotalAssets()).isEqualTo(1000.0f);
    }

    // Helper method to create sample AssetHistory list
    private List<AssetHistory> createSampleAssetHistoryList() {
        AssetHistory history1 = new AssetHistory();
        history1.setDescription("History 1");
        history1.setDate(LocalDate.now());

        AssetHistory history2 = new AssetHistory();
        history2.setDescription("History 2");
        history2.setDate(LocalDate.now());

        List<AssetHistory> historyList = new ArrayList<>();
        historyList.add(history1);
        historyList.add(history2);

        return historyList;
    }

    // Helper method to create sample ExpensesSources list
    private List<ExpensesSources> createSampleExpensesList() {
        ExpensesSources expenses1 = new ExpensesSources();
        expenses1.setDescription("Expenses 1");
        expenses1.setAmount(200.0f);

        ExpensesSources expenses2 = new ExpensesSources();
        expenses2.setDescription("Expenses 2");
        expenses2.setAmount(300.0f);

        List<ExpensesSources> expensesList = new ArrayList<>();
        expensesList.add(expenses1);
        expensesList.add(expenses2);

        return expensesList;
    }

    // Helper method to create sample IncomeSources list
    private List<IncomeSources> createSampleIncomeList() {
        IncomeSources income1 = new IncomeSources();
        income1.setDescription("Income 1");
        income1.setAmount(500.0f);

        IncomeSources income2 = new IncomeSources();
        income2.setDescription("Income 2");
        income2.setAmount(600.0f);

        List<IncomeSources> incomeList = new ArrayList<>();
        incomeList.add(income1);
        incomeList.add(income2);

        return incomeList;
    }
    */
}
