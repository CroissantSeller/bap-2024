package at.spengergasse.hawara;

import at.spengergasse.hawara.persistence.AssetHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AssetHistoryServiceRepositoryTest {

    private @Autowired AssetHistoryRepository AhRp;

    @Test
    public void saveAndRetrieveAssetHistory() {
        //TODO
    }
}
