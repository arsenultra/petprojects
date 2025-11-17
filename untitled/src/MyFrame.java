import javax.swing.*;

public class MyFrame extends JFrame{
     
    MyFrame(){
        ImageIcon image = new ImageIcon("wheel.png");

        JLabel label = new JLabel();
        label.setText("Wheel of Fortune");
        label.setIcon(image);

        ImageIcon icon = new ImageIcon("logo.png");
        this.setIconImage(icon.getImage());

        this.setTitle("Wheel of Fortune");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setResizable(false);
        this.setVisible(true);
        this.add(label);


    }
    
}
