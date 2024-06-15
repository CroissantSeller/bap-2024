package at.spengergasse.hawara.persistence;

import at.spengergasse.hawara.domain.IncomeSources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeSourcesRepository extends JpaRepository<IncomeSources, Long> {

}