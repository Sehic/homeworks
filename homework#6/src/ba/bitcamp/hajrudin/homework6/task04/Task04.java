package ba.bitcamp.hajrudin.homework6.task04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task04 extends JFrame{
	
	private static final long serialVersionUID = -3378914738903507127L;

	private JButton button1 = new JButton("A");
	private JButton button2 = new JButton("Insert");
	private JButton button3 = new JButton(">");
	private JButton button4 = new JButton("<");
	
	public String[] s = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U","V","Z"};
	public String s1 = "";
	
	private JLabel text = new JLabel("_");
	
	
	public Task04(){
		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		
		add(button1, BorderLayout.NORTH);
		button1.addActionListener(new Action());
		add(button2, BorderLayout.SOUTH);
		button2.addActionListener(new Action());
		add(button3, BorderLayout.EAST);
		button3.addActionListener(new Action());
		add(button4, BorderLayout.WEST);
		button4.addActionListener(new Action());
		text.setHorizontalAlignment(NORMAL);
		add(text, BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Task04");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		Task04 Task04 = new Task04();
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1){
				button1.setText((s[(int)(Math.random()*s.length)]));
			} else if(e.getSource()==button2){
				int temp = text.getText().indexOf("_");
				s1 = text.getText().substring(0,temp);
				s1+=button1.getText();
				s1+="_";
				s1+=text.getText().substring(temp+1, text.getText().length());
				text.setText(s1);
			} else if(e.getSource()==button3){
				int temp = text.getText().indexOf("_");
				try{
					s1 = text.getText().substring(0,temp);
					s1+=text.getText().substring(temp+1, temp+2)+"_";
					s1+=text.getText().substring(temp+2, text.getText().length());
					text.setText(s1);
					}catch(StringIndexOutOfBoundsException ex){}
			} else if(e.getSource()==button4){
				int temp = text.getText().indexOf("_");
				try{
				s1 = text.getText().substring(0,temp-1);
				s1+="_";
				s1+=text.getText().substring(temp-1, temp);
				s1+=text.getText().substring(temp+1, text.getText().length());
				text.setText(s1);
				}catch(StringIndexOutOfBoundsException ex){}
			} 
		}

	}
}
