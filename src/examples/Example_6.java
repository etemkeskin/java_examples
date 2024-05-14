package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example_6 {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		users.add(new User(1, "John"));
		users.add(new User(2, "David"));
		users.add(new User(3, "Marry"));
		users.add(new User(4, "Chris"));
		users.add(new User(5, "Benn"));
		users.add(new User(6, "Larry"));
		users.add(new User(7, "Michael"));

		// Stream forEach Method.
		users.stream().forEach(user -> System.out.println(user.toString()));

		users.stream().forEach(user -> user.talk());
		users.stream().forEach(User::talk);// method reference

		System.out.println("Filtered New List");
		// Stream filter Method
		List<User> filteredUsers =  users.stream().filter(user -> user.id > 5).collect(Collectors.toList());
		filteredUsers.stream().forEach(User::talk);
		
		// Stream map Method
		List<User> mappedUsers = users.stream().map(user -> new User(user.id, user.name + " New Users")).collect(Collectors.toList());
		mappedUsers.stream().forEach(User::talk);
		
		// Stream change type of list
		Map<Integer, String> userMap =  users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
		userMap.forEach((key, value) -> System.out.println(key + " : " + value));
		
	}

}

class User {
	int id;
	String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name = " + name + "]";
	}

	public void talk() {
		System.out.println("Hi, I am " + this.name);
	}
}