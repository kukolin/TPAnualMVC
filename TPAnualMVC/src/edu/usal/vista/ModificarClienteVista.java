package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import edu.usal.controlador.ItemsClienteListener;
import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import cambodia.raven.DateChooser;

public class ModificarClienteVista extends JPanel {
	public JButton btnEnviar;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public ItemsClienteListener itemsClienteListener;
	public JComboBox comboBox;
	private JLabel lblCliente;
	/**
	 * @wbp.nonvisual location=40,524
	 */
	private final DateChooser dateChooser = new DateChooser();
	
	public ModificarClienteVista() throws IOException, SQLException {
		setBackground(Color.BLACK);
		itemsClienteListener = new ItemsClienteListener();
		
		btnEnviar = new JButton("Modificar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(Color.ORANGE);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setForeground(Color.ORANGE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_1 = new JLabel("DNI: ");
		lblNombre_1.setForeground(Color.ORANGE);
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_2 = new JLabel("Cuit/Cuil:");
		lblNombre_2.setForeground(Color.ORANGE);
		lblNombre_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_3 = new JLabel("Fecha Nac.:");
		lblNombre_3.setForeground(Color.ORANGE);
		lblNombre_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_4 = new JLabel("Email:");
		lblNombre_4.setForeground(Color.ORANGE);
		lblNombre_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBox = new JComboBox(itemsClienteListener.valores());
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		dateChooser.setTextRefernce(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		lblCliente = new JLabel("Cliente:");
		lblCliente.setForeground(Color.ORANGE);
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnNewButton = new JButton("...");
		dateChooser.setButton(btnNewButton);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, 0, 280, Short.MAX_VALUE)
					.addGap(213))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(465, Short.MAX_VALUE)
					.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(94))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(85)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNombre_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
								.addComponent(lblNombre_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
								.addComponent(lblNombre_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
								.addComponent(lblNombre_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
						.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(252))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(92)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre_1, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre_2, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre_3, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addComponent(btnEnviar)
					.addGap(126))
		);
		setLayout(groupLayout);
		
		
	}
	public void addListener(ActionListener al) {
		
		btnEnviar.addActionListener(al);
		
	}
	public void addListener2(ItemListener al) {
		
		comboBox.addItemListener(al);
		
	}
}
