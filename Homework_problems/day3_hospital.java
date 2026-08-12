package hw;

abstract class Emp {

    private int id;
    private String name;
    private double basicSalary;

    Emp() {
        id = 0;
        name = "Unknown";
        basicSalary = 0;
    }

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Emp(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

class Doctor extends Emp {

    private double consultationAllowance;

    Doctor(int id, String name, double basicSalary, double consultationAllowance) {
        super(id, name, basicSalary);
        this.consultationAllowance = consultationAllowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + consultationAllowance;
    }
}

class Nurse extends Emp {

    private double nightShiftAllowance;

    Nurse(int id, String name, double basicSalary, double nightShiftAllowance) {
        super(id, name, basicSalary);
        this.nightShiftAllowance = nightShiftAllowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + nightShiftAllowance;
    }
}

class LabTechnician extends Emp {

    private double labAllowance;

    LabTechnician(int id, String name, double basicSalary, double labAllowance) {
        super(id, name, basicSalary);
        this.labAllowance = labAllowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + labAllowance;
    }
}

public class day3_hospital{

    public static void main(String[] args) {

        Emp[] employees = new Emp[3];

        employees[0] = new Doctor(101, "Kavya", 50000, 15000);
        employees[1] = new Nurse(102, "Priya", 30000, 5000);
        employees[2] = new LabTechnician(103, "Rahul", 35000, 8000);

        for (Emp e : employees) {
            e.displayDetails();
            System.out.println();
        }

        Emp highest = employees[0];

        for (Emp e : employees) {
            if (e.calculateSalary() > highest.calculateSalary()) {
                highest = e;
            }
        }

        System.out.println("Highest Paid Employee");
        highest.displayDetails();
    }
}