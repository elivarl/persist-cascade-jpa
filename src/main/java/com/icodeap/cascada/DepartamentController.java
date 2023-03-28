package com.icodeap.cascada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departament")
public class DepartamentController {
	
	@Autowired
	private DepartamentService departamentService;
	
	@GetMapping
	public Departament saveDepartament() {
		Departament departament = new Departament();
		departament.setNombre("SISTEMAS");
		
		Employe employe1 = new Employe();
		Employe employe2 = new Employe();
		Employe employe3 = new Employe();
		
		employe1.setNombre("Luis");
		employe1.setSalario(1200);
		employe2.setNombre("Alberto");
		employe2.setSalario(800);
		
		employe3.setNombre("Alonso");
		employe3.setSalario(700);
		
		departament.addEmploye(employe1);
		departament.addEmploye(employe2);
		departament.addEmploye(employe3);		
		
		
		return departamentService.save(departament);
	}

}
