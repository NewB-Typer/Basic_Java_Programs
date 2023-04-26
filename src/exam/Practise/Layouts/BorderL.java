package exam.Practise.Layouts;
import java.awt.*;
import javax.swing.*;

public class BorderL extends JFrame{
BorderL(){
	JButton jb1 = new JButton("EAST");
	JButton jb2 = new JButton("CENTER");
	JLabel jt1 = new JLabel("WEST");
	JLabel jt2 = new JLabel("North");
	JButton jt3 = new JButton("SOUTH");
	
add(jb1,BorderLayout.EAST);
	add(jb2,BorderLayout.CENTER);
	add(jt1,BorderLayout.WEST);
	add(jt2,BorderLayout.NORTH);
	add(jt3,BorderLayout.SOUTH);
	
	setVisible(true);
	setSize(480,480);
	setTitle("BorderLayout");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
	new BorderL();
}
}
