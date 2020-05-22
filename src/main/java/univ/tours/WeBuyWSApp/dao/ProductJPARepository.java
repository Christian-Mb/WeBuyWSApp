package univ.tours.WeBuyWSApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.Product;

@RepositoryRestResource
public interface ProductJPARepository extends JpaRepository<Product, Long> {

}
