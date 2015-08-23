package ba.bitcamp.hajrudin.homework28.task1;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ComplaintsView extends JFrame {
	private static final long serialVersionUID = 8946598767365507919L;
	private JPanel mainPanel = new JPanel();
	private JTextArea text = new JTextArea();
	private JScrollPane scroll = new JScrollPane(text);

	public ComplaintsView() {
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		mainPanel.add(scroll, BorderLayout.CENTER);
		text.setEditable(false);

		Connection conn = null;

		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager
					.getConnection("jdbc:sqlite:base.db");
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from complaints");
			ArrayList<Complaint> list = new ArrayList<Complaint>();
			while (result.next()) {
				int id = result.getInt(1);
				String date = result.getString(2);
				String message = result.getString(3);
				
				Complaint c = new Complaint(id, date, message);
				list.add(c);
			}
			for(Complaint c : list){
				text.append(c.toString());				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		setSize(500, 300);
		setResizable(false);
		setTitle("Complaints wiew");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
