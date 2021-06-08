/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Arslan
 */

/*
Bir sporcu sınıfı oluşturun. Sınıf tanımı şunları içermelidir:
 Yapıcı (constuctor) metotları (parametreli ve parametresiz olarak en az iki) yazılacak.
Parametreler sporcuIsim ve sporcuTakim olmalı.
 Sporcuların kart puanını göstermek için sporcuPuaniGoster() metotu yazılmalıdır. 

 */
public class sporcu {
    
    private String sporcuIsim;
    private String sporcuTakim;    
    public sporcu(){
        
    }
    
   public sporcu(String sporcu_isim,String sporcu_takim){
        sporcuIsim=sporcu_isim;
        sporcuTakim=sporcu_takim;       
    }
   
   public int sporcuPuanGoster(int ozellik1,int ozellik2,int ozellik3){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ozellik1 ; 
       }
       if(secim==1){
         ozellik= ozellik2 ; 
       }
       if(secim==2){
         ozellik= ozellik3 ; 
       }
       System.out.println(ozellik);
     return ozellik;
   }
   

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }
 

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

   
    
    
}
