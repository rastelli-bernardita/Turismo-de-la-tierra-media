package turismodelatierramedia;

public class Promocion implements comprable{

	private String tipopromocion;
    private String atracciones;
    private double costopromocion;
	
    
    public Promocion(String tipopromocion, String atracciones, double costopromocion) {
		super();
		this.tipopromocion = tipopromocion;
		this.atracciones = atracciones;
		this.costopromocion = costopromocion;
	}

	public double getCosto() {
		return costopromocion;
	}
	
    public String getAtracciones() {
		return atracciones;
	}
    
    public void calcularCostopromocion() {}

	public String getTipo() {
		return tipopromocion;
	}

	@Override
	public int getTiempo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hayCupo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esOContiene() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
