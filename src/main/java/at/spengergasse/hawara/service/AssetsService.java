package at.spengergasse.hawara.service;

import at.spengergasse.hawara.domain.Assets;
import at.spengergasse.hawara.persistence.AssetsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetsService {

    private AssetsRepository repository;
    public AssetsService(AssetsRepository assetsRepository){
        this.repository = assetsRepository;
    }

    public Assets getAssetById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Assets> getAllAssets(){
        return repository.findAll();
    }

    public void createAsset(Assets assets){
        repository.save(assets);
    }

    public void updateAsset(Assets assets){
        repository.save(assets);
    }

    public void deleteAsset(Long id){
        repository.deleteById(id);
    }
}