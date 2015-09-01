package ba.bitcamp.hajrudin.homework28.task2;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Main {
    public static void main(String[] args) {

        JList<String> choice = new JList<>(new String[] {
                "Add article", "Delete article" });
        int result = JOptionPane.showConfirmDialog(null,
                new JScrollPane(choice), "Select option",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result != JOptionPane.OK_OPTION) {
            return;
        }
        if (choice.getSelectedIndex() == 0) {
            new ArticleApp();
        } else if (choice.getSelectedIndex() == 1) {
            new ArticleTask2();
        }
    }
}
