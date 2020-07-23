package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class AltaLinea extends JPanel {
	public JTextField textField;
	public JTextField textField_1;
	public JButton btnEnviar;

	public AltaLinea() {
		setBackground(Color.BLACK);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.ORANGE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblAlianza = new JLabel("Alianza:");
		lblAlianza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAlianza.setForeground(Color.ORANGE);
		
		JLabel lblVuelosAsignados = new JLabel("Vuelos asignados:                             0");
		lblVuelosAsignados.setForeground(Color.ORANGE);
		lblVuelosAsignados.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(0, 0, 0));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEnviar.setForeground(Color.ORANGE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(lblVuelosAsignados, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
					.addGap(119))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(197, Short.MAX_VALUE)
					.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(164))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAlianza, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
						.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
					.addGap(68)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1)
						.addComponent(textField))
					.addGap(164))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(64)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textField))
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblAlianza))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addComponent(lblVuelosAsignados, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(btnEnviar)
					.addGap(70))
		);
		setLayout(groupLayout);

	}
	
	public void addListener(ActionListener al) {
		btnEnviar.addActionListener(al);
	}
	
	
}