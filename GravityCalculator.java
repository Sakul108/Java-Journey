public class GravityCalculator {
    public static void main (String[] args){

        System.out.println("Welcome to the gravity calculator:\n");
        
       double objPosition, a, t, iniVelocity, iniPosition;

       a = 9.83;
       t = 5.02;
       iniVelocity = 98.20;
       iniPosition = 8;

       objPosition = 0.5*a*t*t + iniVelocity*t + iniPosition;

       System.out.println("The position of the object is "+ objPosition);     //String concatenation 





    }
}