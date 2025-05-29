import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FacturaElectricaTest {
    @ParameterizedTest
    @CsvSource({
        "500, 600, 5, 30, true, false, true, 113.48",
        "800, 300, 5, 30, false, true, false, 204.72",
        "60, 600, 13, 31, false, true, true, 52.96",
        "30, 10, 6, 15, false, false, false, 7.91",
        "40, 5, 5, 30, true, true, true, 8.68",
        "30, 10, 10, 7, true, false, false, 5.67"
    })

    void allTest(double energiaP1, double energiaP2, double potencia, int dias, boolean tieneBonoSocial, boolean tarifaVH, boolean canarias, double expected){
        assertEquals(expected, FacturaElectrica.calcularTotalFactura(energiaP1, energiaP2, potencia, dias, tieneBonoSocial, tarifaVH, canarias), 0.01);
    }
}
