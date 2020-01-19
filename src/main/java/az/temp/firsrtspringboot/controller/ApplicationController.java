package az.temp.firsrtspringboot.controller;

import az.temp.firsrtspringboot.model.Emp;
import az.temp.firsrtspringboot.service.EmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("employees")
public class ApplicationController {
    private EmpService service;

    public ApplicationController(EmpService empService){
        this.service = empService;
    }

    @GetMapping
    public List<Emp> getAllEmployees (){
        return service.getAllEmployees();
    }

    @GetMapping(path = "/{id}")
    public Emp getEmployeeById (@PathVariable Long id){
        return service.getEmployesById(id);
    }
}
