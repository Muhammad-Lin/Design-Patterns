package virtualproxy;

import java.awt.*;
import java.net.URL;

/**
 * @name: ImageProxy
 * @author: yoga
 * @create: 2022-09-21 14:42
 **/
public class ImageProxy implements Icon{
    volatile ImageIcon imageIcon;
    URL imageURL;
    Thread thread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null)
            return imageIcon.getIconWidth();
        else
            return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null)
            return imageIcon.getIconHeight();
        else
            return 600;
    }

    synchronized public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null)
            imageIcon.paintIcon(c,g,x,y);
        else {
            g.drawString("Loading CD cover, please wait...",x+300, y+190);
            if (!retrieving){
                retrieving = true;
                thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageURL,"CD Cover");
                            c.repaint();
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }

    }
}
