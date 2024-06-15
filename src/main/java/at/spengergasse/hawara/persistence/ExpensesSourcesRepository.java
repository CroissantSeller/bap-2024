package at.spengergasse.hawara.persistence;

import at.spengergasse.hawara.domain.ExpensesSources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesSourcesRepository extends JpaRepository<ExpensesSources, Long> {

}
