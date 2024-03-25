package main;

import java.util.List;
import java.util.Scanner;

import company.Department;
import company.Employee;
import file.EmployeeAction;
import file.FileIO;

public class RunProgram {
	public static List<Employee> domainList = FileIO.ReadEM();
	public static List<Department> deList = FileIO.ReadDE();
	public static List<Employee> emList = FileIO.ReadEM();

	public static void main(String[] args) {

		Department de = new Department();
		Employee em = new Employee();
		Scanner sc = new Scanner(System.in);
		Department department = null;
		Employee employee = null;
		/*while (true) {
			System.out.println("List menu");
			System.out.println("1:	ADD new Department ");
			System.out.println("2:	Search Department");
			System.out.println("3:	ADD new Employee ");
			System.out.println("4:	ADD employee to department");
			System.out.println("5:	Search Employee ");
			System.out.println("Enter Selection :  ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				department = de.createDepartment(sc);
				deList.add(department);
				break;
			case "2":
				System.out.println("Input department name to search: ");
				String searchName = sc.nextLine();
				System.out.println(de.search(searchName, deList));
				break;
			case "3":
				employee = em.addNewEmp(sc);
				emList.add(employee);
				break;
			case "4":
				System.out.println("Enter Name Of Domain :");
				String searchDomain = sc.nextLine();
				System.out.println(em.addToDepartment(searchDomain, domainList));
				break;
			case "5":
				System.out.println("Enter Name Of Employee : ");
				String searchEmp = sc.nextLine();
				System.out.println(em.searchEmp(searchEmp, emList));
				break;
			default:
				FileIO.writeDE(deList);
				FileIO.writeEM(emList);
				return;
			}
		}*/

		de.createDepartment(sc);
		EmployeeAction employeeAction = new EmployeeAction();
		List<Employee> findByDEID = employeeAction.findEmployeeByDepartmentID("DM11111");
		System.out.println(findByDEID);

	}

}
