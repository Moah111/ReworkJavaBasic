package file;

import company.Employee;
import main.RunProgram;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAction {
    public List<Employee> findEmployeeByDepartmentID(String departmentID) {
        List<Employee> kq = new ArrayList<>();
        List<Employee> employees = RunProgram.emList;
        for(Employee employee : employees) {
            if (departmentID.equals(employee.getDeID())) {
                kq.add(employee);
            }
        }
        return kq;
    }
}
