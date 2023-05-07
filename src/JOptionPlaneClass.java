import javax.swing.*;
import java.util.Scanner;

public class JOptionPlaneClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       JOptionPane.showInputDialog(null,"OAOSDPo");
        String name = JOptionPane.showInputDialog(null, "What's your name?");
        System.out.println("Your name is "+ name);

//        JOptionPane.showMessageDialog(null,"Watch yourself","Warning!", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Watch yourself","Warning!", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Watch yourself","Warning!", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Watch yourself","Warning!", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Watch yourself","Warning!", JOptionPane.ERROR_MESSAGE);
    }
}
