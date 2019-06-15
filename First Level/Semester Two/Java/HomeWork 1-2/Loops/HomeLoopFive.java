/*Write a program to find the greatest common divisor
for two integer numbers
*/
import java.util.*;
class HomeLoopFive{
public static void main(String []UHD){

Scanner input=new Scanner(System.in);
System.out.print("Please enter first number: ");
int numOne=input.nextInt();
System.out.print("Please enter secand number: ");
int numTwo=input.nextInt();
int gcd=0;
if(numOne==0 || numTwo==0){
   gcd=0;
  }else{
	  if (numOne<numTwo){
		  for (int i=numOne;i>0;i--){
			  if(numOne%i==0 && numTwo%i==0){
				  gcd=i;
				  break;
			  }
		  }
	  }else if (numOne>numTwo){
				  for (int i=numOne;i>0;i--){
				      if(numOne%i==0 && numTwo%i==0){
						     gcd=i;
							  break;
							  }
		  }
	  }else{
		 gcd=numOne;
	  }
  }
System.out.println("divisor "+gcd);
/*
        //Enter two number whose GCD needs to be calculated.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();

        System.out.println("GCD of two numbers " + number1 +" and "
                           + number2 +" is :" + findGCD(number1,number2));


    }

    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }

}

*/

}}