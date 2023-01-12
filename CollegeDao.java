package com.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CollegeDao {
	@Autowired
	CollegeRepro cr;
	public String addstaff(CollegeModel cm) {
		cr.save(cm);
		return "Successfull added";
	}
	public String updateinfo(CollegeModel bc) {
		cr.save(bc).getId();
		return "data update";
	}
public String deleteinfo(Integer id) {
	cr.deleteById(id);
	return "data delete";
}
public List<CollegeModel>getAll() {
	return cr.findAll();
}
}
