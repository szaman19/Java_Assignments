package assignment06;

import java.util.ArrayList;

public class CSAudit implements DegreeAudit {

	@Override
	public boolean hasWritingRequirement() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean writingSatisfied(ArrayList<CourseOffering> list) {
		// TODO Auto-generated method stub
		int numC = 0;
		int numJ = 0;
		boolean CS301 = false;
		boolean returnVal = false;
		for(CourseOffering course: list){
			if("CS301" == course.getName()){
				CS301 = true;
			}
			ArrayList <String> annotations = course.getAnnotations();
			for(String annot: annotations){
				if(annot == "C"){
					numC++;
				}else if (annot == "J"){
					numJ++;
				}
				
			}
		}
		if((numC + numJ) >= 1 && CS301){
			returnVal = true;
		}
		return returnVal;
	}
}
