package Dao;



public class OnpeDao {
	Db.DB db = new Db.DB("sql5108.site4now.net", "db_a952ba_onpe_admin", "onpe1234", "db_a952ba_onpe");
	
	
	public Object getVotos(int inicio, int fin) {
		db.Sentencia( String.format( "usp_getVotos %s,%s", inicio, fin ) );
		return db.getRegistros();
	}

	public Object getVotosDepartamento(String id) {
		db.Sentencia( String.format( "usp_getVotosDepartamento '%s'", id ) );
		return db.getRegistros();
	}
	
	public Object getVotosProvincia(String id) {
		db.Sentencia( String.format( "usp_getVotosProvincia '%s'", id ) );
		return db.getRegistros();
	}
	
	public Object getGrupoVotacion(String id) {
		db.Sentencia( String.format( "usp_getGrupoVotacion '%s'", id ) );
		return db.getRegistro();
	}

	public Object getDepartamentos(int inicio, int fin) {
		db.Sentencia( String.format( "usp_getDepartamentos %s,%s", inicio,fin ) );
		return db.getRegistros();
		
	}
	public Object getProvincias(String idDepartamento) {
		db.Sentencia("usp_getProvincias " +idDepartamento);
		return db.getRegistros();
		
	}
	public Object getDistritos(String idProvincia) {
		db.Sentencia("usp_getDistritos " +idProvincia);
		return db.getRegistros();
		
	}
	public Object getLocalesVotacion(String idDistrito) {
		db.Sentencia("usp_getLocalesVotacion " +idDistrito);
		return db.getRegistros();
		
	}
	public Object getGruposVotacion(String idLocalVotacion) {
		db.Sentencia("usp_getGruposVotacion " +idLocalVotacion);
		return db.getColumna();
		
	}
	public Object getResumenGeneralCanova(){
		db.Sentencia("sp_getResumen_CanovaLuna ");
		return db.getRegistro();
	}

}
