package main;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import company.Department;
import company.Employee;


public class PrintFile {
	
	public void printDe(){
		Department de = new Department();
		
		try {
			final SimpleDateFormat SPF = new SimpleDateFormat("yyyy-MM-dd");
			PrintWriter pw = new PrintWriter("C:/Users/KHONG TUAN ANH/workspace/ReworkBasicTest/Department.dat");
			pw.println(de);
			pw.println(SPF.format(new Date()));
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
	}
	public void printEm(){
		Employee emp = new Employee();
		try {
			final SimpleDateFormat SPF = new SimpleDateFormat("yyyy-MM-dd");
			PrintWriter pw = new PrintWriter("C:/Users/KHONG TUAN ANH/workspace/ReworkBasicTest/employee.dat");
			pw.println(emp);
			pw.println(SPF.format(new Date()));
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
