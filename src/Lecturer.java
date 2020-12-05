import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
//I took these using notes from lab 10 and 14 of OOP
public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String module;
    private String ID;
//To do the lecturer class I had taken notes from both lab 10 and 14 of OOP

    public Lecturer(){
        this("Undefined", "Undefined", null, "Undefined", "Undefined");

    }


    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, String module, String ID){
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
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

        str+= "\nStudent Module is " + getModule() +
                "\nStudent ID is " + getID();

        return str;
    }
}
