package turismodelatierramedia;

public class Usuario {
	private int tiempo;
	private double monedas;
	private String preferencia;
	private comprable[]sugerenciadiaria;
	private int horasnecesarias;
	private int monedasnecesarias;
	
	
	public int getTiempoDisponible() {
		return tiempo;
	}

	public void restarTiempo(int duracion) {
	    this.tiempo= tiempo - duracion;
	}
	
	public double getMonedasDisponibles() {
		return monedas;
	}

    public void restarMonedas(double precio) {
    this.monedas= monedas - precio;
    }

	public String getPreferencia() {
		return preferencia;
	}

	public String[] getSugerenciaDiaria() {
		return sugerenciadiaria;
	}
	
	public void imprimirItinerario() {
		System.out.println(this.horasnecesarias);
		System.out.println(this.monedasnecesarias);
		System.out.println(this.sugerenciadiaria);
		}
	
	public void guardarComprable() {}
	
}
