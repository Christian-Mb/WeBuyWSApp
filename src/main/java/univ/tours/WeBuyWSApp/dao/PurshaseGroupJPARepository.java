package univ.tours.WeBuyWSApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.PurshaseGroup;

import java.util.List;

@RepositoryRestResource
public interface PurshaseGroupJPARepository extends JpaRepository<PurshaseGroup, Long> {

    @Query(value = "SELECT * FROM PurshaseGroup WHERE deal_id = ?1", nativeQuery = true)
    public List<PurshaseGroup> getByDealId(int id);
}
