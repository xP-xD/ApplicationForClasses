package service;

import java.util.Vector;

import model.MPreApplicationForClasses;
import valueObject.VLecture;
import valueObject.VPreApplicationForClasses;

public class SPreApplicationForClasses {

	public Vector<VPreApplicationForClasses> getData(String id) {
		
		MPreApplicationForClasses mPreApplicationForClasses = new MPreApplicationForClasses();
		return mPreApplicationForClasses.getData(id);
	}

	public void store(String id, VLecture vLecture) {
		
		MPreApplicationForClasses mPreApplicationForClasses = new MPreApplicationForClasses();
		mPreApplicationForClasses.store(id, vLecture);
		
	}

}
