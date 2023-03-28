package com.icodeap.cascada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentService {
	
	@Autowired
	private DepartamentRepository departamentRepository;
	
	public Departament save(Departament departament) {
		return departamentRepository.save(departament);
	}

}
