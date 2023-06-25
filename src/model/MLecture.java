package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import valueObject.VLecture;

public class MLecture {

	public Vector<VLecture> getData(String fileName) {

		Vector<VLecture> vLecture = null;
		File file = new File("dataFile/" + fileName);
		Scanner scanner;

		try {

			scanner = new Scanner(file);
			vLecture = new Vector<VLecture>();

			while (scanner.hasNext()) {
				VLecture vLectureData = new VLecture();

				vLectureData.setId(scanner.nextInt());
				vLectureData.setLecture(scanner.next());
				vLectureData.setProfessor(scanner.next());
				vLectureData.setCredit(scanner.nextInt());
				vLectureData.setTime(scanner.next());
				vLecture.add(vLectureData);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vLecture;

	}

}
