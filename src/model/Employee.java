package Employee_Management_System.src.model;

import java.math.BigDecimal;

public class Employee {
    // Private Access Modifier And Data Members
    private int id;
    private String name;
    private String email;
    private String phone;
    private BigDecimal salary;

    // Default Constructor
    public Employee() {}

    // Parameterized Constructor
    public Employee(int id,String name, String email, String phone, BigDecimal salary) {
        this.id=id;
        setName(name);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
    }

    // Setters
    public void setId(int id) {
        if (this.id != 0) {
            throw new IllegalStateException("ID already set");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
        this.id=id;
    }
    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty");
        }
        this.name=name;
    }
    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email=email;
    }
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10,15}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone=phone;
    }
    public void setSalary(BigDecimal salary) {
        if (salary == null || salary.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Salary cannot be null or negative");
        }
        this.salary=salary;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public BigDecimal getSalary() {
        return salary;
    }

    // Display all data of employee
    @Override
    public String toString() {
        return "Employee { " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                " }";
    }
}
