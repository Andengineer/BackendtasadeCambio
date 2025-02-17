package pe.edu.upc.backendtasadecambio.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendtasadecambio.dtos.LetrasdecambioDTO;
import pe.edu.upc.backendtasadecambio.entities.Letrasdecambio;
import pe.edu.upc.backendtasadecambio.serviceInterfaces.ILetrasdecambioService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/letrasdecambio")
public class LetrasdecambioController {
    @Autowired
    private ILetrasdecambioService lS;
    @GetMapping
    public List<LetrasdecambioDTO> listar() {
        return lS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LetrasdecambioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody LetrasdecambioDTO dto) {
        ModelMapper m=new ModelMapper();
        Letrasdecambio u=m.map(dto, Letrasdecambio.class);
        lS.insert(u);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        lS.delete(id);
    }
    @GetMapping("/lfechas/{fecha}")
    public List<LetrasdecambioDTO> listarLfechas(@PathVariable ("fecha")LocalDate fecha){
        return lS.buscarfecha(fecha).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LetrasdecambioDTO.class);
        }).collect(Collectors.toList());
    }
}
