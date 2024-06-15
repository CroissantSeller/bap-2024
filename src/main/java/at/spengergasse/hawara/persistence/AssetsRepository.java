package at.spengergasse.hawara.persistence;

import at.spengergasse.hawara.domain.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository extends JpaRepository<Assets, Long> {

}
