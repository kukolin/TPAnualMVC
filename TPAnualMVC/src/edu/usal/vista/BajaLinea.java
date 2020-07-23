package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;

import edu.usal.controlador.ItemsLineasAereas;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class BajaLinea extends JPanel {
	private JLabel lblIngreseElId;
	public JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	public JComboBox comboBox;
	ItemsLineasAereas itemsLineasAereas;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public BajaLinea() throws IOException, SQLException {
		setForeground(Color.ORANGE);
		setBackground(Color.BLACK);
		itemsLineasAereas = new ItemsLineasAereas();
		lblIngreseElId = new JLabel("Ingrese el id de la Linea Aerea a dar de baja:");
		lblIngreseElId.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseElId.setForeground(Color.ORANGE);
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.ORANGE);
		
		lblNewLabel = new JLabel("");
		
		lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_2 = new JLabel("");
		
		lblNewLabel_3 = new JLabel("");
		
		comboBox = new JComboBox(itemsLineasAereas.valores());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addGap(42))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(65)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
					.addGap(116)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
							.addGap(261))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(0)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addGap(106)
									.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
									.addGap(88))))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(188)
					.addComponent(comboBox, 0, 170, Short.MAX_VALUE)
					.addGap(196))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(89)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
					.addGap(24)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 16, Short.MAX_VALUE)
					.addGap(37))
		);
		setLayout(groupLayout);

	}
	
	public void addListener(ActionListener bl) {
		btnNewButton.addActionListener(bl);
	}
}
