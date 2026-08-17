package phase2;

class class_room {

    class mcp {
        int mark;
        String code;
        String staff;

        void mcp() {
            System.out.println("Microcontrollers is very important for basic IoT");
        }

        mcp(int mark, String code, String staff) {
            this.mark = mark;
            this.code = code;
            this.staff = staff;
        }
    }

    class acd {
        int mark;
        String code;
        String staff;

        void acd() {
            System.out.println("Compiler Design helps to boost the speed of compiler");
        }

        acd(int mark, String code, String staff) {
            this.mark = mark;
            this.code = code;
            this.staff = staff;
        }
    }

    class wt {
        int mark;
        String code;
        String staff;

        void wt() {
            System.out.println("Web Technology is very basic to build web applications");
        }

        wt(int mark, String code, String staff) {
            this.mark = mark;
            this.code = code;
            this.staff = staff;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        class_room c = new class_room();

        class_room.mcp m = c.new mcp(95, "2CS30", "Shanthini");
        class_room.acd a = c.new acd(96, "2CS40", "Mathi");
        class_room.wt w = c.new wt(96, "2CS50", "Freeda");

        m.mcp();
        a.acd();
        w.wt();
    }
}