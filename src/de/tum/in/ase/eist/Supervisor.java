package de.tum.in.ase.eist;

import java.util.*;

// TODO: Container class representing complex components.
public class Supervisor extends Employee {

//    TODO: Declare array field to store references to sub-components. List of component class type
    private List<Employee> supervisedEmployees;

	// TODO: 2: Implement the Supervisor class
    public Supervisor(String name) {
        super(name);
        this.supervisedEmployees = new ArrayList<>();
    }

    // TODO 3: delegate method calls to sub-components

    public void hireEmployee(Employee employee) {
        this.supervisedEmployees.add(employee);
    }
    public void fireEmployee(Employee employee) {
        this.supervisedEmployees.remove(employee);
    }
    public void listHierarchy(int level) {
        printName(level);
        for (Employee employee : supervisedEmployees) {
            employee.listHierarchy(level + 1);
        }
    }

    public List<Employee> getSupervisedEmployees() {
        return this.supervisedEmployees;
    }
}
