package Employee_Management_System.src;

import Employee_Management_System.src.DAO.EmployeeDAO;
import Employee_Management_System.src.model.Employee;
import Employee_Management_System.src.service.EmployeeService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("========= EMPLOYEE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Salary: ");
                    BigDecimal salary = new BigDecimal(sc.nextLine());

                    service.addEmployee(new Employee(0, name, email, phone, salary));
                    break;

                case 2:
                    service.showAll();
                    break;

                case 3:
                    System.out.print("ID: ");
                    int sid = Integer.parseInt(sc.nextLine());
                    service.search(sid);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Name: ");
                    String n = sc.nextLine();

                    System.out.print("Email: ");
                    String e = sc.nextLine();

                    System.out.print("Phone: ");
                    String p = sc.nextLine();

                    System.out.print("Salary: ");
                    BigDecimal s = new BigDecimal(sc.nextLine());

                    service.update(new Employee(id, n, e, p, s));
                    break;

                case 5:
                    System.out.print("ID: ");
                    int did = Integer.parseInt(sc.nextLine());
                    service.delete(did);
                    break;

                case 6:
                    System.out.println("Thank you for using the Employee Management System!");
                    System.exit(0);
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid Choice");
            }
        }
    }
}
