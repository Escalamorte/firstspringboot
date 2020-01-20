package az.temp.firsrtspringboot.controller;

import az.temp.firsrtspringboot.model.Employee;
import az.temp.firsrtspringboot.service.EmpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees/")
public class ApplicationController {
    private EmpService service;

    public ApplicationController(EmpService empService){
        this.service = empService;
    }

    @GetMapping
    public List<Employee> getAllEmployees (){
        return service.getAllEmployees();
    }

    @GetMapping(path = "{id}")
    public Employee getEmployeeById (@PathVariable Long id){
        return service.getEmployesById(id);
    }

    @PostMapping
    public Employee postNewEmployee(@RequestBody Employee employee){
        return service.postNewEmployee(employee);
    }

    @DeleteMapping(path = "/{id}")
    public Employee deleteEmployee(@PathVariable Long id) {
        return service.deleteEmployee(id);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }
}
