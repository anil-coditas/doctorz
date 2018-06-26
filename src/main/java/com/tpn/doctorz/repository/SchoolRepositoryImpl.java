package com.tpn.doctorz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.tpn.doctorz.domain.School;

public class SchoolRepositoryImpl implements SchoolRepositoryCustom {

	@PersistenceContext
    EntityManager entityManager;
	
    @Override
    public List<School> getNamesLike(String schoolName) {
        Query query = entityManager.createNativeQuery("SELECT * FROM school t WHERE t.school_name LIKE ?", School.class);
        query.setParameter(1, schoolName + "%");
        return query.getResultList();
    }

}
