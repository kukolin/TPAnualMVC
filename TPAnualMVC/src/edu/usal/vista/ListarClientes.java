package edu.usal.vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;

public class ListarClientes extends JPanel {
	public JList list;
	public JButton btnListar;
	public DefaultListModel modelo;


	public ListarClientes() {
		setBackground(new Color(0, 0, 128));
		
		btnListar = new JButton("Listar");
		btnListar.setBackground(new Color(0, 0, 0));
		btnListar.setForeground(new Color(255, 0, 0));
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		modelo = new DefaultListModel();
		
		list = new JList();
		list.setModel(modelo);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
					.addGap(12))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(188)
					.addComponent(btnListar)
					.addContainerGap(191, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnListar)
					.addGap(11)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
	public void addListener(ActionListener al) {
		btnListar.addActionListener(al);
	}
}
