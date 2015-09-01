package ba.bitcamp.hajrudin.homework28.task1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ComplaintsApp extends JFrame {
	private static final long serialVersionUID = 4896480203005906526L;
	private JPanel mainPanel = new JPanel();
	private JButton button = new JButton("SAVE");
	private JTextArea text = new JTextArea();
	private JScrollPane scroll = new JScrollPane(text);

	public ComplaintsApp() {
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		mainPanel.add(button, BorderLayout.SOUTH);
		button.addActionListener(new MyAction());
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		mainPanel.add(scroll);
		setSize(500, 300);
		setResizable(false);
		setTitle("Complaints app");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public class MyAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Connection conn = null;
			try {
				Class.forName("org.sqlite.JDBC");
				System.out.println("Library loaded.");

				conn = DriverManager
						.getConnection("jdbc:sqlite:base.db");
				System.out.println("Connection established.");

			} catch (ClassNotFoundException ex) {
				System.err.println("JDBC library is not loaded.");
				System.err.println("Msg: " + ex.getMessage());
				ex.printStackTrace();
				System.exit(1);
			} catch (SQLException ex) {
				System.err.println("Could not connect to the database.");
				System.err.println("Msg: " + ex.getMessage());
				System.exit(1);
			}

			try {

				Statement statement = conn.createStatement();
				String createTable =
						"create table if not exists complaints( id integer primary key,time date,message text);";
				statement.executeUpdate(createTable);
				DateFormat dateFormat = new SimpleDateFormat(
						"yyyy/MM/dd HH:mm:ss");
				Calendar cal = Calendar.getInstance();
				System.out.println(dateFormat.format(cal.getTime()));
				String command = "INSERT INTO complaints VALUES(null, + '"
						+ dateFormat.format(cal.getTime()) + "','"
						+ text.getText() + "');";
				statement.executeUpdate(command);
			} catch (SQLException ex) {
				System.out.println("Bad SQL Command.");
				System.out.println("Continuing on.");
			}

		}
	}
}
