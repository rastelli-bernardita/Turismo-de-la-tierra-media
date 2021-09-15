
public class PromocionAbsoluta extends Promocion {
		super.costoPromocion = super.valorPromocion;
		protected double calcularCostoPromocion() {
			return super.costoPromocion
		}
}