package ba.bitcamp.hajrudin.homework6.task03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task03 extends JFrame {

	private static final long serialVersionUID = -1916062858856070486L;

	private JButton[] buttons = new JButton[5];
	private JButton[] buttons1 = new JButton[5];

	public String[] arr = new String[5];

	public Task03() {
		GridLayout layout = new GridLayout();
		setLayout(new GridLayout(2, 5));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i));
			add(buttons[i], GridLayout.class);
			buttons[i].addActionListener(new Action());
		}
		for (int i = 0; i < buttons.length; i++) {

			buttons1[i] = new JButton(Integer.toString(i + 5));
			add(buttons1[i], GridLayout.class);
			buttons1[i].addActionListener(new Action());
		}

		setVisible(true);
		setTitle("Task03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Task03 Task03 = new Task03();
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {
					buttons1[i].setEnabled(false);
					arr[i] = buttons[i].getText();
				} else if (e.getSource() == buttons1[i]) {
					buttons[i].setEnabled(false);
					arr[i] = buttons1[i].getText();
				}
			}
			if (arr[4] != null) {
				JOptionPane.showMessageDialog(null, Arrays.toString(arr));
				System.exit(0);
			}
		}

	}
}
