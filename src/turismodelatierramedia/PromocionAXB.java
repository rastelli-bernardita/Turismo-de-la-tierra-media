
public class PromocionAXB extends Promocion {
	protected double calcularCostoPromocion() {
		double costoPromocion = 0;
		for (int i = 1; i < super.atracciones.length() - 1; i++) {
			costoPromocion += super.atracciones[i].getCosto();
		}
		return costoPromocion;
	}
}