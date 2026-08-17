package phase2;
class shapes{
	void area() {
		System.out.println("Area of the shapes");
	}
	void area(int a) {
		System.out.println("The area of Square is:"+a*a);
		
	}
	void area(int a,int b) {
		System.out.println("The Area of Rectangle is:"+a*b);
	}
	void area(float m,int h,int b){
		System.out.println("The area of Triangle is:"+m*h*b);
	}
	void area(double pie,int radius) {
		System.out.println("The area of circle is:"+pie*radius*radius);
	}
}
public class day2_polymorphism {

	public static void main(String[] args) {
		shapes s=new shapes();
		s.area();
		s.area(5);
		s.area(5, 6);
		s.area((float) 0.5, 3, 2);
		s.area(3.14, 5);
		

	}

}
