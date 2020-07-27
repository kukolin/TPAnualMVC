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

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.toedter.calendar.JCalendar;
import cambodia.raven.DateChooser;

public class AltaClienteVista extends JPanel {
	public JButton btnEnviar;
	public JTextField tNombre;
	public JTextField tDni;
	public JTextField tNumeroPas;
	public JTextField tCuit;
	public JTextField tFechaNac;
	public JTextField tEmail;
	public JTextField tPersonal;
	public JTextField tCelular;
	public JTextField tLaboral;
	public JTextField tAlianza;
	public JTextField tAerolinea;
	public JTextField tNumeroFrec;
	public JTextField tCategoriaFrec;
	private JLabel lblNombre_10;
	private JLabel lblNombre_11;
	private JLabel lblNombre_12;
	private JLabel lblNombre_13;
	private JLabel lblNombre_14;
	private JLabel lblNombre_15;
	private JLabel lblNombre_16;
	private JLabel lblNombre_17;
	private JLabel lblProvincia;
	private JLabel lblOtro;
	private JLabel lblCodPostal;
	public JTextField tAutoridad;
	public JTextField tFechaEmic;
	public JTextField tFechaVen;
	public JTextField tCalle;
	public JTextField tAltura;
	public JTextField tCiudad;
	public JTextField provincia2;
	public JTextField tCodPostal;
	public JComboBox paisEmic;
	public JComboBox paisDir;
	public JComboBox provincias;

	/**
	 * @wbp.nonvisual location=40,694
	 */
	public final DateChooser dcFechaEmic = new DateChooser();
	/**
	 * @wbp.nonvisual location=180,694
	 */
	private final DateChooser dcFechaNac = new DateChooser();
	/**
	 * @wbp.nonvisual location=280,694
	 */
	private final DateChooser dcFechaVen = new DateChooser();

