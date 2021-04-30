
public class UserManager {
	public void addUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Kaydolmuþtur");

	}

	public void deleteUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Silinmiþtir");
	}

	public void updateUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Kaydolmuþtur");
	}

	public void changeUserStatus(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Güncellenmiþtir.");
	}

	public void addListofUser(User[] _users) {

		for (User user : _users) {
			addUser(user);
		}
	}
}
