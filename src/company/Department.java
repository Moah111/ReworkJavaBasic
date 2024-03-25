package company;

import java.util.List;
import java.util.Scanner;

import main.Check;


public class Department {
	private String deID;
	private String name;
	private String domain;

	public String getdeId() {
		return deID;
	}

	public void setdeId(String deId) {
		this.deID = deId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String toString() {
		return deID + "," + name + "," + domain;
	}

	public Department() {

	}

	public Department(String deID, String name, String domain) {
		this.deID = deID;
		this.name = name;
		this.domain = domain;

	}

	public Department createDepartment(Scanner sc) {
		System.out.print("ADD new departmentID, Start With DE first, follow by 5 digits :  ");
		String deID = sc.nextLine();
		while (Check.isCorrectFormat(deID, "DE")) {
			System.out.print("Department ID is not correct, try again :  ");
			deID = sc.nextLine();
		}

		System.out.print("Department name : ");
		String name = sc.nextLine();
		System.out.print(" What Is Domain : ");
		String domain = sc.nextLine();
		return new Department(deID, name, domain);
	}

	public Department search(String departmentName, List<Department> deList) {
		for (int i = 0; i < deList.size(); i++) {
			if (departmentName.equals(deList.get(i).getName())) {
				return deList.get(i);
			}
		}
		return null;
	}

}
