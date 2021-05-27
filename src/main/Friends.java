import java.util.ArrayList;

public class FriendList {
	private ArrayList <User> friends = new ArrayList <User>();  
	private ArrayList <User> following = new ArrayList <User>();  
	
	public void addFriend(User newFriend) {
		friends.add(newFriend);
	}
	
	public void removeFriend(User removeUser) {
		friends.remove(removeUser);
		System.out.println(removeUser);
		
	}
	
	 
	
		
		// View friend list.
		public void view() {
			friends.toString();
		}
		
		public void follow(User followUser) {
			following.add(followUser);
		}
		
		public static void main(String[] args) {
			

		}

	}
