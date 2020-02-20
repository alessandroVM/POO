import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	private JButton btn,btn2;
	int i=1,n;
	public MainFrame() {
		super("Welcome to the future!");
		
		setLayout(new BorderLayout());
		
		btn = new JButton("Boton 2");
		btn2 = new JButton("Boton 1");
		textArea = new JTextArea();
		
		// listen to button clicks; remember Android?
		// can be done also implementing it in the class
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append(i+"\n");
				n=i+1;
				i=i+2;
			}
		});
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {			
				textArea.append(n+"\n");
				i=n+1;
				n=n+2;
			}
		});
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		add(btn2,BorderLayout.NORTH);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
