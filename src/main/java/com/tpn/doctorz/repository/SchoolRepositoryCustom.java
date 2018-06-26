package com.tpn.doctorz.repository;

import java.util.List;
import com.tpn.doctorz.domain.School;

public interface SchoolRepositoryCustom {
	 List<School> getNamesLike(String schoolName);
}
