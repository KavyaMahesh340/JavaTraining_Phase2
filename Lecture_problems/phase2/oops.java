package phase2;
abstract class Employee {
    private String name;
    private double salary;

    public void setname(String name) {
        this.name = name;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public String getname() {
        return name;
    }

    public double getsalary() {
        return salary;
    }
    abstract double bonus_cal();
    abstract double display_all();
}

abstract class Developer extends Employee {
}

class MERNStack extends Developer {


    double bonus_cal() {
        return getsalary() * 0.20;
    }

 
    double display_all() {
        System.out.println("MERN Stack Developer");
        System.out.println("Name: " + getname());
        System.out.println("Salary: " + getsalary());
        System.out.println("Bonus: " + bonus_cal());
        return getsalary() + bonus_cal();
    }
}
class FullStack extends Developer {

    double bonus_cal() {
        return getsalary() * 0.15;
    }

    double display_all() {
        System.out.println("Full Stack Developer");
        System.out.println("Name: " + getname());
        System.out.println("Salary: " + getsalary());
        System.out.println("Bonus: " + bonus_cal());

        return getsalary() + bonus_cal();
    }
}

class Manager extends Employee {

    double bonus_cal() {
        return getsalary() * 0.30;
    }

    double display_all() {
        System.out.println("Manager");
        System.out.println("Name: " + getname());
        System.out.println("Salary: " + getsalary());
        System.out.println("Bonus: " + bonus_cal());

        return getsalary() + bonus_cal();
    }
}
class officeworker extends Employee {

    double bonus_cal() {
        return getsalary() * 0.10;
    }

    double display_all() {
        System.out.println("Officeworker");
        System.out.println("Name: " + getname());
        System.out.println("Salary: " + getsalary());
        System.out.println("Bonus: " + bonus_cal());

        return getsalary() + bonus_cal();
    }
}

public class oops {

    public static void main(String[] args) {

        MERNStack m = new MERNStack();
        m.setname("Kavya");
        m.setsalary(50000);

        FullStack f = new FullStack();
        f.setname("Rahul");
        f.setsalary(60000);

        Manager manager = new Manager();
        manager.setname("Arun");
        manager.setsalary(70000);
        
        officeworker o=new officeworker();
        o.setname("xxx");
        o.setsalary(5000);

        m.display_all();
        System.out.println();

        f.display_all();
        System.out.println();

        manager.display_all();
        System.out.println();
        
        o.display_all();
    }
}