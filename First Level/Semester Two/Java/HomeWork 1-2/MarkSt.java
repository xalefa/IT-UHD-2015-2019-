
//Twana Nareman Qader    IT level 1      GA-2
import java.util.*;

class MarkSt{
public static void main(String []UHD){

Scanner in=new Scanner (System.in);
System.out.print("please enter full name: ");
	String fulName=in.nextLine();
System.out.print("Please enter char, (S) to part Scientific ,but (L) to Litera : ");
char inChar=in.next().charAt(0);

if(inChar=='S' || inChar=='s'){

	System.out.print("Enter mark Kurdy: ");
    int kurdy=in.nextInt();
    System.out.print("Enter mark Araby: ");
    int araby=in.nextInt();
    System.out.print("Enter mark English: ");
    int english=in.nextInt();
    System.out.print("Enter mark Math: ");
    int math=in.nextInt();
    System.out.print("Enter mark Fezya: ");
    int fezya=in.nextInt();
    System.out.print("Enter mark Kemya: ");
    int kemya=in.nextInt();
    System.out.print("Enter mark Zendazany: ");
    int zendazany=in.nextInt();

    int total=(kurdy+araby+english+math+fezya+kemya+zendazany)/7;
    System.out.println("This a  mark "+fulName+"\n Kurdy: "+kurdy+" \n Araby: "+araby+ "\n English: "+english+"\n Mathmatic: "+math+"\n Fezya: "+fezya+"\n Kemya: "+kemya+"\n Zendazany: "+zendazany +"\n Total Mark= "+total);
    System.out.println("******************** ");
    System.out.print("Enter char A to first year and first trial, B first year and second tria,but C more than one year: ");
    char inCharCom=in.next().charAt(0);
    if(inCharCom=='A' || inCharCom=='a'){
		int firYeFT=total+3;
		System.out.println("For completd first year and first trial add three mark, it means total "+fulName+" = "+firYeFT);
	}else if (inCharCom=='B' || inCharCom=='b'){
		int firYeST=total+1;
		System.out.println("For completd first year and secand trial add one mark, it means total "+fulName+" = "+firYeST);
	}else{
      System.out.println("For completd more than one year not add  mark, it means total "+fulName+" = "+total);
	}

}else if(inChar=='L' || inChar=='l'){
	    System.out.print("Enter mark Kurdy: ");
	    int kurdy=in.nextInt();
	    System.out.print("Enter mark Araby: ");
	    int araby=in.nextInt();
	    System.out.print("Enter mark English: ");
	    int english=in.nextInt();
	    System.out.print("Enter mark Math: ");
	    int math=in.nextInt();
	    System.out.print("Enter mark Mezhw: ");
	    int mezhw=in.nextInt();
	    System.out.print("Enter mark Abory: ");
	    int abory=in.nextInt();
	    System.out.print("Enter mark Jwgrafya: ");
        int jgwgrafya=in.nextInt();


       int totalA=(kurdy+araby+english+math+mezhw+abory+jgwgrafya)/7;
	    System.out.println("This a  mark "+fulName+"\n Kurdy: "+kurdy+" \n Araby: "+araby+ "\n English: "+english+"\n Mathmatic: "+math+"\n Mezhw: "+mezhw+"\n Abory: "+abory+"\n Jgwgrafya: "+jgwgrafya +"\n Total Mark= "+totalA);
        System.out.println("******************** ");

    System.out.print("Enter char A to first year and first trial, B first year and second tria,but C or othr key more than one year: ");
	    char inCharCom2=in.next().charAt(0);
	    if(inCharCom2=='A' || inCharCom2=='a'){
			int firYeFTa=totalA+3;
			System.out.println("For completd first year and first trial add three mark, it means total "+fulName+" = "+firYeFTa);
		}else if (inCharCom2=='B' || inCharCom2=='b'){
			int firYeSTa=totalA+1;
			System.out.println("For completd first year and secand trial add one mark, it means total "+fulName+" = "+firYeSTa);
		}else{
	      System.out.println("For completd more than one year not add  mark, it means total "+fulName+" = "+totalA);
	}

}

}}