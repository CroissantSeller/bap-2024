package at.spengergasse.hawara.service;

import at.spengergasse.hawara.domain.AssetHistory;
import at.spengergasse.hawara.persistence.AssetHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetHistoryService {

    private AssetHistoryRepository repository;
    public AssetHistoryService(AssetHistoryRepository assetHistoryRepositoryRepository){
        this.repository = assetHistoryRepositoryRepository;
    }

    public AssetHistory getAssetHistoryById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<AssetHistory> getAllAssetHistory(){
        return repository.findAll();
    }

    public void createAssetHistory(AssetHistory assetHistory){
        repository.save(assetHistory);
    }

    public void updateAssetHistory(AssetHistory assetHistory){
        repository.save(assetHistory);
    }

    public void deleteAssetHistory(Long id){
        repository.deleteById(id);
    }
}