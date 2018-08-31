package com.capgemini.day2;

public class SubjectMarks {

	public static String evaluation(int eng, int sci, int bio) {
		// TODO Auto-generated method stub
		if(eng>60 && sci>60 && bio>60) 
			return("Passed");
			else if((eng>60 && sci>60)||(sci>60 && bio>60)||(bio>60 && eng>60))
				return("Promoted");
			else
				return("Failed");
	}

}
