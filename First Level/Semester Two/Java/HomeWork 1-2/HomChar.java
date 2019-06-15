import java.util.*;

class HomChar{
  public static void main(String[] args) {

//Scanner inputNum=new Scanner(System.in);
Scanner input=new Scanner(System.in);


System.out.print("Please enter mark: ");
int numIn=input.nextInt();
System.out.print("Please enter A to completed first years and trial,B to completed first years and secand trial , and C to copmletrd more than: ");
char inChar=input.next().charAt(0);

if (inChar == 'A'){
//	if(inChar == 'a'){
		int firstYears=numIn+3;
System.out.println("This a studit completed first yeasr "+firstYears);

}


}}