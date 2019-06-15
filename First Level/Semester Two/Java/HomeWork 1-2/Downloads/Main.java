// import statements
import javax.swing.JOptionPane;
// main class
public class Main {
    // main method
    public static void main(String[] args) {
        // get info
        try {
            Info info = new Info();
        } catch(Exception e) {
            System.err.println("Error! " + e.getMessage());
        }
        // do whatever with the info
    }
    // info class
    static class Info {
        // instance variables
        public int day, month, year;
        // constructor
        public Info() throws Exception {
            // get inputs
            String[] inputs = JOptionPane.showInputDialog(null,
                "Enter day, month, year").split(" ");
            // not the right size
            if(inputs.length != 3) {
                throw new Exception("Not enough infomation was given!");
            }
            // get values
            day = Integer.parseInt(inputs[0]);
            month = Integer.parseInt(inputs[1]);
            year = Integer.parseInt(inputs[2]);
        }
    }
}