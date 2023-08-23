public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public Student (String name, int studentId, int numberOfCredits, double gpa){
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public String getName(){
                return name;
        }
        public int getStudentId(){
                return studentId;
        }
        public int getNumberOfCredits(){
                return numberOfCredits;
        }
        public double getGpa(){
                return gpa;
        }
        private void setName(String aName){
                this.name = aName;
        }
        public void setStudentId(int aStudentId){
                this.studentId = aStudentId;
        }
        public void setNumberOfCredits(int aNumberOfCredits){
                this.numberOfCredits = aNumberOfCredits;
        }

        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
