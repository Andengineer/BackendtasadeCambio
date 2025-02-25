package pe.edu.upc.backendtasadecambio.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendtasadecambio.entities.Carteras;
import pe.edu.upc.backendtasadecambio.repositories.ICarteraReposiotory;
import pe.edu.upc.backendtasadecambio.serviceInterfaces.ICarterasService;

import java.util.List;

@Service
public class CarterasServiceImplement implements ICarterasService {
    @Autowired
    private ICarteraReposiotory cR;

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
}
