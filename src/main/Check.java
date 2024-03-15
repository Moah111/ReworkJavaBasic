package main;

public class Check {
	public static boolean isInCorrectFormat(String value, String format) {
		if (value.length() != 7) {
			return true;
		}
		String text = value.substring(0, 2);
		String number = value.substring(2);
		try {
			if (format.equals(text) && Integer.parseInt(number) > 0) {
				return false;
			}
		} catch (Exception ex) {
			System.out.println("ID not correct format: ");
		}
		return true;
	}


}
