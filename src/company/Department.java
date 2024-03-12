package company;

import java.util.List;
import java.util.Scanner;

public class Department {
	private String deID;
	private String name;
	private String domain;
	
	
	
	public String getId() {
		return deID;
	}
	public void setId(String id) {
		this.deID = id;
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
		return   deID +","+ name +","+ domain;
	}
	public Department(){
		
	}
	
	public Department(String id, String name, String domain){
		this.deID = id;
		this.name = name;
		this.domain = domain;
		
	}
	
	public Department createDepartment(Scanner sc){
		System.out.print("ADD new departmentID :  ");
		String id  =  sc.nextLine();
		System.out.print("Department name : ");
		String name = sc.nextLine();
		System.out.print(" What Is Domain : ");
		String domain = sc.nextLine();
		Department department = new Department(id ,name,domain);
		return department;
	}
	
	public Department search(String departmentName, List<Department> list) {
		for (int i = 0; i < list.size(); i++) {
			if (departmentName.equals(list.get(i).getName())) {
				return list.get(i);
			}
		}
		return null;
	}
}
