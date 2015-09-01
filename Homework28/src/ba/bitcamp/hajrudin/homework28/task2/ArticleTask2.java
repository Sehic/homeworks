package ba.bitcamp.hajrudin.homework28.task2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class ArticleTask2 extends JFrame {
	private static final long serialVersionUID = -1058351261839501095L;

	private static JPanel mainPanel = new JPanel();

	private JButton button = new JButton("Delete");
	
	private static DefaultListModel<Article> model = new DefaultListModel<Article>();
	private static JList<Article> choice;

	public ArticleTask2() {
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);

		updateList();

		mainPanel.add(choice, BorderLayout.CENTER);
		mainPanel.add(button, BorderLayout.SOUTH);

		button.addActionListener(new MyListener());

		setSize(400, 200);
		setResizable(false);
		setTitle("Delete article");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void updateList(){
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:articleBase.db");
			Statement statement = conn.createStatement();
			ResultSet result;

			result = statement.executeQuery("select * from article");
			while (result.next()) {
				String code = result.getString(1);
				String name = result.getString(2);
				Double price = result.getDouble(3);

				Article a = new Article(code, name, price);
				model.addElement(a);
			}

			choice = new JList<Article>(model);
			
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
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
				Article a = choice.getSelectedValue();
				String codeToDelete = a.getCode();
				String remove = "DELETE FROM article WHERE code='"
						+ codeToDelete + "';";
				statement.execute(remove);
				
				DefaultListModel<Article> model = (DefaultListModel<Article>)choice.getModel();
                model.remove(choice.getSelectedIndex());
				
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
		}

	}

}
