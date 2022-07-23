package de.tum.in.ase.eist;


// TODO: Client class
public final class EmployeeOverviewSystem {

	private EmployeeOverviewSystem() {
	}

//	 TODO: interacts directly with the component interface or the container class
	public static void main(String[] args) {
		// 3: Uncomment the following code for testing
		Supervisor ceo = new Supervisor("Chief Zed");
		ceo.hireEmployee(new Worker("Molly Wright"));
		ceo.hireEmployee(new Worker("Derrick Cunningham"));

		Supervisor supervisor1 = new Supervisor("Kevin Brown");
		supervisor1.hireEmployee(new Worker("James Edwards"));
		supervisor1.hireEmployee(new Worker("Laurel Weaver"));

		ceo.hireEmployee(supervisor1);
		ceo.listHierarchy(0);
	}

}
