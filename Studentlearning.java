public class Studentlearning{

     int id;
     String name;   //instance variables, gets memory during runtime
    public static void main(String[] args){

        Studentlearning s1 = new Studentlearning();   
         //created an object

         Studentlearning s2 = new Studentlearning();  
         Studentlearning s3 = new Studentlearning();  
        s1.name = "Ram";
        s2.name = "Sita";
        s3.name = "Ganesha";

        s1.id = 108;
        s2.id = 108;
        s3.id = 108; 

        System.out.println("I am sorry\t "+ s3.name);
        System.out.println(s1.name+ "\t and \t" + s2.name+ "\t are awesome");
        System.out.println(s1.id + "\t "+ s2.id+ " \t"+ s3.id);


    }
}