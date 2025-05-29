public class FacturaElectricaDemo {

    public static double calcularTotalFactura(
            double energiaP1,
            double energiaP2,
            double potencia,
            int dias,
            boolean tieneBonoSocial,
            boolean tarifaVH,
            boolean canarias) {
        double total;
        double costeEP1;
        double costeEP2;
        double impuestoElectrico;
        double costePotencia;

        // Precio fijo de la potencia
        final double tarifaPotencia = 0.015; // Tarifa de potencia por kW y día

        // Término de energía
        if (tarifaVH) {
            // Tarifa Vehículo eléctrico 0.20 €/kWh para P1 (horas diurnas)
            costeEP1 = energiaP1 * 0.20;
            // Tarifa Vehículo eléctrico 0.05 €/kWh para P2 (horas nocturnas)
            costeEP2 = energiaP2 * 0.05;
        } else {
            // Tarifa normal 0.15 €/kWh para P1 (horas diurnas)
            costeEP1 = energiaP1 * 0.15;
            // Tarifa normal 0.10 €/kWh para P2 (horas nocturnas)
            costeEP2 = energiaP2 * 0.10;
        }
        // Término de potencia
        costePotencia = dias * potencia * tarifaPotencia;

        // Cálculo del total sin impuestos
        total = costeEP1 + costeEP2 + costePotencia;

        // Aplicación del bono social
        if (tieneBonoSocial) {
            total -= total * 0.25;
        }
        // Aplicación del impuesto eléctrico
        impuestoElectrico = total * 0.05;
        total += impuestoElectrico;

        // Aplicación del IVA
        if (canarias) {
            total += 0.05 * total;
        } else {
            total += 0.10 * total;
        }
        return total;
    }
}
