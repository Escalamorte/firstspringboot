package az.temp.firstspringboot.service;

import az.temp.firstspringboot.dao.EmployeeEntity;
import az.temp.firstspringboot.dao.EmployeeRepository;
import az.temp.firstspringboot.mapper.EmployeeMapper;
import az.temp.firstspringboot.model.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Iterable<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<EmployeeEntity> getEmployeesById(Long id) {
        return employeeRepository.findById(id);
    }


    public void postNewEmployee(EmployeeDto employeeDto) {
        this.employeeRepository.save(EmployeeMapper.mapDtoToEntity(employeeDto));
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public void putEmployee (EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
    }
}
