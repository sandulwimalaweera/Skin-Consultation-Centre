import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date dob;
    private String mob;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public <Date> Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public Person(String name, String surname, Date dob, String mob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.mob = mob;
    }
}
