package tanwi.simpleJavaClass;

public class Employee {
    private int empId;
    private String firstName;
    private String lastname;

    public Employee(int empId, String firstName, String lastname) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
