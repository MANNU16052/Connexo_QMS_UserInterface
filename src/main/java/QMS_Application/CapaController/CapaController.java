package QMS_Application.CapaController;



import QMS_Application.CapaDtos.CapaRequest;
import QMS_Application.CapaEntity.EntityMain;
import QMS_Application.CapaRepository.EntityMainRepo;
import QMS_Application.CapaService.CapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http:localhost:5173")
@RestController
@RequestMapping("/capa/api")
public class CapaController {

    @Autowired
    private EntityMainRepo entityMainrepo;
    @Autowired
    private CapaService capaservice;


    @PostMapping("/create")
    public EntityMain createEntityMain(@RequestBody CapaRequest capaRequest){
        return entityMainrepo.save(capaRequest.getEntityMain());
    }


    @GetMapping("/findAllDivision")
    public List<EntityMain> findAllDivision(){

        return entityMainrepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public EntityMain getEntityMainById(@PathVariable Long id) {

        return capaservice.getEntityMainById(id);
    }

    @PutMapping("/update/{id}")
    public EntityMain updateEntityMain(@PathVariable long id,@RequestBody EntityMain entityMain){
        return capaservice.updateEntityMain(id,entityMain);
    }

}
