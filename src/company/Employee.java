package company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	Department department = new Department();
	private String emID;
	private String title;
	private String fullName;
	private String workDM;
	private String position;
	private double monthSalary; 
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
		return workDM;
	}
	public void setWorkDM(String workDM) {
		this.workDM = workDM;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public double getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	
	public String getDeID() {
		return department.getId();
	}
	public void setDeID(String deID) {
		this.deID = deID;
	}
	
	public String toString() {
		return "Employee [emID=" + emID + ", title=" + title + ", fullName="
				+ fullName + ", workDM=" + workDM + ", position=" + position
				+ ", monthSalary=" + monthSalary + ", deID=" + deID + "]";
	}
	public Employee(){
		
	}
	
	public Employee(String emID,String title,String fullName,String workDM,
			String position,double monthSalary,String deID){
		this.emID = emID;
		this.fullName = fullName;
		this.title = title;
		this.position = position;
		this.workDM = workDM;
		this.deID = deID;
		this.monthSalary = monthSalary;
	}
	
	public Employee addNewEmp(){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Employee ID : ");
		String emID = sc.nextLine();
		System.out.println("The title :  ");
		String title = sc.nextLine();
		System.out.println("Full Name :  ");
		String fullName = sc.nextLine();
		System.out.println("Work Domain : ");
		String workDM = sc.nextLine();
		System.out.println("Position  :  ");
		String position = sc.nextLine();
		System.out.println(" Month Salary : ");
		double monthSalary = sc.nextDouble();
		sc.close();
		Employee employee = new Employee(emID, title, fullName, workDM,
				position,monthSalary,deID);
		
		System.out.println(employee);
		
		
		try {
			final SimpleDateFormat SPF = new SimpleDateFormat("yyyy-MM-dd");
			PrintWriter pw = new PrintWriter("C:/Users/KHONG TUAN ANH/workspace/ReworkBasicTest/employee.dat");
			pw.println(employee);
			pw.println(SPF.format(new Date()));
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		return employee;
		
	}
	
	
	
}