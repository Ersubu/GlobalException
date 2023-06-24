package com.dakr.service;


import java.util.List;
import java.util.Optional;

import com.dakr.model.Interns;

public interface InternsService {
	
	public Interns internsDetails(Interns ie1);
	public Interns getIntern(Integer inId);
	public List<Interns> getAllInterns();
	public Interns updateInterndetails(Interns ie2);
	public Interns updateInterns(Interns ien2);
	public void deleteOneEmp(Integer ie3);
	public void deleteAllInterns();

}
