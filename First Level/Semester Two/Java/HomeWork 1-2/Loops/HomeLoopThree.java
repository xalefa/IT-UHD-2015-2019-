/*Write a program to insert marks of 10 students,
then show how many students passed in the exam.*/


import javax.swing.*;

class HomeLoopThree{
public static void main(String []UHD){


    double sum=0;
	for (double i=1;i<=10;i++){
	 double number=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter mark stiudnt: "));
     if (number>=50 && number<=100){
	 JOptionPane.showMessageDialog(null,"This a stiudent pass = "+number);
	  }else {JOptionPane.showMessageDialog(null,"Not pass ");}
	}
//JOptionPane.showMessageDialog(null,"Total mark = "+(sum/6));
}}