package univ.tours.WeBuyWSApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import univ.tours.WeBuyWSApp.dao.ParticipateToPurshaseJPARepository;
import univ.tours.WeBuyWSApp.entity.ParticipateToPurshase;

@RestController
@RequestMapping("/participate")
public class ParticipateRestController {

    @Autowired
    ParticipateToPurshaseJPARepository participateRepo;

    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void participate(@RequestBody ParticipateToPurshase participate){
        participateRepo.save(participate);
    }
}
