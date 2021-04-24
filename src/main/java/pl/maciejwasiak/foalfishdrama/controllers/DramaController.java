package pl.maciejwasiak.foalfishdrama.controllers;

import org.springframework.web.bind.annotation.*;
import pl.maciejwasiak.foalfishdrama.entities.Drama;
import pl.maciejwasiak.foalfishdrama.services.DramaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin
public class DramaController {

    private DramaService dramaService;

    @Autowired
    public DramaController(DramaService dramaService) {
        this.dramaService = dramaService;
    }

    @RequestMapping(value = "/api/all", method = RequestMethod.GET)
    public List<Drama> getVehicles(){
        return dramaService.findAllDramas();
    }

    @RequestMapping(value = "/api/last", method = RequestMethod.GET)
    public Drama getDrama(){
        return dramaService.findLastDrama();
    }

    @RequestMapping(value = "/api/{id}", method = RequestMethod.GET)
    public Drama getDramaById(@PathVariable Long id){
        return dramaService.findDramaById(id);
    }

    @RequestMapping(value = "/api", method = RequestMethod.POST)
    public Drama saveDrama(@RequestBody Drama drama){
        return dramaService.saveDrama(drama);
    }


}
