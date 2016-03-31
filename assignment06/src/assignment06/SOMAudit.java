package assignment06;

import java.util.ArrayList;

public class SOMAudit implements DegreeAudit{

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
		boolean returnVal = false;
		for(CourseOffering course: list){
			ArrayList <String> annotations = course.getAnnotations();
			boolean added = false;
			if (annotations.contains("C") && !added){
				numC++;
				added = true;
			}else if(annotations.contains("J") && !added){
				numJ++;
				added = true;
			}
		}
		if((numC + numJ) >= 2){
			returnVal = true;
		}
		return returnVal;
	}

}
