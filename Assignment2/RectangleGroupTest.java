public class RectangleGroupTest {
	public static void main(String[] args) {
		RectangleGroup rg = new RectangleGroup();
		System.out.println(rg.isEmpty());
		Rectangle r1 = new Rectangle(3.4, 9);
		Rectangle r2 = new Rectangle(11.23, 3.45);
		Rectangle r3 = new Rectangle(23, 9);
		Rectangle r4 = new Rectangle(31.7, 25.3);
		Rectangle r5 = new Rectangle(11.1, 11.1);
		Rectangle r6 = new Rectangle(9.2, 0.45);
		Rectangle r7 = new Rectangle(4, 9);
		Rectangle r8 = new Rectangle(28.4, 28.4);
		Rectangle r9 = new Rectangle(25, 25);
		Rectangle r10 = new Rectangle(11.11, 22.22);
		System.out.println(rg.isEmpty());

		// Ten lines to add the Rectangles to rg
		rg.addRectangle(r1);
		rg.addRectangle(r2);
		rg.addRectangle(r3);
		rg.addRectangle(r4);
		rg.addRectangle(r5);
		rg.addRectangle(r6);
		rg.addRectangle(r7);
		rg.addRectangle(r8);
		rg.addRectangle(r9);
		rg.addRectangle(r10);

		// Print all the Rectangles in rg
		System.out.println(rg.toString());

		// Print how many rectangles in rg
		System.out.println("There are " + rg.getNumRectangles()  + " rectangles in rg");

		// Calculate and print the largest area of a rectangle in rg
		System.out.println("Largest Area: " + rg.largestArea());

		// Calculate and print the largest perimeter of a rectangle in rg
		System.out.println("Largest Perimeter: " + rg.largestPerimeter());

		// List all the squares in rg
		RectangleGroup.printSquares(rg);

		System.out.println(rg.isEmpty());
		
	}
}