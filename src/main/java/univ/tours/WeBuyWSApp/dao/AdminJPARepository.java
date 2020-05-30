package univ.tours.WeBuyWSApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.Admin;

@RepositoryRestResource
public interface AdminJPARepository extends JpaRepository<Admin, Long> {

    @Modifying
    @Query(value = "DELETE FROM admin WHERE user_id = ?1", nativeQuery = true)
    public void retrogradeUser(int id);
}
