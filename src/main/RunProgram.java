package main;

import java.util.List;
import java.util.Scanner;
import company.Department;
import file.FileIO;

public class RunProgram {
	public static void main(String[] args) {

		List<Department> list = FileIO.read();
		Department de = new Department();
		Scanner sc = new Scanner(System.in);
		System.out.println("List menu");
		System.out.println("1:  ADD new Department ");
		System.out.println("2:  Search Department(with name)");
		System.out.println("3:  ADD new Employee ");
		System.out.println("4:  Quit");
		Department department = null;
		while (true) {
			System.out.println("Enter Selection :  ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				department = de.createDepartment(sc);
				list.add(department);
				break;
			case "2":
				System.out.println("Input department to search: ");
				String searchName = sc.nextLine();
				System.out.println(de.search(searchName, list));
				break;
			case "3":
				break;
			case "4":
			default:
				FileIO.write(list);
				return;
			}
		}

	}

}
