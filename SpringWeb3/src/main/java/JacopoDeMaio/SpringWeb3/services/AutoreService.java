package JacopoDeMaio.SpringWeb3.services;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {


//    METODI

//    metodo getList
//    public List<Autore> getAutoreList(){
//        return autoreList;
//    }
//
////    metodo save autore
//    public Autore saveAutore(Autore body){
//        Random rndm = new Random();
//        body.setId(rndm.nextInt(1,1000));
//        body.setAvatar("https://ui-avatars.com/api/?name="+ body.getNome()+ "+"+ body.getCognome());
//        autoreList.add(body);
//        return body;
//    }
//
////    metodo GET singolo elemento
//    public Autore findAutoreById(long autoreId){
//        Autore found = null;
//        for (Autore autore: this.autoreList){
//            if (autore.getId()==autoreId) found=autore;
//        }
//        if (found==null) throw new NotFoundException(autoreId);
//        else return found;
//    }
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
