// Java code is comlied into bytecode instead of native for a particular model
// Java bytecode then can be executed by a java runtime interpreter.

import javax.swing.*;

public class chapter1 {
    public static void main(String args[]) {
    System.out.println("Hello, world!");
    JFrame frame = new JFrame("Hello, Java!");
    frame.setSize(300, 150);
    JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
    frame.add(label);
    frame.setVisible(true);
    // Why we need to start our program with a class???
    // why static void main not only main
}
}
