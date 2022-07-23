package de.tum.in.ase.eist;

import java.util.*;

// TODO: Container class representing complex components.
public class Supervisor extends Employee {
    private String name;
//    TODO: Declare array field to store references to sub-components. List of component class type
    private List<Employee> supervisedEmployees =  new LinkedList<>();

	// TODO: 2: Implement the Supervisor class
    public Supervisor(String name) {
        super(name);
    }

    // TODO 3: delegate method calls to sub-components

    public String getName() {
        return this.name;
    }
    public void hireEmployee(Employee employee) {
        supervisedEmployees.add(employee);
    }
    public void fireEmployee(Employee employee) {
        supervisedEmployees.remove(employee);
    }
    public void listHierarchy(int level) {
        printName(level);
        for (Employee employee : supervisedEmployees) {
            employee.listHierarchy(level + 1);
        }
    }
    public void printName(int level) {
        System.out.println("-".repeat(level) + getName());
    }

    public List<Employee> getSupervisedEmployees() {
        return supervisedEmployees;
    }
}
