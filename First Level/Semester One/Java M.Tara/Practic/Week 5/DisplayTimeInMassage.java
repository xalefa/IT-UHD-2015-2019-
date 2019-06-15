import javax.swing.JOptionPane;
public class DisplayTimeInMassage {
public static void main(String[] args) {
int seconds, minutes, remainingSeconds;
String secondStr;
secondStr = JOptionPane.showInputDialog(null, "Enter time in seconds", "Convert Time", JOptionPane.QUESTION_MESSAGE );
seconds = Integer.parseInt(secondStr);
minutes = seconds / 60;
remainingSeconds = seconds % 60;
JOptionPane.showMessageDialog(null, seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
}
}