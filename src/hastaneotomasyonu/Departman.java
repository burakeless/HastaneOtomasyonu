/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneotomasyonu;

import java.util.ArrayList;

/**
 *
 * @author burak
 */
public class Departman {
    private static ArrayList<Doktor> doktorlar = new ArrayList();
    
    public static void doktorEkle(Doktor d){
        doktorlar.add(d);
    }
    public static ArrayList<Doktor> getDoktorlar(){
        return doktorlar;
    }
    
}
