
public class Calculator {

	 public double add(double a,double b){
		 return a+b;
		 
	 }
	 public double multiple(double a,double b){
		 return a*b;
	 }
	 public double subtract(double a,double b){
		 return a-b;
	 }
	 public double divide(double a,double b){
		 if(b==0){
			 throw new ArithmeticException();}
		 
		 return a/b;
		 
	 }
	
	
}
class Calc
{
public static void main(String args[]){
Calculator c=new Calculator();
		System.out.println(c.add(10,20));
}
}
