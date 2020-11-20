package pl.dziechciaruk.zaliczenie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.dziechciaruk.zaliczenie.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
