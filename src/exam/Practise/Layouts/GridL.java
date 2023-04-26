package exam.Practise.Layouts;
import javax.swing.*;
import java.awt.*;

public class GridL extends JFrame{
	GridL(){
		JButton jb1 = new JButton("EAST");
		JButton jb2 = new JButton("CENTER");
		JLabel jt1 = new JLabel("WEST");
		
		String count[] = {"apple","ball","cat"};
		JComboBox jb = new JComboBox(count);
		
		
	setLayout(new GridLayout(2,2));	
	
	add(jb1);
	add(jb2);
	add(jt1);
	add(jb);
	
	
	setVisible(true);
	setTitle("FlowLayout");
	setSize(400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	
public static void main(String[] args) {
	new GridL();
	
	
}}
