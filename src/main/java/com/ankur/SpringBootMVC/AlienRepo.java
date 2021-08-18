package com.ankur.SpringBootMVC;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ankur.SpringBootMVC.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
	
//	List<Alien> findByAname(String aname);
//	List<Alien> findByAnameOrderByAidDesc(String aname);
	@Query("from Alien where aname = :name order by aid desc")
	List<Alien> find(@Param("name") String aname);
}
