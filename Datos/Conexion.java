package Datos;

import java.awt.BorderLayout;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Conexion {
	
	private static Connection conn;
	private static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@curso2023.gestionproyectos.com:1521:xe";
	private final static String DATABASE ="";
	private final static String USUARIO ="DAA_hr";
	private final static String PASSWORD ="Curso2023";
	private final static String SQL_USE ="USE";
	private final static String SQL_CREATE ="CREATE DATABASE";
	
	public static void conectar()
	{
		try 
		{
			Class.forName(JDBC_DRIVER);
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Donde está tu driver Oracle?");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver JDBC Oracle Registrado");
		
		try 
		{
			conn=DriverManager.getConnection(URL+DATABASE,USUARIO,PASSWORD);
			
		}
		catch(SQLException e)
		{
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
		
		
	}
	
	public static void consulta(String cons)	
	{
		
		try {
			
			Statement stmt=conn.createStatement();
			ResultSet rset=stmt.executeQuery(cons);
			//esto es por si queremos saber la cantidad de columnas de un registro
			ResultSetMetaData rsmd=rset.getMetaData();			
			System.out.println("Id_emplead\tNombre         \tApellido\tEmail\tNumero_telefono\tFecha_contratacion\tDepartamento\tSalario");
			
			
			while(rset.next())
			{
				System.out.print("  "+rset.getInt(1)+"             ");
				System.out.print(rset.getString(2)+"      ");
				System.out.print(rset.getString(3)+"      ");
				System.out.print(rset.getString(4)+"      ");
				System.out.print(rset.getString(5)+"      ");
				System.out.print(rset.getDate(6)+"      ");
				System.out.print(rset.getString(7)+"      ");
				System.out.print(rset.getInt(8)+"      ");
				System.out.println("");



				
			}
			 
			
		}
		catch(SQLException e)
		{
			System.out.println("La excepcion es: "+e);
		}
		
		
		
	}
	
	//este método nos vale para hacer CUD(create,update, delete)
	
	public static void cud(String sql)
	{
		try {
			
			Statement stmt=conn.createStatement();
			int respuesta=stmt.executeUpdate(sql);
			System.out.println("Se han visto afectados "+respuesta+" registros");
			
			
			 
			
		}
		catch(SQLException e)
		{
			System.out.println("La excepcion es: "+e);
		}
		
	}
	
	
	
	
	/*trate de usar este método para crear un JTable, pero no fui capaz de usarlo
	 * 
	 * 
	private static void MuestraConsulta(ResultSet rs,ResultSetMetaData metadatos)
	{
		
		DefaultTableModel modelo=new DefaultTableModel();
		JTable tabla=new JTable(modelo);
		//con los metadatos podemos saber el número de columnas y el nombre de las mismas
		try {
			int columnas=metadatos.getColumnCount();
			//vamos a añadir a la tabla los nombres de los campos mediante etiquetas			
			Object[] etiquetas=new Object[columnas];
			for(int i=0;i<columnas;i++)
			{
				etiquetas[i]=metadatos.getColumnLabel(i+1);
				
			}
			modelo.setColumnIdentifiers(etiquetas);
			//recorremos el dataset
			while(rs.next())
			{
				//cremamos un array de objetos que contiene los resultados de cada fila
				Object [] fila=new Object[columnas];
				for(int j=0;j<columnas;j++)
				{
					fila[j]=rs.getObject(j+1);
				}
				modelo.addRow(fila);				
			}
			
			tabla.setLayout(new BorderLayout());
			
			JScrollPane scrollPane=new JScrollPane(tabla);
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			tabla.setFillsViewportHeight(true);
			tabla.setVisible(true);
			JFrame jfra=new JFrame();
			jfra.getContentPane().add(scrollPane,BorderLayout.NORTH);
			jfra.pack();
		}
		catch(SQLException e)
		{
			
			System.out.println("La excepcion es: "+e);
		}
		
		
		
		
	}
	*/




	

}
