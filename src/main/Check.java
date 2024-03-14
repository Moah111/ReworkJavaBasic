package main;

public class Check {
	public boolean checkID(String value, String format) {

		char[] arr1 = format.toCharArray();
		char[] idArr = value.toCharArray();
		if (arr1[0] == idArr[0] && arr1[1] == idArr[1]) {
			if(idArr.length==7){
			return true;
			}
		}
		return false;
	}


}
