package ba.bitcamp.hajrudin.homework6.task02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task02 extends JFrame{
	
	public static class FirstName{
		public static String name="Name";
		public static String character = "ABCDEFGHIJKLMNOPRSTUVZ";
		
		public static String generateName(){
			String newName = name+character.charAt((int)(Math.random()*character.length()));
			return newName;
		}
	}
	
	public static class LastName{
		public static String surname="Surname";
		
		public static String generateSurname(){
			String newSurname = surname+FirstName.character.charAt((int)(Math.random()*FirstName.character.length()));
			return newSurname;
		}
	}
	
	private static final long serialVersionUID = -453210636324687928L;
	
	private JButton button1 = new JButton("Name");
	private JButton button2 = new JButton("Surname");
	private JLabel text = new JLabel("Name  Surname");

	public Task02() {
		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		
		add(button1, BorderLayout.WEST);
		button1.addActionListener(new Action());
		
		add(button2, BorderLayout.EAST);
		button2.addActionListener(new Action());
		
		text.setHorizontalAlignment(NORMAL);
		add(text, BorderLayout.CENTER);

		setVisible(true);
		setTitle("Task02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocationRelativeTo(null);
	}

	
	
	public static void main(String[] args) {
		Task02 Task02 = new Task02();
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1){
				String s = FirstName.generateName()+text.getText().substring(5);
				text.setText(s);
			}else if(e.getSource()==button2){
				String s = text.getText().substring(0, 6)+LastName.generateSurname();
				text.setText(s);
			}
			
		}

	}
}
