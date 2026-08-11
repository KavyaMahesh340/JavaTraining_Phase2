package hw;

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;
    double hra;
    double da;
    double bonus;
    double tax;
    double grossSalary;
    double netSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    void calculateHRA() {
        hra = basicSalary * 0.20;
    }

    void calculateDA() {
        da = basicSalary * 0.10;
    }

    void calculateBonus() {
        bonus = basicSalary * 0.05;
    }

    void calculateGrossSalary() {
        grossSalary = basicSalary + hra + da + bonus;
    }

    void calculateTax() {
        tax = grossSalary * 0.08;
    }

    void calculateNetSalary() {
        netSalary = grossSalary - tax;
    }

    void calculateSalary() {
        calculateHRA();
        calculateDA();
        calculateBonus();
        calculateGrossSalary();
        calculateTax();
        calculateNetSalary();
    }

    void displaySalary() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
        System.out.println();
    }
}

public class day1_employee {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Kavya", 30000);
        Employee e2 = new Employee(102, "Priya", 40000);
        Employee e3 = new Employee(103, "Rahul", 35000);
        Employee e4 = new Employee(104, "Arun", 50000);
        Employee e5 = new Employee(105, "Divya", 45000);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
        e4.calculateSalary();
        e5.calculateSalary();

        System.out.println("EMPLOYEE SALARY DETAILS");

        e1.displaySalary();
        e2.displaySalary();
        e3.displaySalary();
        e4.displaySalary();
        e5.displaySalary();

        Employee highest = e1;
        Employee lowest = e1;

        if (e2.netSalary > highest.netSalary) highest = e2;
        if (e3.netSalary > highest.netSalary) highest = e3;
        if (e4.netSalary > highest.netSalary) highest = e4;
        if (e5.netSalary > highest.netSalary) highest = e5;

        if (e2.netSalary < lowest.netSalary) lowest = e2;
        if (e3.netSalary < lowest.netSalary) lowest = e3;
        if (e4.netSalary < lowest.netSalary) lowest = e4;
        if (e5.netSalary < lowest.netSalary) lowest = e5;

        double averageSalary = (e1.netSalary + e2.netSalary + e3.netSalary
                + e4.netSalary + e5.netSalary) / 5;

        System.out.println("Highest Salary: " + highest.employeeName + " - ₹" + highest.netSalary);
        System.out.println("Lowest Salary: " + lowest.employeeName + " - ₹" + lowest.netSalary);
        System.out.println("Average Salary: ₹" + averageSalary);
    }
}