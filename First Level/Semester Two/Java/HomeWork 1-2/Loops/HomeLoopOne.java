/*Write a program to find summation of numbers between 1
and x (when x is any number entered by user).*/

import javax.swing.*;

class HomeLoopOne{
public static void main(String []UHD){
	//int valueI=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter Value I: "));
	int valueX=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter Value X: "));

	int sum=0;
	for (int i=1;i<=valueX ;i++){
      int number=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter numer: "));
       sum=sum+number;
       }//for
JOptionPane.showMessageDialog(null,"Total "+valueX+" numer equal: "+sum);







}}