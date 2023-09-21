package geometry;

public class Test {

	public static void main(String[] args) {
		
		Point point1 = new Point();
		
		point1.setX(10);
		point1.setY(12);
		
		System.out.println("X kordinata je: " + point1.getX());
		System.out.println("Y kordinata je: " + point1.getY());
		System.out.println("Da li je tacka selektovana: " + point1.isSelected());
		double d = point1.distance(15, 7);
		System.out.println("Daljina tacaka je " + d);

	}

}
