package springboot.emsbackend.service;

import java.util.List;

import springboot.emsbackend.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto creatEmployee(EmployeeDto employeeDto);

	EmployeeDto getEmployeeById(Long employeeId);

	List<EmployeeDto>getAllEmployees();

	EmployeeDto updateEmployee(Long employeeId , EmployeeDto updateEmployeeDto);
	
	void deleteEmployee(Long employeeId);
}
