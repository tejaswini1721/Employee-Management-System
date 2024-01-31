package springboot.emsbackend.mapper;

import springboot.emsbackend.dto.EmployeeDto;
import springboot.emsbackend.entity.Employee;

public class EmployeeMapper {
	
	public static EmployeeDto maptoEmployeeDto (Employee employee) {
		return new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail()
				
				);
				
		
		
	}
	
	public static Employee maptoEmployee (EmployeeDto employeeDto) {
		return new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail()
				
				);
	}

	
}