	public AltaClienteVista() throws IOException, SQLException {
		setBackground(Color.BLACK);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(Color.ORANGE);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setForeground(Color.ORANGE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.ORANGE);
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNumeroPasaporte = new JLabel("Numero Pasaporte:");
		lblNumeroPasaporte.setForeground(Color.ORANGE);
		lblNumeroPasaporte.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_1 = new JLabel("Cuit/Cuil:");
		lblNombre_1.setForeground(Color.ORANGE);
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_2 = new JLabel("Fecha Nacimiento: ");
		lblNombre_2.setForeground(Color.ORANGE);
		lblNombre_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_3 = new JLabel("Email: ");
		lblNombre_3.setForeground(Color.ORANGE);
		lblNombre_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_4 = new JLabel("Telefono Personal");
		lblNombre_4.setForeground(Color.ORANGE);
		lblNombre_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_5 = new JLabel("Telefono Celular");
		lblNombre_5.setForeground(Color.ORANGE);
		lblNombre_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_6 = new JLabel("Telefono Laboral");
		lblNombre_6.setForeground(Color.ORANGE);
		lblNombre_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_7 = new JLabel("Alianza Pasajero Frecuente");
		lblNombre_7.setForeground(Color.ORANGE);
		lblNombre_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_8 = new JLabel("Aerolinea:");
		lblNombre_8.setForeground(Color.ORANGE);
		lblNombre_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_9 = new JLabel("Numero P. Frecuente");
		lblNombre_9.setForeground(Color.ORANGE);
		lblNombre_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCategoriaPFrecuente = new JLabel("Categoria P. Frecuente");
		lblCategoriaPFrecuente.setForeground(Color.ORANGE);
		lblCategoriaPFrecuente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tNombre = new JTextField();
		tNombre.setColumns(10);
		
		tDni = new JTextField();
		tDni.setColumns(10);
		
		tNumeroPas = new JTextField();
		tNumeroPas.setColumns(10);
		
		tCuit = new JTextField();
		tCuit.setColumns(10);
		
		tFechaNac = new JTextField();
		dcFechaNac.setTextRefernce(tFechaNac);
		tFechaNac.setColumns(10);
		
		tEmail = new JTextField();
		tEmail.setColumns(10);
		
		tPersonal = new JTextField();
		tPersonal.setColumns(10);
		
		tCelular = new JTextField();
		tCelular.setColumns(10);
		
		tLaboral = new JTextField();
		tLaboral.setColumns(10);
		
		tAlianza = new JTextField();
		tAlianza.setColumns(10);
		
		tAerolinea = new JTextField();
		tAerolinea.setColumns(10);
		
		tNumeroFrec = new JTextField();
		tNumeroFrec.setColumns(10);
		
		tCategoriaFrec = new JTextField();
		tCategoriaFrec.setColumns(10);
		
		lblNombre_10 = new JLabel("Pais Emision:");
		lblNombre_10.setForeground(Color.ORANGE);
		lblNombre_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre_11 = new JLabel("Autoridad:");
		lblNombre_11.setForeground(Color.ORANGE);
		lblNombre_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre_12 = new JLabel("Fecha Emision");
		lblNombre_12.setForeground(Color.ORANGE);
		lblNombre_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre_13 = new JLabel("Vencimiento:");
		lblNombre_13.setForeground(Color.ORANGE);
		lblNombre_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre_14 = new JLabel("Calle:");
		lblNombre_14.setForeground(Color.ORANGE);
		lblNombre_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre_15 = new JLabel("Altura:");
		lblNombre_15.setForeground(Color.ORANGE);
		lblNombre_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre_16 = new JLabel("Ciudad:");
		lblNombre_16.setForeground(Color.ORANGE);
		lblNombre_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre_17 = new JLabel("Pais:");
		lblNombre_17.setForeground(Color.ORANGE);
		lblNombre_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblProvincia = new JLabel("Provincia:");
		lblProvincia.setForeground(Color.ORANGE);
		lblProvincia.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblOtro = new JLabel("Otro:");
		lblOtro.setForeground(Color.ORANGE);
		lblOtro.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblCodPostal = new JLabel("Cod. Postal:");
		lblCodPostal.setForeground(Color.ORANGE);
		lblCodPostal.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tAutoridad = new JTextField();
		tAutoridad.setColumns(10);
		
		tFechaEmic = new JTextField();
		dcFechaEmic.setTextRefernce(tFechaEmic);
		tFechaEmic.setColumns(10);
		
		tFechaVen = new JTextField();
		dcFechaVen.setTextRefernce(tFechaVen);
		tFechaVen.setColumns(10);
		
		tCalle = new JTextField();
		tCalle.setColumns(10);
		
		tAltura = new JTextField();
		tAltura.setColumns(10);
		
		tCiudad = new JTextField();
		tCiudad.setColumns(10);
		
		provincia2 = new JTextField();
		provincia2.setColumns(10);
		
		tCodPostal = new JTextField();
		tCodPostal.setColumns(10);
		
		paisEmic = new JComboBox(JCombobox());
		
		paisDir = new JComboBox(JCombobox());
		
		provincias = new JComboBox(JCombobox2());
		provincias.setEnabled(false);
		
		JButton btnFechaEmic = new JButton("...");
		dcFechaEmic.setButton(btnFechaEmic);
		
		JButton btnFechaEmic_1 = new JButton("...");
		dcFechaVen.setButton(btnFechaEmic_1);
		
		JButton btnFechaEmic_2 = new JButton("...");
		dcFechaNac.setButton(btnFechaEmic_2);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDni, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumeroPasaporte, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_4, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_5, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_7, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_9)
						.addComponent(lblCategoriaPFrecuente, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tCategoriaFrec, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
							.addGap(114))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tAlianza, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblOtro, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tLaboral, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblProvincia, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tCelular, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblNombre_17, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tPersonal, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblNombre_16, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tEmail, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblNombre_15, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tNumeroPas, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblNombre_12, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tDni, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblNombre_11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tNombre, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblNombre_10, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(tAerolinea, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
										.addComponent(tNumeroFrec, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
									.addGap(18)
									.addComponent(lblCodPostal, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addComponent(tFechaNac, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
											.addGap(18)
											.addComponent(btnFechaEmic_2))
										.addComponent(tCuit, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNombre_13, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNombre_14, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
							.addGap(10)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(paisDir, 0, 280, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(tFechaEmic, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(tFechaVen, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(tCalle, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(tAltura, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(tCiudad, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(provincia2, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(tCodPostal, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(paisEmic, 0, 280, Short.MAX_VALUE)
								.addComponent(tAutoridad, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(provincias, 0, 280, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFechaEmic_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFechaEmic))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_10, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(paisEmic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblDni, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_11, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tAutoridad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNumeroPasaporte, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tNumeroPas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_12, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tFechaEmic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFechaEmic))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_1, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tCuit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_13, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tFechaVen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFechaEmic_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_2, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(lblNombre_14, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tFechaNac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFechaEmic_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_3, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_15, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_4, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tPersonal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_16, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_5, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_17, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(paisDir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_6, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tLaboral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProvincia, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(provincias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_7, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tAlianza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblOtro, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(provincia2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_8, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tAerolinea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodPostal, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tCodPostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNombre_9, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
						.addComponent(tNumeroFrec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(lblCategoriaPFrecuente, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addComponent(tCategoriaFrec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEnviar))
					.addGap(7))
		);
		setLayout(groupLayout);
		
		
	}
	public void addListener(ActionListener al) {
		
		btnEnviar.addActionListener(al);
		
	}
	public void addListener2(ItemListener al) {
		
		paisDir.addItemListener(al);
		
	}
	
	
	public String[] JCombobox() throws IOException, SQLException {
		
			ClienteInterfaz cliInter = ClienteFactory.GetImplementation("MSSQL");
			ArrayList<String> al = new ArrayList<String>();
			al = cliInter.ListarPaises();
			String[] al2 = al.toArray(new String[al.size()]);
			return al2;
		
	}
	public String[] JCombobox2() throws IOException, SQLException {
		
		ClienteInterfaz cliInter = ClienteFactory.GetImplementation("MSSQL");
		ArrayList<String> al = new ArrayList<String>();
		al = cliInter.ListarProvincias();
		String[] al2 = al.toArray(new String[al.size()]);
		return al2;
	
}
}
