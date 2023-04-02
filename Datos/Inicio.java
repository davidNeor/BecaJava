package Datos;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion.conectar();
		String sql="select * from employees";
		Conexion.consulta(sql);
		sql="update conver_job_id set id=300 where job_id='AC_ACCOUNT'";
		Conexion.cud(sql);
		sql="delete  from conver_job_id where id='124'";
		Conexion.cud(sql);
		sql="insert into conver_job_id (id,job_id) values('124','FOOTBAL_MANAGER')";
		Conexion.cud(sql);
	}

}
