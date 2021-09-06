package turismodelatierramedia;

public class Atraccion implements comprable{
	private double costo;
	private String tipo;
	private int duracion;
	private int cupo;
    private int personas;
    
	public double getCosto() {
		return costo;
	}
	public String getTipo() {
		return tipo;
	}
	public int getDuracion() {
		return duracion;
	}
	public boolean getHayCupo() {
		return cupo <= (personas +1);
	}
	
	public void agregarPersona() {
			personas++;
	}
	
	
}
