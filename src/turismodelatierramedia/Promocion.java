package turismodelatierramedia;

public class Promocion implements comprable{

	private String tipoPromocion;
    private String[] atracciones;
    private double costoPromocion;
    private double valorPromocion;
	private clasePromocion clasePromocion;
    
    public Promocion(String tipoPromocion, String[] atracciones, clasePromocion clasePromocion, double valor) {
		super();
		this.tipoPromocion = tipoPromocion;
		this.atracciones[] = atracciones;
		this.costoPromocion = this.calcularCostoPromocion();
		this.valorPromocion = valor;
	}

	public double getCosto() {
		return this.costoPromocion;
	}
	
	abstract calcularCostoPromocion() {}
	
    public String getAtracciones() {
		return this.atracciones;
	}
    
	public String getTipo() {
		return this.tipoPromocion;
	}

	@Override
	public int getTiempo() {
		int tiempo = 0;
		for (int i = 1; i < this.atracciones.length(); i++) {
			tiempo += this.atracciones[i].getTiempo();
		}
		return tiempo;
	}

	@Override
	public boolean hayCupo() {
		boolean cupo = true;
		for (int i = 1; i < this.atracciones.length(); i++) {
			if (!this.atracciones[i].hayCupo()) {
				cupo = false;
			}
		}
		return cupo;
	}

	@Override
	public boolean esOContiene() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
