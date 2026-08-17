package phase2;

class management {
	final int age =15;
   void work() {
        System.out.println("Management controls all activities");
    }
}
class schools extends management {
	int age = 30;
    @Override
    void work() {
    	System.out.println("Management controls all activities");
    }
}
class teachers extends schools {
    @Override
    void work() {
        System.out.println("Teachers teach school students");
    }
}
class workers extends teachers {
    @Override
    void work() {
        System.out.println("Workers maintain the school");
    }
}
class schoolstudents extends workers {
    @Override
    void work() {
        System.out.println("School students are studying");
    }
}
class college extends management {
    @Override
    void work() {
        System.out.println("College is managed by management");
    }
}
class professors extends college {
    @Override
    void work() {
        System.out.println("Professors teach college students");
    }
}
class transport extends professors {
    @Override
    void work() {
        System.out.println("Transport provides college transportation");
    }
}
class collegestudents extends transport {
    @Override
    void work() {
    	super.work();
        System.out.println("College students are studying");
    }
}
class placement extends management {
    @Override
    void work() {
        System.out.println("Placement is managed by management");
    }
}

class staffs extends placement {
    @Override
    void work() {
        System.out.println("Placement staffs coordinate activities");
    }
}
class company extends staffs {
    @Override
    void work() {
        System.out.println("Companies provide job opportunities");
    }
}

class training extends company {
    @Override
    void work() {
        System.out.println("Training prepares students for placement");
    }
}
class placementstudent extends training {
    @Override
    void work() {
        System.out.println("Student attends placement training");
    }
}
public class hierarical {
    public static void main(String[] args) {
        schoolstudents ss = new schoolstudents();
        workers w = new workers();
        collegestudents cs = new collegestudents();
        transport t = new transport();
        placementstudent ps = new placementstudent();
        company c = new company();
        ss.work();
        w.work();
        cs.work();
        t.work();
        ps.work();
        c.work();
    }
}