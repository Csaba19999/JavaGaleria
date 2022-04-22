/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author menesi.csaba
 */
public abstract class KiallitasiTargy {
    Date letrehozasiDatum;
    String keszito,cim;

    public KiallitasiTargy(String keszito, String cim) {
        this.letrehozasiDatum = new Date();
        this.keszito = keszito;
        this.cim = cim;
    }


    public KiallitasiTargy(Date letrehozasiDatum, String keszito, String cim) {
        datumEllenorzes(letrehozasiDatum);
        this.letrehozasiDatum = letrehozasiDatum;
        this.keszito = keszito;
        this.cim = cim;
    }
    
    
    public void datumEllenorzes(Date datum){
        Date maiDatum = new Date();
        if(datum.after(maiDatum)){
            try {
                throw new Exception("A dátum nagyobb mint a mai nap.");
            } catch (Exception ex) {
                Logger.getLogger(KiallitasiTargy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
