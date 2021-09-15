
public class PromocionPorcentual extends Promocion {
	protected double calcularCostoPromocion() {
		double costoPromocion = 0;
		for (int i = 1; i < super.atracciones.length(); i++) {
			costoPromocion += super.atracciones[i].getCosto();
			}
		costoPromocion -= costoPromocion * (super.valorPromocion / 100);
		return costoPromocion;
	}
}
