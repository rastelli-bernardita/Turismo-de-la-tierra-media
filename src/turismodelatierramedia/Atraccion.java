package turismodelatierramedia;

public class Atraccion implements comprable{
	private double costo;
	private String tipo;
	private int duracion;
	private int cupo;
	private String nombre;
    private int personas;
    
	public Atraccion(String nombre, double costo, int duracion, int cupo, String tipo) {
		super();
		this.nombre = nombre;
		this.costo = costo;
		this.tipo = tipo;
		this.duracion = duracion;
		this.cupo = cupo;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getTiempo() {
		return this.duracion;
	}
	
	public boolean hayCupo() {
		return this.cupo <= (this.personas +1);
	}
	
	public void agregarPersona() {
		if(this.hayCupo()) {
			this.personas++;
			}
		else {
			
		}
	}

	@Override
	public boolean esOContiene() {
		// TODO Auto-generated method stub
		return false;
	}


	
	
}
