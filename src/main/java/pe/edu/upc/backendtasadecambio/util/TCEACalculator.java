package pe.edu.upc.backendtasadecambio.util;
import java.util.List;

import org.hipparchus.analysis.UnivariateFunction;
import org.hipparchus.analysis.solvers.BrentSolver;
import pe.edu.upc.backendtasadecambio.entities.Letrasdecambio;

public class TCEACalculator {
    public double calcular(List<Letrasdecambio> letras) {
        UnivariateFunction f = tasa -> calcularFlujoTotal(letras, tasa);

        // Resolver la ecuación usando BrentSolver
        BrentSolver solver = new BrentSolver();
        return solver.solve(1000, f, 0.0, 1.0) * 100; // Convertir a porcentaje
    }

    private double calcularFlujoTotal(List<Letrasdecambio> letras, double tasa) {
        double flujoTotal = 0;

        for (Letrasdecambio letra : letras) {
            flujoTotal += letra.getMonto() / Math.pow(1 + tasa, letra.getDias_descontado() / 360.0);
        }

        return flujoTotal - letras.stream().mapToDouble(Letrasdecambio::getMonto_entregado).sum();
    }
}
