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
public class HastaneOtomasyonu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JGirisEkrani ekrani = new JGirisEkrani();
        ekrani.setVisible(true);
        initDoktor();
        
    }
    
    
    public static void changeFrame(javax.swing.JFrame frame1, javax.swing.JFrame frame2){
        frame1.setVisible(false);
        frame2.setVisible(true);
    }
    static void initDoktor(){
        Doktor a = new Doktor(0, "Burak", "KGB");
        Doktor a1 = new Doktor(1, "Burak1", "KGB");
        Doktor a2 = new Doktor(2, "Burak2", "KGB");
        Doktor a3 = new Doktor(3, "Burak3", "KGB");
        Departman.doktorEkle(a);
        Departman.doktorEkle(a1);
        Departman.doktorEkle(a2);
        Departman.doktorEkle(a3);
    }
    
}
