package com.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {
@Autowired
CollegeDao cd;
public String addstaff(CollegeModel cm) {
	return cd.addstaff(cm);
}
public String updateinfo(CollegeModel bc) {
return cd.updateinfo(bc);	
}
public String deleteinfo(Integer id) {
return cd.deleteinfo(id);
}
public List<CollegeModel>getAll(){
return cd.getAll();
}

}
