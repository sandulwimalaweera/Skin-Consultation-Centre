import java.util.Date;

public class Doctor extends Person{
    private String specialization;
    private int licenceNo;
    private  int age;




    public Doctor(String name, String surname, Date dob, String mob,String specialization, int licenceNo , int age) {
        super(name, surname, dob, mob);
        this.specialization = specialization;
        this.licenceNo = licenceNo;
        this.age = age;


    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(int licenceNo) {
        this.licenceNo = licenceNo;
    }
}
