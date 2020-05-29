package univ.tours.WeBuyWSApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import univ.tours.WeBuyWSApp.dao.DealJPARepository;
import univ.tours.WeBuyWSApp.entity.Deal;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/deals")
public class DealRestController {

    @Autowired
    DealJPARepository dealRepo;

    @GetMapping("/AllDeals")
    public List<Deal> getAllDeals(){
        return dealRepo.getAllStores();
    }

    @GetMapping("/get/{store_id}")
    public List<Deal> getDealByMagazin(@PathParam(value="store_id") Integer store_id){
        return dealRepo.getByStoreId(store_id);
    }
}
