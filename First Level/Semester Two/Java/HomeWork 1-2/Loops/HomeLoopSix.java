/*Write a program to determine if a number is prime or not.
(hint: a number is said to be prime if it can be divided by 1
and itself).*/

import java.util.Scanner;
class HomeLoopSix{
   public static void main(String []UHD)
   {
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check: ");
	//capture the input in an integer
	int num=scan.nextInt();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}

	if(isPrime){
	   System.out.println(num + " is Prime Number");
	}else{
	   System.out.println(num + " is not Prime Number");
      }
	   /*
	boolean isPrime = true;
    for (int i = 2; i < n; i++) {
     if (n % i == 0) {
	    isPrime = false;
	         break;
	               }
	           }

	           if (isPrime) {

	               System.out.println(n + " is a prime number");

	         } else {

	               System.out.println(n + " is not a prime number");

	           }*/

   }
}