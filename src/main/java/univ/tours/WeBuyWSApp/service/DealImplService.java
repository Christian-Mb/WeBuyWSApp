package univ.tours.WeBuyWSApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.tours.WeBuyWSApp.dao.DealJPARepository;
import univ.tours.WeBuyWSApp.entity.Deal;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DealImplService implements IDealService{

    @Autowired
    DealJPARepository dealRepo;

    @Override
    public List<Deal> getAllDeals() {
        return dealRepo.getAllDeals();
    }

    @Override
    public void delete(int id) {
        dealRepo.delete(id);
    }

    @Override
    public Deal getById(int id) {
       return dealRepo.getById(id);
    }
}
