package az.temp.firstspringboot.controller;

import az.temp.firstspringboot.dao.EmployeeEntity;
import az.temp.firstspringboot.model.EmployeeDto;
import az.temp.firstspringboot.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/employees/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public Iterable<EmployeeEntity> getAllEmployees (){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "{id}")
    public Optional<EmployeeEntity> getEmployeeById (@PathVariable Long id){
        return employeeService.getEmployeesById(id);
    }

    @PostMapping(path = "/{id}")
    public void postNewEmployee(@RequestBody EmployeeDto employeeDto){
        employeeService.postNewEmployee(employeeDto);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping(path = "/{id}")
    public void updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        employeeService.putEmployee(employeeEntity);
    }
}
