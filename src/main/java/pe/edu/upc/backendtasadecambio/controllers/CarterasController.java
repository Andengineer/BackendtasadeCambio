package pe.edu.upc.backendtasadecambio.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendtasadecambio.dtos.CarterasDTO;
import pe.edu.upc.backendtasadecambio.entities.Carteras;
import pe.edu.upc.backendtasadecambio.serviceInterfaces.ICarterasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carteras")
public class CarterasController {
    @Autowired
    private ICarterasService cS;
    @GetMapping
    public List<CarterasDTO> listar() {
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CarterasDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody CarterasDTO dto) {
        ModelMapper m=new ModelMapper();
        Carteras u=m.map(dto, Carteras.class);
        cS.insert(u);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @PutMapping
    public void update(@RequestBody CarterasDTO dto){
        ModelMapper m = new ModelMapper();
        Carteras ro=m.map(dto,Carteras.class);
        cS.update(ro);
    }
    @PostMapping("/{id}/calcular-tcea")
    public ResponseEntity<String> calcularTCEA(@PathVariable int id) {
        cS.calcularTCEA(id);
        return ResponseEntity.ok("TCEA calculada y guardada en la base de datos.");
    }
}
