package piramideFibonacc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class piramide extends JFrame {

	private JPanel contentPane;
	private JTextField entrada;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					piramide frame = new piramide();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void mostrarPiramide(int matriz[][],int n) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(n);
		model.setColumnCount(n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				table.setValueAt(matriz[i][j], i,j);
			}
		}
	}
    public int[][] piramideF(int n){
    	int [][] pirad = new int[11][11];
    	int p,e=0,sw=0;
    	p=(n-1)/2;
    	int j=p;
    	for(int i=0;i<n;i++) {
    		pirad[j][i]=1;
    		if(j!=0 & e==0) {
    			j--;
    		}else{
    			j++;
    			e=1;
    		}
    	}
    	
    	for(int i=0;i<n;i++) {
    		for(j=0;j<n;j++) {
    			if(pirad[i][j]!=0 && pirad[i][j+2]!=0) {
    				pirad[i+1][j+1]=pirad[i][j]+pirad[i][j+2];
    			}
    		}
    	}
    	return pirad;
    }
	
	
	/**
	 * Create the frame.
	 */
	public piramide() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btn = new JButton("Generar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int n= Integer.parseInt(entrada.getText());
			int [][] piramide = new int[11][11];
			piramide= piramideF(n);
			mostrarPiramide(piramide,n);
			}
		});
		
		entrada = new JTextField();
		entrada.setColumns(10);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		
		JLabel lblNewLabel = new JLabel("Tama\u00F1o de la piramide");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(entrada, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btn))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(9)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn)
						.addComponent(entrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
