import java.util.Scanner;


public class StudentsMarks {


    public static void main(String[] args) {

        Scanner Input = new Scanner (System.in);
        System.out.print("Mark = ");
        int marks=Input.nextInt();
        if (marks>100) {
            System.out.println("Not correct");
        }

        Scanner Input2 = new Scanner (System.in);
        System.out.print("Class = ");
        int classes=Input2.nextInt();

         if(classes!=12){
            System.out.println("The Student did not complete class 12!");
        }


        Scanner Input3 = new Scanner (System.in);
        System.out.print("Trail = ");
        int trail=Input3.nextInt();


        if (classes==12&&trail==1&&marks>=50&&marks<100) {

            marks=marks+3;
            System.out.print("Final mark = "+marks);

        }
        else if(classes==12&&trail==2&&marks>=50&&marks<100){

            marks=marks+2;
            System.out.print("Final mark = "+marks);
        }
        else {
            System.out.print("Final mark = "+marks);
        }

        if (marks<50) {

            System.out.println("   (Failed)");
        }
        else if(marks>=50&&marks<100){

            System.out.println("   (Succeed)");
        }


    }

}
