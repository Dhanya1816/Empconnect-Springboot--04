package empmanagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import empmanagement.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
