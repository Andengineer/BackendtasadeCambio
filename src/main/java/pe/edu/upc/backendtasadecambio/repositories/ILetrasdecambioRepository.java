package pe.edu.upc.backendtasadecambio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backendtasadecambio.entities.Letrasdecambio;

public interface ILetrasdecambioRepository extends JpaRepository<Letrasdecambio, Integer> {
}
