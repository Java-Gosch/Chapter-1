import javax.swing.*;

public class RandomGuess {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, " You got Number " +
                (1+ (int)(Math.random() *1000000)));

    }
}
