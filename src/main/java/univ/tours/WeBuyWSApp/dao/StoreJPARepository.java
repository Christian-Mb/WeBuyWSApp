package univ.tours.WeBuyWSApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.Store;

@RepositoryRestResource
public interface StoreJPARepository extends JpaRepository<Store, Long> {

	@Query(value = "SELECT * FROM store s INNER JOIN store_address sa ON s.address_id = sa.address_id", nativeQuery = true)
	public List<Store> findAllStore();
}
