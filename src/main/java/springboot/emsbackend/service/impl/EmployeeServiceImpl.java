package springboot.emsbackend.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import springboot.emsbackend.dto.EmployeeDto;
import springboot.emsbackend.entity.Employee;
import springboot.emsbackend.mapper.EmployeeMapper;
import springboot.emsbackend.repository.EmployeeRepository;
import springboot.emsbackend.service.EmployeeService;



@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeDto creatEmployee(EmployeeDto employeeDto) {
		
		Employee employee=EmployeeMapper.maptoEmployee(employeeDto);
		 Employee savedEmployee=employeeRepository.save(employee);
		return EmployeeMapper.maptoEmployeeDto(savedEmployee);
	}

	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId).orElse(null);
		return EmployeeMapper.maptoEmployeeDto(employee);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees=employeeRepository.findAll();
		return employees.stream().map((employee)->EmployeeMapper.maptoEmployeeDto(employee))
				.collect(Collectors.toList());
	}

	
	
	@Override
	public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
		Employee employee = employeeRepository.findById(employeeId).orElse(null);
//		Employee employee =employeeRepository.findById(employeeId).orElseThrow(
//				() -> new ResourceNotFoundException("Employee is not exist with given id" + employeeId));

		
		employee.setFirstName(updatedEmployee.getFirstName());
		employee.setLastName(updatedEmployee.getLastName());
		employee.setEmail(updatedEmployee.getEmail());
		
		Employee updateEmployeeobj= employeeRepository.save(employee);
		return EmployeeMapper.maptoEmployeeDto(updateEmployeeobj);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		
//		Employee employee =employeeRepository.findById(employeeId).orElseThrow(
//				() -> new ResourceNotFoundException("Employee is not exist with given id" , + employeeId));
		
		//Employee employee = employeeRepository.findById(employeeId).orElse(null);
		
		employeeRepository.deleteById(employeeId);
	}

}
