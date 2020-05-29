package univ.tours.WeBuyWSApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.StoreAddress;

import java.util.List;

@RepositoryRestResource
public interface StoreAddressJPARepository extends JpaRepository<StoreAddress, Long> {

    @Query(value = "SELECT * FROM store_address WHERE store_id = ?1", nativeQuery = true)
    public List<StoreAddress> storeAddress(int id);

    @Modifying
    @Query(value = "DELETE FROM store_address WHERE address_id = ?1", nativeQuery = true)
    public void delete(int id);
}
