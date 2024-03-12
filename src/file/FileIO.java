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

public class FileIO {

	public static List<Department> read() {
		List<Department> result = new ArrayList<>();
		try {
			File f = new File("Department.dat");
			Scanner scanner = new Scanner(new FileInputStream(f));
			while (scanner.hasNext()) {
				// ["id","name","domain"]
				String[] arrDepartment = scanner.nextLine().split(",");
				result.add(new Department(arrDepartment[0], arrDepartment[1],
						arrDepartment[2]));
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void write(List<Department> list) {
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
}
