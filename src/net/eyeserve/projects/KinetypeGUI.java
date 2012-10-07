package net.eyeserve.projects;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//jframe is a gui type and action listener allows for buttons to be pushed etc
//they're both completely needed
//i don't want eclipse raging over the serial
@SuppressWarnings("serial")
public class KinetypeGUI extends JFrame implements ActionListener {

	//create a few objects to load onto the jframe for control over the typer
	public static JButton go = new JButton("Go");
	public static JLabel type = new JLabel("You have 5 seconds to switch to your program after hitting go.");
	public static JTextField text = new JTextField("Text", 28);
	public static JTextField amount = new JTextField("x", 5);
	//constructer tells the jframe how to load
	public KinetypeGUI() {
		setSize(354, 120);
		Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE); //this removes the annoying Java icon
		setIconImage(icon);
		setLayout(new FlowLayout()); //problem?
		add(text);
		add(amount);
		add(go);
		add(type);
		go.addActionListener(this);
		setResizable(false);
		setTitle("Kinetype");
		setLocationRelativeTo(null); //sue me
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); //note: this has to come last or you end up with a glitchy half showing form
		//do not want
	}
	//actionperformed is a built in method which is called when.. an action is performed, eg. button push textbox enter etc
	public void actionPerformed(ActionEvent arg0) {
		try{
			Robot r = new Robot();
			int i3 = Integer.parseInt(amount.getText());
			Thread.sleep(5000);
			for(int k1 = 0; k1 < i3; k1++)
			{
				for(int k = 0; k < text.getText().length(); k++)
				{
					System.out.println(KinetypeType.charToInt(text.getText().charAt(k)+""));
					r.keyPress(KinetypeType.charToInt(text.getText().charAt(k)+""));
					r.keyRelease(KinetypeType.charToInt(text.getText().charAt(k)+""));
				}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
		}catch(Exception e)
		{
			//dun matter i hope no one is retarded enough ._.
			e.printStackTrace();
		}
	}
}