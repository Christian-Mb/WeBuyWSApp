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
        Store store = new Store();
        store.setStore_id((long) 1);
        store.setLogo("https://lesmureaux.info/wp-content/uploads/cache/images/2020/05/Auchan-Les-Mureaux/Auchan-Les-Mureaux-1426267381.jpg");
        store.setName("Auchan");
        storeRepo.save(store);
        store.setStore_id((long) 2);
        store.setLogo("https://www.carrefour.fr/images/meta-social-default-image-generic.png");
        store.setName("Carrefour");
        storeRepo.save(store);
        return storeRepo.findAllStore();
    }
}
