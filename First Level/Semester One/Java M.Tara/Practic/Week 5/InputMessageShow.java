// Using JOptionPaneto Input value from a dialog box.
import javax.swing.JOptionPane;
public class InputMessageShow{
public static void main( String[] args) {
// show dialog which prompts user to input a name
String name = JOptionPane.showInputDialog(null,"What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);
//show a dialog with a message
JOptionPane.showMessageDialog( null,
name + "Welcome, to University", "Show a Message", JOptionPane.INFORMATION_MESSAGE);
}
}