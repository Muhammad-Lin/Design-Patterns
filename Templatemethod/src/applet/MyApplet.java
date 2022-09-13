package applet;

import java.applet.Applet;
import java.awt.*;

/**
 * @name: MyApplet
 * @author: yoga
 * @create: 2022-09-13 15:35
 **/
public class MyApplet extends Applet {

    String message;

    public void init(){
        message = "Hello everyone, I'm alive!";
        repaint();
    }

    public void start(){
        message = "Now I'm starting up...";
        repaint();
    }

    public void stop(){
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    public void destroy(){
        System.out.println("applet is destroying...");
    }

    public void paint(Graphics g){
        g.drawString(message,5,15);
    }
}
