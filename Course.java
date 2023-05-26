
public class Course {
	private String code;
	private String name;
	private String subject;
	private int credits;
	
	public Course(String courseCode, String courseName, String courseSubject, int courseCredits) {
		code = courseCode;
		name = courseName;
		subject = courseSubject;
		credits = courseCredits;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public void displayInfo() {
		System.out.printf("%s: %s %n", code, name);
		System.out.printf("%s | %d Credits %n", subject, credits);
	}
}