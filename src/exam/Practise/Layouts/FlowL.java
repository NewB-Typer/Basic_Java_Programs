package exam.Practise.Layouts;

import java.awt.*;
import javax.swing.*;


public class FlowL extends JFrame{
FlowL(){
JButton jb1 = new JButton("ONE");
JButton jb2 = new JButton("TWO");

setLayout(new FlowLayout());

	add(jb1);
	add(jb2);
	
	setVisible(true);
	setTitle("FlowLayout");
	setSize(400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	
public static void main(String[] args) {
	new FlowL();
	
	
}
}

