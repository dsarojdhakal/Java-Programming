import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setBounds(100,100,200,300);

        DefaultMutableTreeNode semester = new DefaultMutableTreeNode("Semesters");
        DefaultMutableTreeNode bba = new DefaultMutableTreeNode("BBA");
        DefaultMutableTreeNode bit = new DefaultMutableTreeNode("BIT");
        DefaultMutableTreeNode bit1 = new DefaultMutableTreeNode("BIT-1");
        DefaultMutableTreeNode bit2 = new DefaultMutableTreeNode("BIT-2");
        DefaultMutableTreeNode bba1 = new DefaultMutableTreeNode("BBA-1");

        bit.add(bit1);
        bit.add(bit2);
        bba.add(bba1);
        semester.add(bba);
        semester.add(bit);

        JTree tree = new JTree(semester);
        frame.add(tree);
        frame.setVisible(true);
    }
    
}
