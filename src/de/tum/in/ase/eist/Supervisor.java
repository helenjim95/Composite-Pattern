package de.tum.in.ase.eist;

import java.util.*;

public class Supervisor extends Employee {
    private String name;
    private LinkedList<Employee> supervisedEmployees;

	// TODO 2: Implement the Supervisor class - done
    public Supervisor(String name) {
        super(name);
        supervisedEmployees = new LinkedList<>();
    }
	// TODO 3: Implement listHierarchy() for Supervisor - done

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
        try {
            for (Employee employee : supervisedEmployees) {
                employee.listHierarchy(level + 1);
            }
        } catch (NullPointerException e){
            throw new NullPointerException();
        }
    }
    public void printName(int level) {
        System.out.println("-".repeat(level) + this.name);
    }

    public LinkedList<Employee> getSupervisedEmployees() {
        return supervisedEmployees;
    }
}
