import java.util.Date;

public class Partit extends RAFElement{

	public Partit() {};
	
	public int getPunts_visitant() {
		return punts_visitant;
	}

	public void setPunts_visitant(int punts_visitant) {
		this.punts_visitant = punts_visitant;
	}

	public int getPunts_local() {
		return punts_local;
	}

	public void setPunts_local(int punts_local) {
		this.punts_local = punts_local;
	}

	public String getNom_arbitre() {
		return nom_arbitre;
	}

	public void setNom_arbitre(String nom_arbitre) {
		this.nom_arbitre = nom_arbitre;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Partit(int punts_visitant, int punts_local, String nom_arbitre, Date data) {
		super();
		
		if ((punts_visitant > 200) || punts_local > 200 || nom_arbitre.length() > 30 ){
			throw new IllegalArgumentException();
			
		} 
		
		this.punts_visitant = punts_visitant;
		this.punts_local = punts_local;
		this.nom_arbitre = nom_arbitre;
		this.data = data;
	}
	int punts_visitant;	// 1 byte = 8 bits, 2 byte = 16 bits, 3 byte = 24 , 3 char -> 3*4(UTF-32) = 12 byte
	int punts_local;	// 1 byte = 8 bits, 2 byte = 16 bits, 3 byte = 24 , 3 char -> 3*4(UTF-32) = 12 byte
	String nom_arbitre; // 4 bytes/caracter * 30 = 120 bytes
	Date data;          // 4 bytes/caracter * 6 caracter = 24 bytes (YYMMDD)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// 0.3 per fer 3 digits (004) + 0.3 per fer 3 digits (006) + 30 caracters + 6 (020518) = 42// 
		String data_string = String.format("%02d%02d%02d", data.getYear()%100, data.getMonth(), data.getDay());
		return String.format("%03d%03d%-30s%s", punts_visitant, punts_local, nom_arbitre, data_string);
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (3+3+30+6)*4;
	}

	@Override
	public void fromString(String string) {
		punts_visitant = Integer.parseInt(string.substring(0, 2));
		punts_local = Integer.parseInt(string.substring(3, 5));
		nom_arbitre = string.substring(6, 36);
		
		int year = ?;
		int month = ?;
		int day = ?;
		data = new Date(year,month,day)
	}
	
	
	
}
