package gui.bitcamp;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorldGUI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton okButton = new JButton("OK");
		ButtonHandler listener = new ButtonHandler();
		okButton.addActionListener(listener);
		
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.CENTER);
		content.add (okButton, BorderLayout.SOUTH);
		
		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(250, 100);
		window.setLocation(100, 100);
		window.setVisible(true);
				
		
				
	}
	private static class HelloWorldDisplay extends JPanel{
		public void paintComponent(Graphics g) {
		super.paintComponent (g);
		g.drawString ("Hello World!" , 20, 30);
		}
	}
	private static class ButtonHandler implements ActionListener {
		public void actionPerformed (ActionEvent e){
			System.exit (0);
		}
	}
	
}
