
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.setUniversity("ODTÜ");
		System.out.println(student1.getUniversity());

		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student1);
	}

}
