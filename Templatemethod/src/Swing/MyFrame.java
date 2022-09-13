package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame是最基本的Swing容器，继承了一个paint()方法
 * 默认状态下paint()是不做事情的，它是一个“钩子”
 * 通过覆盖paint()可以将自己的代码插入JFrame算法中
 */

/**
 * @name: MyFrame
 * @author: yoga
 * @create: 2022-09-13 15:19
 **/
public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg,100,100);
    }

    public static void main(String[] args){
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
