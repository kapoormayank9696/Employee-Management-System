package Employee_Management_System.src.service;

import Employee_Management_System.src.DAO.EmployeeDAO;
import Employee_Management_System.src.model.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO dao=new EmployeeDAO();

    // Insert All Data Into Employee Management System
    public void addEmployee(Employee e) {
        if(dao.addEmployee(e)) {
            System.out.println("✅ Employee added successfully");
        }else {
            System.out.println("❌ Failed to add employee");
        }
    }

    // Get All Employees Data
    public void showAll() {
        List<Employee> list=dao.getAllEmployees();
        if (list.isEmpty()) {
            System.out.println("No employee found");
            return;
        }
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    // Search employee by id
    public void search(int id) {
        Employee e=dao.getEmployeeById(id);
        System.out.println(e == null ? "❌ Not found" : e);
    }

    // Update employee by
    public void update(Employee e) {
        if(dao.updateEmployee(e)) {
            System.out.println("✅ Employee updated");
        }else {
            System.out.println("❌ Failed to update employee");
        }
    }

    // Delete employee by id
    public void delete(int id) {
        if(dao.deleteEmployee(id)) {
            System.out.println("✅ Employee deleted");
        }else {
            System.out.println("❌ Employee not found");
        }
    }
}

