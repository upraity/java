// Q17. Write a program to use applet.
import java.applet.Applet;
import java.awt.Graphics;

public class simpleapplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet Programming!", 50, 50);
    }
}

