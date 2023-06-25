package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

import valueObject.VLecture;
import valueObject.VPreApplicationForClasses;

public class MPreApplicationForClasses {

	public Vector<VPreApplicationForClasses> getData(String id) {

		Vector<VPreApplicationForClasses> vPreApplicationForClasses = null;

		try {
			File file = new File("dataFile/preStore");
			Scanner scanner = new Scanner(file);
			vPreApplicationForClasses = new Vector<VPreApplicationForClasses>();

			while (scanner.hasNext()) {

				if (scanner.next().equals(id)) {

					VPreApplicationForClasses vPreApplicationForClass = new VPreApplicationForClasses();
//					vPreApplicationForClass.setUserId(scanner.next());
					vPreApplicationForClass.setLectureId(scanner.nextInt());
					vPreApplicationForClass.setLecture(scanner.next());
					vPreApplicationForClass.setProfessor(scanner.next());
					vPreApplicationForClass.setCredit(scanner.nextInt());
					vPreApplicationForClass.setTime(scanner.next());

					vPreApplicationForClasses.add(vPreApplicationForClass);
				}

			}

			scanner.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vPreApplicationForClasses;

	}

	public void store(String id, VLecture vLecture) {

		try {
			File file = new File("dataFile/preStore");
			FileWriter fileWriter = new FileWriter(file, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			// ID ID 과목명 교수명 학점 시간
			printWriter.print(id);
			printWriter.print(" ");
			printWriter.print(vLecture.getId());
			printWriter.print(" ");
			printWriter.print(vLecture.getLecture());
			printWriter.print(" ");
			printWriter.print(vLecture.getProfessor());
			printWriter.print(" ");
			printWriter.print(vLecture.getCredit());
			printWriter.print(" ");
			printWriter.println(vLecture.getTime());
			// 일렬로 쫙 써서 저장해놓고 가져올때는 아이디 맞는거로 해서 뒤에 저장돼있는 과목들 불러오는거로 하는데 일단 한 줄로 저장하면 그거 하고
			// 한줄 개행

			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
