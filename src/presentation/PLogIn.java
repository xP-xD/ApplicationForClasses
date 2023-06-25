package presentation;

import java.util.Scanner;

import service.SLogIn;
import valueObject.VLogIn;
import valueObject.VPersonalInfo;

public class PLogIn {
	
	public void PLogIn() {
		
	}
	
	public VPersonalInfo show(Scanner scanner) {
		
		System.out.println("아이디, 비밀번호를 입력하세요.");
		
		VLogIn vLogIn = new VLogIn();
		
		System.out.print("ID: ");
		vLogIn.setId(scanner.next());
		System.out.print("Password: ");
		vLogIn.setPassword(scanner.next());
	
		SLogIn sLogIn = new SLogIn();
		
		VPersonalInfo vPersonalInfo = sLogIn.validate(vLogIn);
		return vPersonalInfo;
		
	}

}
