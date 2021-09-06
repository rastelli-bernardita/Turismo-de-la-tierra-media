package turismodelatierramedia;

public abstract class Promocion implements comprable{

	private String tipopromocion;
    private String[] atracciones;
    private double costopromocion;
	
    public double getCostopromocion() {
		return costopromocion;
	}
	
    public String[] getAtracciones() {
		return atracciones;
	}
    
    public void calcularCostopromocion() {}
	
}
