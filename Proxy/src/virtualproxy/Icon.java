package virtualproxy;

import java.awt.*;

/**
 * @name: Icon
 * @author: yoga
 * @create: 2022-09-21 14:41
 **/
public interface Icon {
    public int getIconWidth();
    public int getIconHeight();
    public void paintIcon(final Component c, Graphics g, int x, int y);
}
