package univ.tours.WeBuyWSApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.Store;

@RepositoryRestResource
public interface StoreJPARepository extends JpaRepository<Store, Long> {

	@Query(value = "SELECT * FROM store", nativeQuery = true)
	public List<Store> findAllStore();

	@Modifying
	@Query(value = "DELETE FROM Store WHERE store_id =?1", nativeQuery = true)
	public void delete(int id);

	@Query(value = "SELECT * from Store WHERE store_id=?1", nativeQuery = true)
	public Store getById(int id);
}
