package pe.edu.upc.backendtasadecambio.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendtasadecambio.entities.Carteras;
import pe.edu.upc.backendtasadecambio.entities.Letrasdecambio;
import pe.edu.upc.backendtasadecambio.repositories.ICarteraReposiotory;
import pe.edu.upc.backendtasadecambio.repositories.ILetrasdecambioRepository;
import pe.edu.upc.backendtasadecambio.serviceInterfaces.ICarterasService;
import pe.edu.upc.backendtasadecambio.util.TCEACalculator;

import java.util.List;

@Service
public class CarterasServiceImplement implements ICarterasService {
    @Autowired
    private ICarteraReposiotory cR;
    @Autowired
    private ILetrasdecambioRepository lR;

    @Override
    public void insert(Carteras carteras) {
        cR.save(carteras);
    }

    @Override
    public void update(Carteras carteras) {
        cR.save(carteras);
    }

    @Override
    public List<Carteras> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public void calcularTCEA(int id_cartera) {
        List<Letrasdecambio> letras = lR.findByCartera_IdCartera(id_cartera);

        if (letras.isEmpty()) {
            throw new RuntimeException("No hay letras en esta cartera.");
        }

        // Calcular la TCEA total
        double tceaTotal = calcularTCEACartera(letras);

        // Actualizar la cartera con la TCEA calculada
        Carteras cartera = cR.findById(id_cartera)
                .orElseThrow(() -> new RuntimeException("Cartera no encontrada"));

        cartera.setTcea((float) tceaTotal);
        cR.save(cartera);
    }

    private double calcularTCEACartera(List<Letrasdecambio> letras) {
        // Resolver la ecuación de flujos de efectivo usando un método numérico
        return new TCEACalculator().calcular(letras);
    }
}
