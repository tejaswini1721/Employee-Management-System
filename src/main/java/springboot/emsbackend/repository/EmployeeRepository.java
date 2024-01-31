package springboot.emsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.emsbackend.entity.Employee;


//here Employee specify the type of entity and long specify data type of primary key

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	 

}
