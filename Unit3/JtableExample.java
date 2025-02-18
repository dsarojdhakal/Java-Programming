import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JtableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setBounds(100,100,600,300);
        String[] columns = {"ID","Full Name", "Address"};
        Object[][] data = {{1001,"Ram Sharma","Kawasoti"}, 
                            {1001,"Shyam Sharma","Kawasoti"}, 
                            {1001,"Ram ","Kawasoti"}, 
                            {1001,"Ram hari Sharma","Kawasoti"}};
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        // frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
