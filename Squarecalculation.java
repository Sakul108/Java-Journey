// Program to find the area and perimeter of square


public class Squarecalculation{

        private double length;
        
        Squarecalculation(double length){     // creating a parameterised constructor
          
          this.length = length;

        }

        public double getArea(){         // created a method to get area
            
            return length*length;

        }

        public double getPerimeter(){

            return 4*length;
        }

        public void display(){

            System.out.println("The area of the square is " + getArea());
            System.out.println("The perimeter of the square is " + getPerimeter());
        }

        public static void main(String[] args){

            Squarecalculation s1 = new Squarecalculation(7.00);
            s1.display();
        }

}