package de.tum.in.ase.eist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Supervisor extends Employee {
    private String name;
    private List<Employee> employeeList = new List<>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Employee> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Employee employee) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Employee> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Employee> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Employee get(int index) {
            return null;
        }

        @Override
        public Employee set(int index, Employee element) {
            return null;
        }

        @Override
        public void add(int index, Employee element) {

        }

        @Override
        public Employee remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Employee> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Employee> listIterator(int index) {
            return null;
        }

        @Override
        public List<Employee> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

	// TODO 2: Implement the Supervisor class - done
    public Supervisor(String name) {
        super(name);
    }
	// TODO 3: Implement listHierarchy() for Supervisor - done

    public String getName() {
        return name;
    }
    public void hireEmployee(Employee employee) {
        employeeList.add(employee);
    }
    public void fireEmployee(Employee employee) {
        employeeList.remove(employee);
    }
    public void listHierarchy(int level) {
        printName(level);
        for (Employee employee : employeeList) {
            employee.listHierarchy(level + 1);
        }
    }
    public void printName(int level) {
        System.out.println("-".repeat(level) + name);
    }
}
