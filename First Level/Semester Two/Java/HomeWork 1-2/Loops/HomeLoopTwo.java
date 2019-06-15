/*Write a program to find average mark for a student,
check if the average is grater than 50 or not (consider
the student has 6 subjects).*/


import javax.swing.*;

class HomeLoopTwo{
public static void main(String []UHD){


    double sum=0;
	for (double i=1;i<=6;i++){
		 double number=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter mark stiudnt: "));
	sum=sum+number;
	}
JOptionPane.showMessageDialog(null,"Total mark = "+(sum/6));

}}