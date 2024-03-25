package main;

import company.Department;

import java.util.List;

public class Check {

	public static boolean isCorrectFormat(String value, String format) {
		if (value.length() != 7) {
			return true;
		}
		String text = value.substring(0, 2);
		String number = value.substring(2);
		try {
			return isNotExist(value) && isCorrectForm(format, text, number);
		} catch (Exception ex) {
			System.out.println("ID not correct format or already existed: ");
		}
		return true;
	}

	private static boolean isCorrectForm(String format, String text, String numberStr) {
		return (format.equals(text) && Integer.parseInt(numberStr) > 0);
	}

	private static boolean isNotExist(String departmentID) {
		List<Department> deList = RunProgram.deList;
		for (Department department: deList) {
			if (departmentID.equals(department.getdeId())) {
				System.out.println("Department already exist!");
				return false;
			}
		}
		return true;
	}
/*
	Danh sach học sinh, sinh viên
	hs1 (ten, tuoi, dia chi, mahs)
	hs2 (ten, tuoi, dia chi, mahs)
	hs3 (ten, tuoi, dia chi, mahs)
	Danh sach class
	cl1 (ten clas, ds học sinh)
	cl2 (ten clas, ds học sinh)
	cl3 (ten clas, ds học sinh)

	Tim tat ca hoc sinh trong class ABC
	public static List<Student> laySinhVienTheoClassName(String className) {
		Run.classList
	}

	Classes findClassByName(String className) {
		Run.classList
	}

	public static void addStudent(Student student, String className) {

	}

*/


}
