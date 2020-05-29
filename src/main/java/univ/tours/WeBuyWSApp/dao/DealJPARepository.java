package univ.tours.WeBuyWSApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.Deal;

import java.util.List;

@RepositoryRestResource
public interface DealJPARepository extends JpaRepository<Deal, Long> {

    @Query(value = "SELECT * FROM deal", nativeQuery = true)
    public List<Deal> getAllStores();

    @Query(value= "SELECT * FROM deal WHERE store_id = ?1", nativeQuery = true)
    public List<Deal> getByStoreId(int id);
}
