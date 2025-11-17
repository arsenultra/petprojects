import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
     
    MyFrame(){
        ImageIcon logo = new ImageIcon("logo.png");
        ImageIcon image = new ImageIcon("wheel.png");

        JLabel label = new JLabel();
        label.setText("Wheel of Fortune");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("MV Boli", Font.PLAIN,50));
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(250,75,600,600);


        ImageIcon icon = new ImageIcon("logo.png");
        this.setIconImage(icon.getImage());

        this.setTitle("Wheel of Fortune");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.add(label);


    }
    
}
