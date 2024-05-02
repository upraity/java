// Q17. Write a program of Applet.
import java.applet.*;
import java.awt.Graphics;

/*
<applet code="applets" width="300" height="100"></applet>
*/

public class applets extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 20, 20);
    }
}
