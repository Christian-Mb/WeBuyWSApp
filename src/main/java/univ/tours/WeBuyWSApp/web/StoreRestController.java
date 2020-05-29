package univ.tours.WeBuyWSApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import univ.tours.WeBuyWSApp.dao.StoreJPARepository;
import univ.tours.WeBuyWSApp.entity.Store;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreRestController {

    @Autowired
    StoreJPARepository storeRepo;

    @GetMapping("/AllStores")
    public List<Store> getAllStores(){
        return storeRepo.findAllStore();
    }
}
