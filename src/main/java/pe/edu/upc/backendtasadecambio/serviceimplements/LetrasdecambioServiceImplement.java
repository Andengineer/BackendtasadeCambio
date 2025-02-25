package pe.edu.upc.backendtasadecambio.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendtasadecambio.entities.Letrasdecambio;
import pe.edu.upc.backendtasadecambio.repositories.ILetrasdecambioRepository;
import pe.edu.upc.backendtasadecambio.serviceInterfaces.ILetrasdecambioService;

import java.time.LocalDate;
import java.util.List;

@Service
public class LetrasdecambioServiceImplement implements ILetrasdecambioService {
    @Autowired
    private ILetrasdecambioRepository lR;
    @Override
    public void insert(Letrasdecambio letrasdecambio) {
        lR.save(letrasdecambio);
    }

    @Override
    public List<Letrasdecambio> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int id) {
        lR.deleteById(id);
    }

    @Override
    public List<Letrasdecambio> buscarfecha(LocalDate fecha) {
        return lR.buscarfecha(fecha);
    }

    @Override
    public void update(Letrasdecambio letrasdecambio) {
        lR.save(letrasdecambio);
    }
}
