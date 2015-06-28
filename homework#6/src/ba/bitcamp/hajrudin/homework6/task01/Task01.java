package ba.bitcamp.hajrudin.homework6.task01;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task01 extends JFrame {

	private static final long serialVersionUID = -8145463734195863317L;

	private JButton[] buttons = new JButton[10];

	public String s = "";

	public Task01() {
		GridLayout layout = new GridLayout();
		setLayout(new GridLayout(10, 1));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i));
			add(buttons[i], GridLayout.class);
			buttons[i].addActionListener(new Action());
		}

		setVisible(true);
		setTitle("Task01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 300);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Task01 Task01 = new Task01();
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {
					s += buttons[i].getText();
				}
				if (s.length() == 3) {
					JOptionPane.showMessageDialog(null, "Number: " + s);
					System.exit(0);
				}
			}
		}

	}

}