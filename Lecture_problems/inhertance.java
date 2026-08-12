package phase2;

class person {
   final String name = "xxx";
    String work = "college";

    void person() {
    	String name ="zzz";
        System.out.println("Name:" + name + "\tWork:" + work);
        System.out.println("Currently pursuing BE");
    }
}

class student extends person {
    String work = "Studying";
     String name ="yyy";
    @Override
    void person() {
        System.out.println("Name:" + name + "\tWork:" + work);
        System.out.println("Studying in college");
    }
}

class child extends student {
    String work = "Eating";

    @Override
    void person() {
        System.out.println("Name:" + name + "\tWork:" + work);
        System.out.println("Planting trees");
    }
}

class customer extends child {
    String work = "Purchasing";

    @Override
    void person() {
        System.out.println("Name:" + name + "\tWork:" + work);
        System.out.println("Purchasing books");
    }
}

class visitor extends customer {
    String work = "travelling";

    @Override
    void person() {
        System.out.println("Name:" + name + "\tWork:" + work);
        System.out.println("Exploring places");
    }
}

public class inhertance {

    public static void main(String[] args) {

        student s = new student();
        child c = new child();
        customer cu = new customer();
        visitor v = new visitor();

       System.out.print(v.name);
    }
}