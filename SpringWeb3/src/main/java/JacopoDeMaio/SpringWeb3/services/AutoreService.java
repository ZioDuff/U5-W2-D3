package JacopoDeMaio.SpringWeb3.services;


import JacopoDeMaio.SpringWeb3.entities.Autore;
import JacopoDeMaio.SpringWeb3.exceptions.BadRequestException;
import JacopoDeMaio.SpringWeb3.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;


//    METODI

//    metodo getList
    public Page<Autore> getAutoreList(int page, int size, String sorteBy){
        if(size> 20) size = 20;
        Pageable pageable = PageRequest.of(page,size, Sort.by(sorteBy));
        return autoreRepository.findAll(pageable);
    }
//
//    metodo save autore
    public Autore saveAutore(Autore body){
        autoreRepository.findByEmail(body.getEmail()).ifPresent(
                autore -> {
                    throw new BadRequestException("Attenzione l'email: "+ body.getEmail() + " è gia in uso!");
                }
        );

        body.setAvatar("https://ui-avatars.com/api/?name="+ body.getNome()+ "+"+ body.getCognome());
        autoreRepository.save(body);
        return body;
    }
//
////    metodo GET singolo elemento
    public Autore findAutoreById(long autoreId){
        Autore found = null;
        for (Autore autore: this.autoreList){
            if (autore.getId()==autoreId) found=autore;
        }
        if (found==null) throw new NotFoundException(autoreId);
        else return found;
    }
//
////    metodo PATCH per le modifiche diverso da PUT
//    public Autore findAutoreByIdAndUpdate(long autoreId, Autore body){
//        Autore found = null;
//        for (Autore autore: this.autoreList){
//            if (autore.getId()==autoreId) {
//            found=autore;
//                found.setNome(body.getNome());
//                found.setCognome(body.getCognome());
//                found.setDataDiNascita(body.getDataDiNascita());
//            }
//        }
//        if (found==null) throw new NotFoundException(autoreId);
//        else return found;
//    }
//
////    metodo DELETE
//    public void findAutoreByIdAndDelete(long autoreId){
//        Iterator<Autore> iterator = autoreList.iterator();
//        while (iterator.hasNext()){
//            Autore current = iterator.next();
//            if (current.getId()== autoreId) iterator.remove();
//
//        }
//    }
}
