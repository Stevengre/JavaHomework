package nine;

import java.awt.List;

public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon p0 = new RegularPolygon();
		RegularPolygon p1 = new RegularPolygon(6,4);
		RegularPolygon p2 = new RegularPolygon(10,4,5.6,7.8);

		System.out.println("p0");
		System.out.println("Perimeter:" + p0.getPerimeter());
		System.out.printf("Area: %.2f \n", p0.getArea());

		System.out.println("p1");
		System.out.println("Perimeter:" + p1.getPerimeter());
		System.out.printf("Area: %.2f \n", p1.getArea());
		
		System.out.println("p2");
		System.out.println("Perimeter:" + p2.getPerimeter());
		System.out.printf("Area: %.2f \n", p2.getArea());
	}

}
