package univ.tours.WeBuyWSApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import univ.tours.WeBuyWSApp.dao.PurshaseGroupJPARepository;
import univ.tours.WeBuyWSApp.entity.PurshaseGroup;

import java.util.List;

@RestController
@RequestMapping("/group")
public class PurchaseRestController {

    @Autowired
    PurshaseGroupJPARepository groupRepo;

    @GetMapping("/get/{deal_id}")
    public List<PurshaseGroup> getGroupByDealId(@PathVariable(value = "deal_id") int deal_id){
        return groupRepo.getByDealId(deal_id);
    }
    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addGroup(@RequestBody PurshaseGroup group){
        groupRepo.save(group);
    }
}
