package pe.edu.upc.backendtasadecambio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backendtasadecambio.entities.Carteras;

public interface ICarteraReposiotory extends JpaRepository<Carteras, Integer> {
}
