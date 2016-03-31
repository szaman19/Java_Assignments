package assignment06;

import java.util.ArrayList;

public class HarpurAudit implements DegreeAudit {

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
		int numW = 0;
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
			}else if(annotations.contains("W")&& !added){
				numW++;
				added = true;
			}
		}
		if((numC + numJ) >= 4){
			returnVal = true;
		}
		if((numC + numJ) >= 2 && numW >=3){
			returnVal = true;
		}
		if((numC + numJ) >=3 && numW >=1){
			returnVal = true;
		}
		return returnVal;
	}	
}
