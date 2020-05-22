package univ.tours.WeBuyWSApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.Deal_published;

@RepositoryRestResource
public interface Deal_publishedJPARepository extends JpaRepository<Deal_published, Long> {

}
