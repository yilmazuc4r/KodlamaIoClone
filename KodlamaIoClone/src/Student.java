
public class Student extends User {
	private String university;
	private String degree;
	private int age;
	private int courseLimit;

	public Student(int id,String userName,String mailAd,String university, String degree, int age, int courseLimit) {
		super();
		this.userId=id;
		this.userName=userName;
		this.userEMail=mailAd;
		this.university = university;
		this.degree = degree;
		this.age = age;
		this.courseLimit = courseLimit;
	}

	public Student() {
		//System.out.println("New student has been registered");
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getCourseLimit() {
		return courseLimit;
	}

	public void setCourseLimit(int courseLimit) {
		this.courseLimit = courseLimit;
	}

	public int getAge() {
		return age;
	}

}
