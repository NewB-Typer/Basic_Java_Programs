package exam.Practise.Layouts;
import javax.swing.*;

public class ByDefault extends JFrame{
ByDefault(){
	setDefaultLookAndFeelDecorated(true);
	JLabel jl = new JLabel("Enter");
	JTextField jt = new JTextField(15);
	getContentPane().setLayout(null);

	jl.setBounds(20,20,200,40);
	jt.setBounds(60,20,200,40);
	getContentPane().add(jl);
	getContentPane().add(jt);
	
	setVisible(true);
	setTitle("Default Layout");
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public static void main(String[] args){
	new ByDefault();
	
	
}
}
