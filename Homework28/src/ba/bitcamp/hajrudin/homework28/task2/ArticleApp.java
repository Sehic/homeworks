package ba.bitcamp.hajrudin.homework28.task2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArticleApp extends JFrame {
	private static final long serialVersionUID = 2693630419309491081L;

	private JPanel mainPanel = new JPanel();
	private JPanel inputPanel = new JPanel();

	private JLabel code = new JLabel("Code of article");
	private JLabel name = new JLabel("Name of article");
	private JLabel price = new JLabel("Price of article");

	private JTextField codeField = new JTextField();
	private JTextField nameField = new JTextField();
	private JTextField priceField = new JTextField();

	private JButton button = new JButton("Add article");

	public ArticleApp() {

		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);

		inputPanel.setLayout(new GridLayout(3, 2));
		mainPanel.add(inputPanel, BorderLayout.CENTER);
		inputPanel.add(code);
		inputPanel.add(codeField);
		inputPanel.add(name);
		inputPanel.add(nameField);
		inputPanel.add(price);
		inputPanel.add(priceField);

		mainPanel.add(button, BorderLayout.SOUTH);

		button.addActionListener(new MyListener());

		setSize(400, 200);
		setResizable(false);
		setTitle("Article app");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Connection conn = null;
			try {
				Class.forName("org.sqlite.JDBC");
				conn = DriverManager
						.getConnection("jdbc:sqlite:articleBase.db");
				Statement statement = conn.createStatement();
				String createTable = "create table if not exists article( code varchar(10) primary key, name varchar(50),price real)";
				statement.executeUpdate(createTable);

				addArticle(statement);

			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
		}

		private void addArticle(Statement statement) {
			if (checkInput(statement)) {
				try {
					statement.executeUpdate("insert into article values ('"
							+ codeField.getText() + "', '"
							+ nameField.getText() + "', '"
							+ priceField.getText() + "')");
					JOptionPane.showMessageDialog(null, "Successful :)");
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "ERROR: Wrong code!!!");
				}
			} else {
				JOptionPane.showMessageDialog(null, "ERROR: Wrong input!!!");
			}
		}

		private boolean checkInput(Statement statement) {
			if (codeField.getText().length() != 10) {
				return false;
			}
			try {
				Integer.parseInt(codeField.getText());
			} catch (NumberFormatException e) {
				return false;
			}

			ArrayList<String> list = new ArrayList<String>();
			ResultSet result;
			try {
				result = statement.executeQuery("select name from article");
				while (result.next()) {
					String names = result.getString(1);
					list.add(names);
				}
				for (String nameToCompare : list) {
					if (nameToCompare.equals(nameField.getText())) {
						int temp = JOptionPane.showConfirmDialog(null,
								"Are you sure?");
						if (temp == JOptionPane.YES_OPTION) {
							return true;
						} else {
							return false;
						}
					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return true;
		}
	}
}
