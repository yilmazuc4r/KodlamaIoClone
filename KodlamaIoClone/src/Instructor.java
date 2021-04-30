
public class Instructor extends User {
	private int hoursPrice;
	private int totalCourseNumber;

	public Instructor() {
		System.out.println("Instructor Created");
	}

	public Instructor(int id,String userName,String userEMail,int hoursPrice, int totalCourseNumber) {
		super();
		this.userId=id;
		this.userName=userName;
		this.userEMail=userEMail;
		this.hoursPrice = hoursPrice;
		this.totalCourseNumber = totalCourseNumber;
	}

	public int getHoursPrice() {
		return hoursPrice;
	}

	public void setHoursPrice(int hoursPrice) {
		this.hoursPrice = hoursPrice;
	}

	public int getTotalCourseNumber() {
		return totalCourseNumber;
	}

	public void setTotalCourseNumber(int totalCourseNumber) {
		this.totalCourseNumber = totalCourseNumber;
	}
}
