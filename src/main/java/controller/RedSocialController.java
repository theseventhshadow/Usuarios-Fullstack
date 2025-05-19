package controller;
import model.RedSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.RedSocialService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/redSocial")
public class RedSocialController {

    private final RedSocialService redSocialService;

    public RedSocialController(RedSocialService redSocialService) {
        this.redSocialService = redSocialService;
    }


    @GetMapping("/all")
    public List<RedSocial> obtenerTodasRedesSociales() {
        return redSocialService.obtenerTodasRedesSociales();
    }

    @GetMapping("/{id}")
    public RedSocial obtenerRedSocialPorId(@PathVariable Long id) {
        return redSocialService.obtenerRedSocialPorId(id);
    }

    @PostMapping
    public RedSocial crearRedSocial(@RequestBody RedSocial redSocial) {
        return redSocialService.crearRedSocial(redSocial);
    }

    @PutMapping("/{id}")
    public RedSocial actualizarRedSocial(@PathVariable Long id, @RequestBody RedSocial redSocial) {
        return redSocialService.actualizarRedSocial(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarRedSocial(@PathVariable Long id) {
        redSocialService.eliminarRedSocial(id);
    }

}
