
public class LabCourse extends Course {
    
    public LabCourse(String subjectCode, String courseNumber, String courseName, String subject, int creditCount) {
        super(subjectCode, courseNumber, courseName, creditCount);
    }

    public void displayResults() {
        super.displayInfo();
        System.out.println("This course has a lab component and additional fees may apply.");
    }
}
