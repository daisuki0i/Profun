import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProFun13_ReadCSV65777 {
    static Employee[] empList = new Employee[20];

    public static void main(String[] args) {

        int i = 0;
        try (Scanner f = new Scanner(Paths.get("employee.csv"))) {
            while (f.hasNextLine()) {
                String data = f.nextLine();
                String[] dataSplitted = data.split(",");

                try {
                    int empId = Integer.parseInt(dataSplitted[0]);
                    String firstName = dataSplitted[1];
                    String lastName = dataSplitted[2];
                    double salary = Double.parseDouble(dataSplitted[3]);
                    empList[i++] = new Employee(empId, firstName, lastName, salary);
                } catch (NumberFormatException e) {
                    System.out.println("Data format error at line:" + (i + 1) + ";" + e);
                    i++;
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is full – cannot load remaining rows");
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unknown error");
        }
        System.out.println("Emp Id First Name Last Name Salary");
        printEmpList();
    }

    static void printAllEmployee(Employee[] empList) {
        for (int j = 0; j < empList.length; j++) {
            if (empList[j] != null)
                System.out.println(empList[j].getEmployeeInfo());
        }
    }

    static void printEmpList() {
        for (int j = 0; j < empList.length; j++) {
            if (empList[j] != null)
                System.out.println(empList[j].getEmployeeInfo());
        }
    }
}

class Employee {
    private int empId;
    private String firstName, lastName;
    private double salary;

    public Employee() {
        this(0, "", "", 0.0);
    }

    public Employee(int empId, String firstName, String lastName, double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeInfo() {
        return empId + " " + firstName + " " + lastName + " " + salary;
    }
}