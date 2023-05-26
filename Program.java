
public class Program {
	
	public Course[] courses; 

	public Program(int numCourses) {
		courses = new Course[numCourses];	
	}

	public static void main(String[] args) {
		String[][] courseInfo = { 
				{ "CHE", "120", "General Chemistry I", "Chemistry", "4" },
				{ "CHE", "121", "General Chemistry II", "Chemistry", "4" },
				{ "CSC", "207", "Computer Systems", "Computer Science", "4" },
				{ "CSC", "229", "Object-Oriented Programming", "Computer Science", "3" },
				{ "CSC", "324W", "Computer Ethics", "Computer Science", "3" },
				{ "CSC", "330", "Software Design and Development", "Computer Science", "3" },
				{ "ENG", "112", "Writing Arguments", "English", "3" },
				{ "ENG", "217W", "Introduction to Literature", "English", "3" },
				{ "MAT", "125", "Applied Business Mathematics", "Mathematics", "3" },
				{ "MAT", "150", "Calculus I", "Mathematics", "4" },
				{ "MAT", "151", "Calculus II", "Mathematics", "4" },
				{ "MAT", "221", "Intermediate Applied Statistics", "Mathematics", "4" },
				{ "PHY", "230", "Physics for Scientists and Engineers I", "Physics", "4" },
				{ "PHY", "231", "Physics for Scientists and Engineers II", "Physics", "4" }
		};
		
		Program courseMngmt = new Program(courseInfo.length);
		
		courseMngmt.addCourses(courseInfo); //object goes through the addedCourses method so that it can go through the courseInfo
		courseMngmt.displayCourses();
		
	}
	
	public void addCourses(String[][] courseInfo) {
	
		  for (int i = 0; i < courseInfo.length; i++) {
		        String courseNumber = courseInfo[i][1];
		        int creditCount = Integer.parseInt(courseInfo[i][4]);
		        
		        if (courseNumber.endsWith("W")) { // checks if a string ends with W to check if course is a writing course
		            // writing course object
		            courses[i] = new WritingCourse(courseInfo[i][0], courseNumber, courseInfo[i][2], courseInfo[i][3], creditCount);
		        } else if (creditCount == 4) {
		            // LabCourse object
		            courses[i] = new LabCourse(courseInfo[i][0], courseNumber, courseInfo[i][2], courseInfo[i][3], creditCount);
		        } else {
		            // Course object
		            courses[i] = new Course(courseInfo[i][0], courseNumber, courseInfo[i][2], creditCount);
		        }
		   
		  }
	}
		
	
	// Displays the results of the courseinfo
	public void displayCourses() {
		  for (Course course : courses) { //courses is array of course
		        System.out.println(course.getCode() + ": " + course.getName());
		        System.out.println(course.getSubject() + " | " + course.getCredits() + " Credits");
		        if (course instanceof LabCourse) { //checks if the object is of the class or its subclass
		            System.out.println("This course has a lab component");
		            LabCourse labCourse = (LabCourse) course;  //Had to make a new object for lab course in order to display the results
		            labCourse.displayResults();
		        }
		        System.out.println();
		    }
	}
}
