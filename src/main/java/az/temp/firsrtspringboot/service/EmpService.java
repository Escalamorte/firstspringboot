package az.temp.firsrtspringboot.service;

import az.temp.firsrtspringboot.model.Emp;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {
    private List<Emp> emps;

    public EmpService() {
        this.emps = new ArrayList<>();

        this.emps.add(new Emp((long) 1, "Eldar"));
        this.emps.add(new Emp((long) 2, "Elshad"));
    }

    public List<Emp> getAllEmployees (){
        return emps;
    }

    public Emp getEmployesById (Long id) {
        return emps.stream().filter(emp -> emp.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Emp> postNewEmployee (Long id, String name) {
        this.emps.add(new Emp(id, name));
        return emps;
    }

    public List<Emp> deleteEmployee (Long id){
        this.emps.remove(emps.stream().filter(emp -> emp.getId().equals(id)).findFirst().orElse(null));
        return emps;
    }
}
