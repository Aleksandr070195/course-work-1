
public class Employee {
    private static int idCounter = 0;
    private final int id;
    private String fullName;
    private String department;
    private double wage;

    public Employee() {
        this.id = idCounter;
    }

    public Employee(String fullName, String department, double wage) {
        this.fullName = fullName;
        this.department = department;
        this.wage = wage;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


    public String getDepartment() {
        return department;
    }

    public void setState(String department) {
        this.department = department;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "" +
                "id=" + id +
                ", ФИО='" + fullName + '\'' +
                ", Департамент='" + department + '\'' +
                ", зарплата=" + wage ;
    }
}