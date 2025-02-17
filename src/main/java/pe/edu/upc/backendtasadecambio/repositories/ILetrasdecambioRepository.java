package pe.edu.upc.backendtasadecambio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.backendtasadecambio.entities.Letrasdecambio;

import java.time.LocalDate;
import java.util.List;

public interface ILetrasdecambioRepository extends JpaRepository<Letrasdecambio, Integer> {
    //Como programador quiero buscar a las letras de cambio por fecha para gestionarlos
    @Query("SELECT l FROM Letrasdecambio l WHERE l.fechav=:fecha")
    public List<Letrasdecambio> buscarfecha(LocalDate fecha);
}
