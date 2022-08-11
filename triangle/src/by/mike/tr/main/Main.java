package by.mike.tr.main;

public class Main {

	public static void main(String[] args) {
		Triangle tri = new Triangle(10, 5, 7);
		tri.perimeter();
		System.out.println("Perimeter triangle = " + tri.perimeter() + "\nSquare triangle = " + tri.square());

	}

}
