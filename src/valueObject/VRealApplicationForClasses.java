package valueObject;

public class VRealApplicationForClasses {

	private String userId;
	private int lectureId;
	private String lecture;
	private String professor;
	private int credit;
	private String time;
	
	public int getLectureId() {
		return lectureId;
	}
	public void setLectureId(int id) {
		this.lectureId = id;
	}
	public String getLecture() {
		return lecture;
	}
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
