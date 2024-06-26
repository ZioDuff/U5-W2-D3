package JacopoDeMaio.SpringWeb3.controller;


import JacopoDeMaio.SpringWeb3.entities.Autore;
import JacopoDeMaio.SpringWeb3.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

//    METODI

//    @GetMapping // <-- GET di tutta la lista
//    public List<Autore> getAutoreList(){
//        return  autoreService.getAutoreList();
//    }
//
//    @PostMapping
//    public Autore saveAutore(@RequestBody Autore body){
//        return autoreService.saveAutore(body);
//    }
//
//    @GetMapping("/{autoreId}")
//    public Autore findAutoreById(@PathVariable long autoreId){
//        return autoreService.findAutoreById(autoreId);
//    }
//
//    @PatchMapping("/{autoreId}")
//    public Autore findAutoreByIdAndUpdate(@PathVariable long autoreId,@RequestBody Autore body){
//        return autoreService.findAutoreByIdAndUpdate(autoreId,body);
//    }
//
//    @DeleteMapping("/{autoreId}")
//    public void findAutoreByIdAndDelete(@PathVariable long autoreId){
//        autoreService.findAutoreByIdAndDelete(autoreId);
//    }

}
