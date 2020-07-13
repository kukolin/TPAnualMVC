package edu.usal.vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import edu.usal.controlador.AgregarItemsCliente;
import edu.usal.controlador.ItemsClienteListener;
import edu.usal.negocio.dominio.Cliente;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListarClientes extends JPanel {
	public JButton btnListar;
	public DefaultTableModel modelo;
	public DefaultListModel<String> model = new DefaultListModel<String>();
	public AgregarItemsCliente agregarItemsCliente;
	private JTable tabla;


	public ListarClientes() throws IOException {
		setBackground(new Color(0, 0, 139));
		agregarItemsCliente  = new AgregarItemsCliente();
		modelo = agregarItemsCliente.items();
		btnListar = new JButton("Actualizar");
		btnListar.setBackground(new Color(0, 0, 0));
		btnListar.setForeground(new Color(255, 0, 0));
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(188)
							.addComponent(btnListar))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnListar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tabla = new JTable(modelo);
		scrollPane.setViewportView(tabla);
		setLayout(groupLayout);

	}
	public void addListener(ActionListener al) {
		btnListar.addActionListener(al);
	}
}
