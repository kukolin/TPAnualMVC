package edu.usal.vista;

import javax.swing.JPanel;

import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;

public class BajaCliente extends JPanel {
	public JTextField textField;
	public JButton btnEnviar;

	public BajaCliente() {
		setBackground(new Color(0, 0, 128));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(0, 0, 0));
		btnEnviar.setForeground(new Color(255, 0, 0));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblIngreseElId = new JLabel("Ingrese el ID del cliente a eliminar:");
		lblIngreseElId.setForeground(new Color(255, 0, 0));
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseElId.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(153)
					.addComponent(textField)
					.addGap(211))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(150)
					.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(211))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(88)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
					.addGap(146))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(74)
					.addComponent(lblIngreseElId)
					.addGap(29)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(btnEnviar))
		);
		setLayout(groupLayout);
		
		
		

	}
	public void addListener(ActionListener al) {
		btnEnviar.addActionListener(al);
	}
}
