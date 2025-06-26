package restservice;

import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> list) {
        this.employeeList = list;
    }
}

