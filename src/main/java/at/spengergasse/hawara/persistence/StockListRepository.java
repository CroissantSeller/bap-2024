package at.spengergasse.hawara.persistence;

import at.spengergasse.hawara.domain.StockList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockListRepository extends JpaRepository<StockList, Long> {

}
