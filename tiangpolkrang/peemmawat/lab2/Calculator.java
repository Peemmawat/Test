package tiangpolkrang.peemmawat.lab2;

/**
* This Calculator program is to accept three arguments include operand, number 1 , number 2
* In order to use the translator to calculate mathematically by adding, subtracting, multiplying, and dividing. 
* Entering number 2 into 0 will not work, and entering q Q will exit the program.
* Author: Peemmawat Tiangpolkrang
* ID: 563040565-0
* Sec: 1
* Date: December 25, 2019
*
**/

public class Calculator{
   public static void main(String[] args) {
	
	if(args.length == 3){
	
		String op = args[0];
    	double x = Double.parseDouble(args[1]);
		double y = Double.parseDouble(args[2]);
        double z;
        
	if(y != 0){
        if (op.equals("+")) {
            z = x+y;
	    System.out.println(x + " " + op + " " + y + " = " + z);
        } else if (op.equals("-")){
            z = x-y;
	    System.out.println(x + " " + op + " " + y + " = " + z);
        } else if (op.equals("*")){
            z = x*y;
	    System.out.println(x + " " + op + " " + y + " = " + z);
        } else if (op.equals("/")){
            z = x/y;
	    System.out.println(x + " " + op + " " + y + " = " + z);
        } else{
             throw new java.lang.Error("Operator not recognized");}
		}
	
		else if(y == 0){
	    System.out.println("The second operand cannot be zero");}
		else{}}

	else if(args[0].equals("q")){
		System.out.println("Quitting the program");}
	else if(args[0].equals("Q"))
		{System.out.println("Quitting the program");}
	else{}
	
   }
}