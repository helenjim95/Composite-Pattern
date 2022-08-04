package de.tum.in.ase.eist;

// TODO: Simple component class extends component superclass
public class Worker extends Employee {
    private String name;

	// TODO: 1: Implement the Worker class - super fields from the superclass
    public Worker(String name) {
        super(name);
    }

	// TODO: 3: Implement methods and override
    public void listHierarchy(int level) {
        printName(level);
    }

    public String getName() {
        return this.name;
    }
    public void printName(int level) {
        System.out.println("-".repeat(level) + this.name);
    }
}
