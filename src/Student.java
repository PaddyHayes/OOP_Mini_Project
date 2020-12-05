import java.util.GregorianCalendar;
import java.util.Date;
import java.text.*;
//To do this class I took notes from lab 10 and 14 from OOP
public abstract class Student implements Person{
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String course;
    private String module;
    private String ID;

    public Student(){
        this("Undefined", "Undefined", null, "Undefined", "Undefined", "Undefined");

    }


    public Student(String name, String address, GregorianCalendar dateOfBirth, String course, String module, String ID){
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setCourse(course);
        setModule(module);
        setID(ID);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth ) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCourse() {return course;}

    public void setCourse(String course) { this.course = course;}

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        String str = "Student name is " + getName() +
                "\nStudent address is " + getAddress() +
                "\nStudent date of birth is ";

        if(getDateOfBirth()!=null)
        {
            Date dob = getDateOfBirth().getTime();

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDob = formatDate.format(dob);
            str+=strDob;
        }
        else
            str+="Undefined";

        str+="\nStudent Course is " + getCourse() +
                "\nStudent Module is " + getModule() +
                "\nStudent ID is " + getID();

        return str;
    }
}