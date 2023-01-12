package com.boot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


	public interface CollegeRepro extends JpaRepository<CollegeModel, Integer> {
		@org.springframework.data.jpa.repository.Query (value="select * from College where name like %:name%", nativeQuery = true)
		public List<CollegeModel>getByName(@Param("name")String name);

	
}
