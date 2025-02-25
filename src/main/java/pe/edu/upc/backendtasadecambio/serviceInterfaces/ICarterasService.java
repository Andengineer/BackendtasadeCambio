package pe.edu.upc.backendtasadecambio.serviceInterfaces;

import pe.edu.upc.backendtasadecambio.entities.Carteras;

import java.util.List;

public interface ICarterasService {
    //Create
    public void insert(Carteras carteras);
    //Update
    public void update(Carteras carteras);
    //Read
    public List<Carteras> list();
    //Delete
    public void delete(int id);
}
