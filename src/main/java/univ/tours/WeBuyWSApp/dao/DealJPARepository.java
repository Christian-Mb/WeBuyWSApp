package univ.tours.WeBuyWSApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.Deal;

import java.util.List;

@RepositoryRestResource
public interface DealJPARepository extends JpaRepository<Deal, Integer> {

    @Query(value = "SELECT * FROM deal", nativeQuery = true)
    public List<Deal> getAllDeals();

    @Query(value= "SELECT * FROM deal WHERE store_id = ?1", nativeQuery = true)
    public List<Deal> getByStoreId(int id);

    @Query(value = "SELECT MAX(deal_id) FROM deal", nativeQuery = true)
    public Long getLastId();

    @Modifying
    @Query(value = "DELETE FROM deal WHERE deal_id = ?1", nativeQuery = true)
    public void delete(int id);

    @Query(value = "SELECT * FROM deal WHERE deal_id = ?1", nativeQuery = true)
    public Deal getById(int id);
}
