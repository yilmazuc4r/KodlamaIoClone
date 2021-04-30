
public class UserManager {
	public void addUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Kaydolmu�tur");

	}

	public void deleteUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Silinmi�tir");
	}

	public void updateUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Kaydolmu�tur");
	}

	public void changeUserStatus(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " G�ncellenmi�tir.");
	}

	public void addListofUser(User[] _users) {

		for (User user : _users) {
			addUser(user);
		}
	}
}
