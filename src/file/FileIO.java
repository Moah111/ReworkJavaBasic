package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import company.Department;
import company.Employee;

public class FileIO {

	public static List<Department> ReadDE() {
		List<Department> deResult = new ArrayList<>();
		try {
			File de = new File("Department.dat");
			Scanner scanner = new Scanner(new FileInputStream(de));
			while (scanner.hasNext()) {
				// ["id","name","domain"]
				String[] arrDepartment = scanner.nextLine().split(",");
				deResult.add(new Department(arrDepartment[0], arrDepartment[1],
						arrDepartment[2]));
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return deResult;
	}

	public static void writeDE(List<Department> list) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File(
					"Department.dat"), false));
			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static List<Employee> ReadEM() {
		List<Employee> emResult = new ArrayList<>();
		File em = new File("Employee.dat");
		try {
			Scanner sc = new Scanner(new FileInputStream(em));
			while (sc.hasNext()) {
				String[] arrEmployee = sc.nextLine().split(":");
				emResult.add(new Employee(arrEmployee[0], arrEmployee[1],
						arrEmployee[2], arrEmployee[3], arrEmployee[4],
						arrEmployee[5], arrEmployee[6]));
			}
			sc.close();
		} catch (Exception e) {

		}

		return emResult;
	}

	public static void writeEM(List<Employee> list) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File(
					"Employee.dat"), false));
			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
