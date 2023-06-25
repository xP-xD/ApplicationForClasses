package service;

import model.MPersonalInfo;
import valueObject.VLogIn;
import valueObject.VPersonalInfo;

public class SLogIn {

	public VPersonalInfo validate(VLogIn vLogIn) {
		
		
		MPersonalInfo mPersonalInfo = new MPersonalInfo();
		VPersonalInfo vPersonalInfo = mPersonalInfo.read(vLogIn.getId());
		
		if(vPersonalInfo == null) {
			return null;
		}else if (vLogIn.getPassword().equals(vPersonalInfo.getPassword())) {
			return vPersonalInfo;
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
			return null;
		}
	}
	
	

}
