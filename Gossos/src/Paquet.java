
public class Paquet {
	
	int id;
	double pes;
	double mida;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPes() {
		return pes;
	}
	public void setPes(double pes) {
		this.pes = pes;
	}
	public double getMida() {
		return mida;
	}
	public void setMida(double mida) {
		this.mida = mida;
	}
	public Paquet(int id, double pes, double mida) {
		super();
		this.id = id;
		this.pes = pes;
		this.mida = mida;
	}
	
	public void info() {
		System.out.printf("El identificador es: %d  amb un pes de %f i una mida de %f", id, pes, mida);
	}
}
