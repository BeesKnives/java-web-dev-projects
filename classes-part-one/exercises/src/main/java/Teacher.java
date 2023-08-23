public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSubject(){
        return subject;
    }
    public int getYearsTeaching(){
        return yearsTeaching;
    }


    private void setFirstName(String aFirstName){
        this.firstName = aFirstName;
    }
    private void getLastName(String aLastName){
        this.lastName = aLastName;
    }
    public void getSubject(String aSubject){
        this.subject = aSubject;
    }
    public void getYearsTeaching(int aYearsTeaching){
        this.yearsTeaching = aYearsTeaching;
    }





}
