package univ.tours.WeBuyWSApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.tours.WeBuyWSApp.dao.StoreAddressJPARepository;
import univ.tours.WeBuyWSApp.entity.StoreAddress;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StoreAddressImplService implements IStoreAddressService{

    @Autowired
    private StoreAddressJPARepository StoreAddressService;

    @Override
    public List<StoreAddress> storeAddress(int id) {
        return StoreAddressService.storeAddress(id);
    }

    @Override
    public void delete(int id) {
        StoreAddressService.delete(id);
    }


}
