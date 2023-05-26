
public class WritingCourse extends Course {

    public WritingCourse(String subjectCode, String courseNumber, String courseName, String subject, int creditCount) {
        super(subjectCode, courseNumber, courseName, creditCount);
    }

    public void displayResults() {
        super.displayInfo();
        System.out.println("This course is a writing course and will satisfy W-course requirements.");
    }
}
