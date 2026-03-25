package com.test;

import com.test.EmployeeDao;
import com.test.Employee;

import java.util.List;

public class EmployeeService {

    EmployeeDao dao = new EmployeeDao();

    public void save(Employee emp) {
        dao.saveEmployee(emp);
    }

    public List<Employee> getAllHQL() {
        return dao.listAllEmployees();
    }

    public List<Employee> getAllNamed() {
        return dao.getAllNamed();
    }
}