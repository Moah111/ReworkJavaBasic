package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import company.Department;
import company.Employee;

public class RunProgram {
	
	public static void main(String[] args) {
		PrintFile pf = new PrintFile();
		Department de = new Department();
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("List menu");
		System.out.println("1:  ADD new Department ");
		System.out.println("2:  ADD new Employee ");
		System.out.println("Enter Selection :  ");
		int menu = sc.nextInt();
		Department department = null;
		Employee employee = null;
		switch(menu){
			case 1: 
			department = de.createDepartment();break;
			case 2: 
			employee = emp.addNewEmp();break;
		}
	
		sc.close();
		
		
	}
	
}
