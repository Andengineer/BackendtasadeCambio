package pe.edu.upc.backendtasadecambio.serviceInterfaces;

import pe.edu.upc.backendtasadecambio.entities.Carteras;
import pe.edu.upc.backendtasadecambio.entities.Letrasdecambio;

import java.time.LocalDate;
import java.util.List;

public interface ILetrasdecambioService {
    //Create
    public void insert(Letrasdecambio letrasdecambio);
    //Read
    public List<Letrasdecambio> list();
    //Delete
    public void delete(int id);
    public List<Letrasdecambio> buscarfecha(LocalDate fecha);
    public void update(Letrasdecambio letrasdecambio);
}
