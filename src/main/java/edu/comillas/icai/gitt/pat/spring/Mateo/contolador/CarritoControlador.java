package edu.comillas.icai.gitt.pat.spring.Mateo.contolador;

import edu.comillas.icai.gitt.pat.spring.Mateo.modelo.Carrito;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CarritoControlador {
    private final Map<Integer, Carrito> carritos = new HashMap<>();

    @GetMapping("/api/carritos")
    public Collection<Carrito> getCarritos() {
        return carritos.values();
    }

    @PostMapping("/api/carritos")
    @ResponseStatus(HttpStatus.CREATED)
    public Carrito creaCarrito(@RequestBody Carrito carrito) {
        carritos.put(carrito.getIdCarrito(), carrito);
        return carrito;
    }


    @GetMapping("/api/carritos/{idCarrito}")
    public Carrito getCarrito(@PathVariable int idCarrito){
        return carritos.get(idCarrito);
    }

    @DeleteMapping("/api/carrito/{idCarrito}")
    public void borrarCarrito(@PathVariable int idCarrito){
        carritos.remove(idCarrito);
    }
}

