package codegym;


import codegym.model.Province;
import codegym.repository.ProvineRepository;
import codegym.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvineRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province provine) {
        provinceRepository.save(provine);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}
