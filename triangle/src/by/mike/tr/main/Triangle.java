package by.mike.tr.main;

import java.util.Objects;

public class Triangle {
	/*
	 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
	 * объектов, вычисления площади, периметра и точки пересечения медиан
	 * (опционально).
	 */
	private int sideA;
	private int sideB;
	private int sideC;

	public Triangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;

	}

	public Triangle() {
		sideA = 0;
		sideB = 0;
		sideC = 0;
	}

	public int perimeter() {
		int perimeter = 0;
		perimeter = sideA + sideB + sideC;
		return perimeter;
	}

	public int square() {
		int square = 0;
		int poluPerimeter = (sideA + sideB + sideC) / 2;
		square = (int) Math
				.sqrt(poluPerimeter * (poluPerimeter - sideA) * (poluPerimeter - sideB) * (poluPerimeter - sideC));

		return square;
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideC() {
		return sideC;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sideA, sideB, sideC);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return sideA == other.sideA && sideB == other.sideB && sideC == other.sideC;
	}

}
