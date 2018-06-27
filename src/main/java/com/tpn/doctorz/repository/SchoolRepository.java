package com.tpn.doctorz.repository;

import com.tpn.doctorz.domain.School;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Spring Data JPA repository for the School entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    @Query("select distinct school from School school left join fetch school.user_school_mappings")
    List<School> findAllWithEagerRelationships();

    @Query("select school from School school left join fetch school.user_school_mappings where school.id =:id")
    School findOneWithEagerRelationships(@Param("id") Long id);

}
