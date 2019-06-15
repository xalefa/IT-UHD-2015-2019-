//Twana Nareman     GA-2   1st
//Homework two

import java.util.Scanner;
import javax.swing.*;
 class HomeDivisible {

    public static void main(String[] args) {

int number=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number"));

if(number%5==0 && number%2==0){
		JOptionPane.showMessageDialog(null,"This a number " +number+" divisible  5 and 2 ");
            }else
   if(number%5==0 ){
		JOptionPane.showMessageDialog(null,"This a number " +number+" divisible  5  ");
            }else
       if(number%2==0 ){
		JOptionPane.showMessageDialog(null,"This a number " +number+" divisible  2  ");
            }else
            {
				JOptionPane.showMessageDialog(null,"This a number " +number+" not divisible by 2 and 5 ");
			}




    }
}