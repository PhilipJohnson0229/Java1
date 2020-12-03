// Rectangle.java
// Philip Johnson
// 09/06/2020
// Class that represents a rectangle

public class Rectangle {  // class declaration

        // fields
        private double length;
        private double width;
        
        // constructors
        public Rectangle() { }
        
        public Rectangle(double newLength, double newWidth) {
            length = newLength;
            width = newWidth;
        }
        
        // accessor / mutator for radius
        public double getLength() { return length; }
        public void setLength(double newLength) { length = newLength; }
        
        public double getWidth() { return width; }
        public void setWidth(double newWidth) { width = newWidth; }
/*/ // 
        
        // methods
        public double calculateArea() { return length * width; }
        public double calculatePerimeter() { return 2 * length * width;  }
        
        // unit test
        public static void main(String[] args) {
        
                // test default constructor
                // expected output:
                // r1 area = 0.00
                // r1 perimeter = 0.00
                
                Rectangle r1  = new Rectangle();
                System.out.printf("r1 area = %.2f\n", r1.calculateArea());
                System.out.printf("r1 perimeter = %.2f\n", r1.calculatePerimeter());
                
                // test overloaded constructor
                // expected output:
                // r2 area = 10.00
                // r2 perimeter = 20.00
                Rectangle r2  = new Rectangle(5.0, 2.0);
                System.out.printf("r2 area = %.2f\n", r2.calculateArea());
                System.out.printf("r2 perimeter = %.2f\n", r2.calculatePerimeter());
        }
}  // end of class
