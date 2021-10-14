// David Vaughan
// CS0045
// 9/16
// 9 am
public class RectangleGroup {
    private int numRectangles = 0;
    private Rectangle[] theRectangles;
 
    // constructor intitializes numRectangles to 0 and
    // theRectanglesto an empty array of size 50
    public RectangleGroup() {
        numRectangles = 0;
        theRectangles = new Rectangle[50];
    }

    
    public int getNumRectangles() {
        return numRectangles;
    }

    // returns the Rectangle at
    // position i in theRectangles
    public Rectangle getRectangle(int i) {
        return theRectangles[i];
    }

    public void setNumRectangles (int n) {
        numRectangles = n;
    }

    // add Rectangle r after the current
    // lastrectangle in theRectangles
    public void addRectangle (Rectangle r) {
        theRectangles[numRectangles] = new Rectangle(r.getLength(), r.getWidth());
        numRectangles++;
    }

    public boolean isEmpty() {
        for (int i = 0; i < numRectangles; i++) {
            if (theRectangles[i] != null) {
                return false;
            }
        }
        return true;
    }

    // return the largest area of the 
    // Rectangles in the object
    public double largestArea() {
        int max = 0;
        for (int x = 0; x < numRectangles; x++) {
            if (theRectangles[x].calcArea() > theRectangles[max].calcArea()) {
                max = x;
            }
        }
        return theRectangles[max].calcArea();
    }
    // return the largest perimeter of the 
    // Rectangles in the object
    public double largestPerimeter() {
        int max = 0;
        for (int x = 0; x < numRectangles; x++) {
            if (theRectangles[x].calcPerimeter() > theRectangles[max].calcPerimeter()) {
                max = x;
            }
        }
        return theRectangles[max].calcPerimeter();
    }

    public static void printSquares (RectangleGroup rg) {
        //RectangleGroup rg = new RectangleGroup();
        for (int i = 0; i < rg.getNumRectangles(); i++) {
            if (rg.getRectangle(i).isSquare()) {
                System.out.println(rg.getRectangle(i));
            }
        }
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < numRectangles; i++) {
            s = s.concat(theRectangles[i].toString());
            if (i + 1 != numRectangles) {
                s = s.concat(", ");
            }
        }
        s = s.concat("]");
        return s;
    }
}