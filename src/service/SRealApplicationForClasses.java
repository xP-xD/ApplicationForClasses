package service;

import java.util.Vector;

import model.MRealApplicationForClasses;
import valueObject.VLecture;
import valueObject.VRealApplicationForClasses;

public class SRealApplicationForClasses {

public Vector<VRealApplicationForClasses> getData(String id) {
		
		MRealApplicationForClasses mRealApplicationForClasses = new MRealApplicationForClasses();
		return mRealApplicationForClasses.getData(id);
	}

	public void store(String id, VLecture vLecture) {
		
		MRealApplicationForClasses mRealApplicationForClasses = new MRealApplicationForClasses();
		mRealApplicationForClasses.store(id, vLecture);
		
	}
}
