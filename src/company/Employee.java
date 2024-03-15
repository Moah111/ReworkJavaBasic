package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.Check;

public class Employee {
	Department department = new Department();
	private String emID;
	private String title;
	private String fullName;
	private String domainName;
	private String position;
	private String monthSalary;
	private String deID;

	public String getEmID() {
		return emID;
	}

	public void setEmID(String emID) {
		this.emID = emID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getWorkDM() {
		return domainName;
	}

	public void setWorkDM(String workDM) {
		this.domainName = workDM;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(String monthSalary) {
		this.monthSalary = monthSalary;
	}

	public String getDeID() {
		return department.getdeId();
	}

	public void setDeID(String deID) {
		this.deID = deID;
	}

	public String toString() {
		return emID + ":" + title + ":" + fullName + ":" + domainName + ":"
				+ position + ":" + monthSalary + ":" + deID;
	}

	public Employee() {

	}

	public Employee(String emID, String title, String fullName, String workDM,
			String position, String monthSalary, String deID) {
		this.emID = emID;
		this.fullName = fullName;
		this.title = title;
		this.position = position;
		this.domainName = workDM;
		this.deID = deID;
		this.monthSalary = monthSalary;
	}

	public Employee addNewEmp(Scanner sc) {
		System.out.print("Employee ID(Enter EM first) : ");
		String emID = sc.nextLine();
		while (Check.isInCorrectFormat(emID, "EM")) {
			System.out.print("Employee ID is not correct, try again :  ");
			deID = sc.nextLine();
		}
		System.out.print("The title(Mr,Mrs or Ms) :  ");
		String title = sc.nextLine();
		System.out.print("Full Name :  ");
		String fullName = sc.nextLine();
		System.out.print("Work Domain : ");
		String domainName = sc.nextLine();
		System.out.print("Position  :  ");
		String position = sc.nextLine();
		System.out.print("Month Salary : ");
		String monthSalary = sc.nextLine();
		System.out.print("Deparment ID(Enter DM First) : ");
		String deID = sc.nextLine();

		Employee employee = new Employee(emID, title, fullName, domainName,
				position, monthSalary, deID);
		return employee;
	}

	public Employee searchEmp(String employeeName, List<Employee> emList) {
		for (int i = 0; i < emList.size(); i++) {
			if (employeeName.equals(emList.get(i).getFullName())) {
				return emList.get(i);
			}

		}
		return null;

	}

	public List<Employee> addToDepartment(String employeeDomain,
			List<Employee> domainList) {

		List<Employee> departmentList = new ArrayList<>();
		for (int i = 0; i < domainList.size(); i++) {
			if (employeeDomain.equals(domainList.get(i).domainName)) {
				departmentList.add(domainList.get(i));
			}

		}
		return departmentList;
	}
}