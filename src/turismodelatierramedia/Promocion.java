package turismodelatierramedia;

public abstract class Promocion implements comprable{

	private String tipopromocion;
    private String[] atracciones;
    private double costopromocion;
	
    
    public Promocion(String tipopromocion, String[] atracciones, double costopromocion) {
		super();
		this.tipopromocion = tipopromocion;
		this.atracciones = atracciones;
		this.costopromocion = costopromocion;
	}

	public double getCostopromocion() {
		return costopromocion;
	}
	
    public String[] getAtracciones() {
		return atracciones;
	}
    
    public void calcularCostopromocion() {}

	public String getTipopromocion() {
		return tipopromocion;
	}
	
}
