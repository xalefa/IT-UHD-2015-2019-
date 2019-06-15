
//Twana Nareman Dep of IT -GA-2
//Homework 1

import javax.swing.*;

class BigThreeNumF{

   public static void main(String []UHD){

        JOptionPane.showMessageDialog(null,"This a program to find bigest three number ","Message Box",JOptionPane.INFORMATION_MESSAGE);

        int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number one:","Input box",JOptionPane.QUESTION_MESSAGE));
        int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number two:","Input box",JOptionPane.QUESTION_MESSAGE));
        int num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number three:","Input box",JOptionPane.QUESTION_MESSAGE));

        if (num1>num2 && num1>num3){
		 JOptionPane.showMessageDialog(null,"Numer one biggest "+num1+" in "+num2+" and "+num3,"Message Box",JOptionPane.INFORMATION_MESSAGE);
		  }else if(num2>num1 && num2>num3){
		   JOptionPane.showMessageDialog(null,"Number two biggest "+num2+" in "+num1+" and "+num3,"Message Box",JOptionPane.INFORMATION_MESSAGE);
	        }else if (num3>num1 && num3>num2){
			 JOptionPane.showMessageDialog(null,"Number three biggest "+num3+" in "+num1+" and "+num2,"Message Box",JOptionPane.INFORMATION_MESSAGE);
		      }else{
			   JOptionPane.showMessageDialog(null,"Not biggest","Message Box",JOptionPane.INFORMATION_MESSAGE);
					}

}}