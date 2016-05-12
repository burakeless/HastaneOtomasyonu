/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneotomasyonu;

/**
 *
 * @author burak
 */
public class Personel extends User{
    int id;
    String name;
    String departman;

    public Personel() {
    }
 
    
    public Personel(int id, String name, String departman) {
        this.id = id;
        this.name = name;
        this.departman = departman;
    }
    
    public Personel(int id, String adisoyad) {
        super(id, adisoyad);
    }
    
}
