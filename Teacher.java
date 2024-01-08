public class Teacher extends Person {
String subject;
 String schoolname;
public Teacher(String name, String subject, String schoolname) {
    super(name);
    this.subject = subject;
    this.schoolname = schoolname;
}
    public String getSubject() {
    return subject;
}

public void setSubject(String subject) {
    this.subject = subject;
}

public String getSchoolname() {
    return schoolname;
}

public void setSchoolname(String schoolname) {
    this.schoolname = schoolname;

}

@Override
void describeRole(){
System.out.println(getName() + " Haya Alqahtani");
}
}
