package az.temp.firsrtspringboot.service;

import az.temp.firsrtspringboot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {
    private List<Employee> employees;

    public EmpService() {
        this.employees = new ArrayList<>();

        this.employees.add(new Employee((long) 1, "Eldar"));
        this.employees.add(new Employee((long) 2, "Elshad"));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployesById(Long id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    public Employee postNewEmployee(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    public Employee deleteEmployee(Long id) {
        Employee employee = null;

        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                employees.remove(e);
                employee = e;
            }
        }

        return employee;
    }

    public Employee updateEmployee (Employee employee) {
        for (Employee e : employees) {
            if (e.getId().equals(employee.getId())) {
                employees.remove(e);
                this.employees.add(employee);
            }
        }
        return employee;
    }
}
