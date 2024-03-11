package company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		return "Department [id=" + deID + ", name=" + name + ", domain=" + domain
				+ "]";
	}
	public Department(){
		
	}
	
	public Department(String id, String name, String domain){
		this.deID = id;
		this.name = name;
		this.domain = domain;
		
	}
	
	public Department createDepartment(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ADD new departmentID :  ");
		String id  =  sc.nextLine();
		System.out.println("Department name : ");
		String name = sc.nextLine();
		System.out.println(" What Is Domain : ");
		String domain = sc.nextLine();
		sc.close();

		Department department = new Department(id , name, domain);
		System.out.println(department);
		try {
			final SimpleDateFormat SPF = new SimpleDateFormat("yyyy-MM-dd : hh-mm-ss");
			PrintWriter pw = new PrintWriter("C:/Users/KHONG TUAN ANH/workspace/ReworkBasicTest/Department.dat");
			pw.println(department);
			pw.println(SPF.format(new Date()));
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return department;
	}
	
	public Department searchDepartment(){
		
		return createDepartment();
		
	}
	

}
