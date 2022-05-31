package de.tum.in.ase.eist;

public class Worker extends Employee {
    private String name;

	// TODO 1: Implement the Worker class - done
    public Worker(String name) {
        super(name);
    }
	// TODO 3: Implement listHierarchy() for Worker - done
    public void listHierarchy(int level) {
        printName(level);
    }

    public String getName() {
        return name;
    }
    public void printName(int level) {
        System.out.println("-".repeat(level) + name);
    }
}
