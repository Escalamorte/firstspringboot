package az.temp.firsrtspringboot.controller;

import az.temp.firsrtspringboot.model.Emp;
import az.temp.firsrtspringboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees/")
public class ApplicationController {
    private EmpService service;

    public ApplicationController(EmpService empService){
        this.service = empService;
    }

    @GetMapping()
    public List<Emp> getAllEmployees (){
        return service.getAllEmployees();
    }

    @GetMapping(path = "{id}")
    public Emp getEmployeeById (@PathVariable Long id){
        return service.getEmployesById(id);
    }

    @PutMapping(path = "{id}")
    public List<Emp> postNewEmployee(@PathVariable Long id){
        return service.postNewEmployee(id, "Anar");
    }

    @DeleteMapping(path = "/{id}")
    public List<Emp> deleteEmployee(@PathVariable Long id) {
        return service.deleteEmployee(id);
    }
}
