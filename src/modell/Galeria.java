/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author menesi.csaba
 */
public class Galeria extends KiallitasiTargy implements Iterable<KiallitasiTargy>, Comparable<KiallitasiTargy>{
    ArrayList<KiallitasiTargy> kialitasiTargyak = new ArrayList();

    public Galeria(String keszito, String cim) {
        super(keszito, cim);
    }

    public Galeria(Date letrehozasiDatum, String keszito, String cim) {
        super(letrehozasiDatum, keszito, cim);
    }
    
    
    public List<KiallitasiTargy> getFestmenyek() {
        List targyakLista = kialitasiTargyak;
        return targyakLista;
    }
    
    public void galeriabaFelvesz(KiallitasiTargy e){
        kialitasiTargyak.add(e);
    }
    public void galeriaBejarasa(){
        List lista = getFestmenyek();
        System.out.println("Rendezetlen :");
        lista.forEach((e) -> {
            System.out.println(e,"\n");
        });
        System.out.println("Rendezett");
        Collections.sort(lista));
    }
   

    @Override
    public Iterator<KiallitasiTargy> iterator() {
        return kialitasiTargyak.iterator();
    }

    @Override
    public int compareTo(KiallitasiTargy t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
