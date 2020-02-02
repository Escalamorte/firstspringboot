package az.temp.firstspringboot.mapper;

import az.temp.firstspringboot.dao.EmployeeEntity;
import az.temp.firstspringboot.model.EmployeeDto;

public class EmployeeMapper {
    public static EmployeeEntity mapDtoToEntity (EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDto.getId());
        employeeEntity.setName(employeeDto.getName());
        employeeEntity.setSalary(employeeDto.getSalary());

        return employeeEntity;
    }
}
