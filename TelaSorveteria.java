import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSorveteria extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuant1;
	private JTextField txtPreco1;
	private JTextField txtQuant2;
	private JTextField txtQuant3;
	private JTextField txtQuant4;
	private JTextField txtPreco2;
	private JTextField txtPreco3;
	private JTextField txtPreco4;
	private JLabel lblNewLabel_4;
	private JTextField txtTotal;
	private JButton btnCalcular;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSorveteria frame = new TelaSorveteria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaSorveteria() {
		setTitle("Sorveteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de sorvete");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 120, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qtde");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(159, 13, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preço Unitario");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(255, 13, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sorvete de frutas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 46, 120, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Chocolate/frutas");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 73, 120, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Bola");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(10, 98, 120, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Pote de 2 Litros");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(10, 123, 120, 14);
		contentPane.add(lblNewLabel_3_3);
		
		txtQuant1 = new JTextField();
		txtQuant1.setBounds(140, 45, 86, 20);
		contentPane.add(txtQuant1);
		txtQuant1.setColumns(10);
		
		txtPreco1 = new JTextField();
		txtPreco1.setBounds(265, 45, 86, 20);
		contentPane.add(txtPreco1);
		txtPreco1.setColumns(10);
		
		txtQuant2 = new JTextField();
		txtQuant2.setColumns(10);
		txtQuant2.setBounds(140, 72, 86, 20);
		contentPane.add(txtQuant2);
		
		txtQuant3 = new JTextField();
		txtQuant3.setColumns(10);
		txtQuant3.setBounds(140, 97, 86, 20);
		contentPane.add(txtQuant3);
		
		txtQuant4 = new JTextField();
		txtQuant4.setColumns(10);
		txtQuant4.setBounds(140, 122, 86, 20);
		contentPane.add(txtQuant4);
		
		txtPreco2 = new JTextField();
		txtPreco2.setColumns(10);
		txtPreco2.setBounds(266, 72, 86, 20);
		contentPane.add(txtPreco2);
		
		txtPreco3 = new JTextField();
		txtPreco3.setColumns(10);
		txtPreco3.setBounds(266, 97, 86, 20);
		contentPane.add(txtPreco3);
		
		txtPreco4 = new JTextField();
		txtPreco4.setColumns(10);
		txtPreco4.setBounds(266, 122, 86, 20);
		contentPane.add(txtPreco4);
		
		lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(159, 148, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtTotal = new JTextField();
		txtTotal.setEnabled(false);
		txtTotal.setBounds(266, 147, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quant1 = Integer.parseInt(txtQuant1.getText());
				float preco1 = Float.parseFloat(txtPreco1.getText());
				
				float mult1 = (quant1*preco1);
				
				int quant2 = Integer.parseInt(txtQuant2.getText());
				float preco2 = Float.parseFloat(txtPreco2.getText());
				
				float mult2 = (quant2*preco2);
				
				int quant3 = Integer.parseInt(txtQuant3.getText());
				float preco3 = Float.parseFloat(txtPreco3.getText());
				
				float mult3 = (quant3*preco3);
				
				int quant4 = Integer.parseInt(txtQuant4.getText());
				float preco4 = Float.parseFloat(txtPreco4.getText());
				
				float mult4 = (quant4*preco4);
				
				float total = (mult1 + mult2 + mult3 + mult4);
				
				txtTotal.setText(String.valueOf(total));
				
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.setBounds(137, 178, 89, 23);
		contentPane.add(btnCalcular);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtQuant1.setText(null);
				txtQuant2.setText(null);
				txtQuant3.setText(null);
				txtQuant4.setText(null);
				
				txtPreco1.setText(null);
				txtPreco2.setText(null);
				txtPreco3.setText(null);
				txtPreco4.setText(null);
				
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpar.setBounds(263, 178, 89, 23);
		contentPane.add(btnLimpar);
	}

}
