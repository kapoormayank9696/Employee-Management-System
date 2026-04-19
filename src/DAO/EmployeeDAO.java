package Employee_Management_System.src.DAO;

import Employee_Management_System.src.model.Employee;
import Employee_Management_System.src.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private Employee mapRow(ResultSet rs) throws SQLException {
        return new Employee(
                rs.getInt("emp_id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getBigDecimal("salary")
        );
    }
    // Add Employee
    public boolean addEmployee(Employee e) {
        String query = "INSERT INTO emp(name,email,phone,salary) VALUES(?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getPhone());
            ps.setBigDecimal(4, e.getSalary());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("❌ Add Error: " + ex.getMessage());
        }
        return false;
    }

    // Get All Employees Data
    public List<Employee> getAllEmployees() {
        List<Employee> result=new ArrayList<>();
        String query="SELECT * FROM emp";
        try(Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(query)) {
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()) {
                result.add(mapRow(resultSet));
            }
        } catch (SQLException e) {
            System.err.println("❌ Fetch Error: " + e.getMessage());
        }
        return result;
    }

    // Get Employee By ID
    public Employee getEmployeeById(int id) {
        String query="SELECT * FROM emp WHERE emp_id=?";
        try(Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(query)) {
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()) {
                return mapRow(resultSet);
            }
        } catch (SQLException e) {
            System.err.println("❌ Search Error: " + e.getMessage());
        }
        return null;
    }

    // Update Employee
    public boolean updateEmployee(Employee e) {
        String query = "UPDATE emp SET name=?, email=?, phone=?, salary=? WHERE emp_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getPhone());
            ps.setBigDecimal(4, e.getSalary());
            ps.setInt(5, e.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("❌ Update Error: " + ex.getMessage());
        }
        return false;
    }

    // DELETE EMPLOYEE BY ID
    public boolean deleteEmployee(int id) {
        String query = "DELETE FROM emp WHERE emp_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("❌ Delete Error: " + ex.getMessage());
        }
        return false;
    }
}
