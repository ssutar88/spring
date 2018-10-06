package spring.learning.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.learning.rest.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private List<Employee> myList = new ArrayList<>();
	{
		myList.add(new Employee(1, "Sup"));
	}
	
	
	@GetMapping
	public ResponseEntity<?> getEmployee(){
		
		return ResponseEntity.ok(myList);
		
	}

}
