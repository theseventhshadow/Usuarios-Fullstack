package services;

import model.RedSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RedSocialRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RedSocialService {

    @Autowired
    private RedSocialRepository redSocialRepository;

    public List<RedSocial> obtenerTodasRedesSociales() {
        return redSocialRepository.findAll();
    }

    public RedSocial obtenerRedSocialPorId(Long id) {
        return redSocialRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Red Social no encontrada"));
    }

    public RedSocial crearRedSocial(RedSocial redSocial) {
        return redSocialRepository.save(redSocial);
    }

    public RedSocial actualizarRedSocial(Long id) {
        return redSocialRepository.save(actualizarRedSocial(id));
    }

    public void eliminarRedSocial(Long id) {
        redSocialRepository.deleteById(id);
    }
}
