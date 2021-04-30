
public class UserManager {
	public void addUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Kaydolmuştur");

	}

	public void deleteUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Silinmiştir");
	}

	public void updateUser(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Kaydolmuştur");
	}

	public void changeUserStatus(User _user) {
		System.out.println(_user.getUserName() + " " + _user.getUserId() + " Güncellenmiştir.");
	}

	public void addListofUser(User[] _users) {

		for (User user : _users) {
			addUser(user);
		}
	}
}
