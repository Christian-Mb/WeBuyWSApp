package univ.tours.WeBuyWSApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import univ.tours.WeBuyWSApp.dao.ProductJPARepository;
import univ.tours.WeBuyWSApp.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    @Autowired
    ProductJPARepository productRepo;

    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void add(@RequestBody Product product){
        productRepo.save(product);
    }
}
