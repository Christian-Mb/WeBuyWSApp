package univ.tours.WeBuyWSApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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
        return dealRepo.getAllDeals();
    }

    @GetMapping("/get/{store_id}")
    public List<Deal> getDealByMagazin(@PathVariable(value="store_id") int store_id){
        return dealRepo.getByStoreId(store_id);
    }

    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addDeal(@RequestBody Deal deal){
        //Long id = dealRepo.getLastId();
        //deal.setDeal_id(id+1);
        dealRepo.save(deal);
    }
}
