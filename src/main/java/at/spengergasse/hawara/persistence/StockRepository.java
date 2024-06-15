package at.spengergasse.hawara.persistence;

import at.spengergasse.hawara.domain.Company;
import at.spengergasse.hawara.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {
}
