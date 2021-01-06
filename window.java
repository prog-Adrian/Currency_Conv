// Window class
package converter;
import javax.swing.*;

public class window {
    JFrame main;
    JPanel main_p;
    JButton conv_btn;
    JLabel title;
    public window(){
        this.main = new JFrame();
        this.main_p = new JPanel();
        this.conv_btn = new JButton("Click me");
        this.title = new JLabel("Welcome to the money converter!");
        main.add(title);
        main.add(conv_btn);
        title.setBounds(250,30,600,25);
        conv_btn.setBounds(300,350,150,50);
        main.getContentPane().setLayout(null);
        main.setSize(800,800);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
