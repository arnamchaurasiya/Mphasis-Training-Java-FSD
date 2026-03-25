package com.test;

import com.test.*;
import com.test.EmployeeService;

public class App {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        // Save Data
        PermanentEmployee p = new PermanentEmployee();
        p.setName("Arnam");
        p.setSalary(55000);

        ContractEmployee c = new ContractEmployee();
        c.setName("John");
        c.setContractDuration(12);

        service.save(p);
        service.save(c);

        // HQL
        System.out.println("\n---- HQL Output ----");
        service.getAllHQL().forEach(e -> System.out.println(e.getName()));

        // Named Query
        System.out.println("\n---- Named Query Output ----");
        service.getAllNamed().forEach(e -> System.out.println(e.getName()));
    }
}