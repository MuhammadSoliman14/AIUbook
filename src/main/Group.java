package main;
import java.util.ArrayList;

public class Groups {

	private String name;
	private ArrayList<String> followers = new ArrayList<String>();
	private String about;
	private String privacy;
	
	public void makeGroup() {
		
		System.out.println("Enter your group name");
		setName(name);
		System.out.println("What is your group about?");
		setAbout(about);
		System.out.println("Set your group privacy");
		setPrivacy(privacy);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAbout(String About) {
		this.about = About;
	}
	
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	public void follow(Profile newFollower) {
																		// I think this should be in system.
	}
 
	
}

 
