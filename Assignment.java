import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.BoxLayout
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Assignment {

    public static void main(String[] args) {
        JFrame theFrame = new JFrame();

        theFrame.setBounds(200, 200, 720, 450);
        theFrame.setVisible(true);

        JPanel thePanel1 = new JPanel();
        thePanel1.setLayout(new BorderLayout());
        JPanel thePanel2 = new JPanel();
        thePanel2.setLayout(new BoxLayout(thePanel2, 3));

        thePanel1.add(new Button ("Center"), BorderLayout.CENTER);    
        theFrame.add(thePanel1);
	}

}
