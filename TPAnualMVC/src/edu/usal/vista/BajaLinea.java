package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;

public class BajaLinea extends JPanel {
	public JTextField textField;
	private JLabel lblIngreseElId;
	public JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public BajaLinea() {
		setForeground(new Color(255, 0, 0));
		setBackground(new Color(0, 0, 128));
		
		lblIngreseElId = new JLabel("Ingrese el id de la Linea Aerea a dar de baja:");
		lblIngreseElId.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseElId.setForeground(new Color(255, 0, 0));
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
					.addGap(42))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(157)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField, Alignment.LEADING)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(207))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(89)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(42)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(btnNewButton)
					.addGap(74))
		);
		setLayout(groupLayout);

	}
	
	public void addListener(ActionListener bl) {
		btnNewButton.addActionListener(bl);
	}
}
