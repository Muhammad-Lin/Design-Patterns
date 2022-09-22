package virtualproxy;

import java.awt.*;
import java.net.URL;

/**
 * @name: ImageIcon
 * @author: yoga
 * @create: 2022-09-21 14:42
 **/
public class ImageIcon implements Icon{
    String name;
    URL imageURL;
    ImageIcon imageIcon;

    public ImageIcon(URL imageURL, String s) {
        this.name = s;
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {

        return 0;
    }

    @Override
    public int getIconHeight() {

        return 0;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {

    }
}
