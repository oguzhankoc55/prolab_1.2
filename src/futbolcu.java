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
Futbolcuların her biri birer sınıf olarak tanımlanacaktır. Sınıflar şu tanımlamaları içermelidir:
 Sporcu sınıfından kalıtım alacaktır.
 Yapıcı (constuctor) metotları (parametreli ve parametresiz olarak en az iki) yazılacak.
Futbolcu sınıfında bulunan futbolcuAdi ve futbolcuTakim özelliklerine atama yapmak için
super() kullanılacaktır.
 Bu sınıfın penaltı, serbestAtis ve kaleciKarsiKarsiya özellikleri olmalıdır.
 sporcuPuaniGoster() metotu override edilerek her bir futbolcu kartı için özelleştirilecektir.
 boolean veri tipinde kartKullanildiMi bilgisi tutulmalıdır. 
 */
 public class futbolcu extends sporcu{

    static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int penalti;
    private int frikik;
    private int k_karsiya;
    public boolean kartKullanildimi;
    private String img;
    
    
    public futbolcu(String sporcu_isim,String sporcu_takim,boolean kartKullanildimi, String img){
        super(sporcu_isim,sporcu_takim);
        this.kartKullanildimi=kartKullanildimi;
       
    }
    
   
     public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getFrikik() {
        return frikik;
    }

    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }

    public int getK_karsiya() {
        return k_karsiya;
    }

    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
    
    @Override
    public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
   
    
}

class Messi extends futbolcu {
    private int penalti=95;
    private int frikik=80;
    private int k_karsiya=90;
    private String img="Messi.png";

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

       @Override
    public int getPenalti() {
        return penalti;
    }
    @Override
    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }
    @Override
    public int getFrikik() {
        return frikik;
    }
    @Override
    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }
    @Override
    public int getK_karsiya() {
        return k_karsiya;
    }
    @Override
    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
     @Override
    public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }
    public Messi(String sporcu_isim, String sporcu_takim,boolean kart_kullan�ld�m�, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullan�ld�m�,img);
	}
    
}
class Ronaldo extends futbolcu {
    private int penalti=80;
    private int frikik=85;
    private int k_karsiya=95;
    
   private String img="Ronaldo.png";

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }

       @Override
    public int getPenalti() {
        return penalti;
    }
    @Override
    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }
    @Override
    public int getFrikik() {
        return frikik;
    }
    @Override
    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }
    @Override
    public int getK_karsiya() {
        return k_karsiya;
    }
    @Override
    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
     @Override
    public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }
    public Ronaldo(String sporcu_isim, String sporcu_takim,boolean kart_kullan�ld�m�, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullan�ld�m�,img);
	}
    
}
class Neymar extends futbolcu {
    private int penalti=75;
    private int frikik=90;
    private int k_karsiya=60;
    private String img="Neymar.png";

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

    @Override
    public int getPenalti() {
        return penalti;
    }
    @Override
    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }
    @Override
    public int getFrikik() {
        return frikik;
    }
    @Override
    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }
    @Override
    public int getK_karsiya() {
        return k_karsiya;
    }
    @Override
    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
    @Override
    public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }
    public Neymar(String sporcu_isim, String sporcu_takim,boolean kart_kullan�ld�m�, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullan�ld�m�,img);
	}
    
}
class Suarez extends futbolcu {
    private int penalti=60;
    private int frikik=75;
    private int k_karsiya=85;
    private String img="Suarez.png";

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

       @Override
    public int getPenalti() {
        return penalti;
    }
    @Override
    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }
    @Override
    public int getFrikik() {
        return frikik;
    }
    @Override
    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }
    @Override
    public int getK_karsiya() {
        return k_karsiya;
    }
    @Override
    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
    @Override
    public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }
    public Suarez(String sporcu_isim, String sporcu_takim,boolean kart_kullan�ld�m�, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullan�ld�m�,img);
	}
    
}
class Salah extends futbolcu {
    private int penalti=70;
    private int frikik=95;
    private int k_karsiya=65;
    private String img="Salah.png";

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

       @Override
    public int getPenalti() {
        return penalti;
    }
    @Override
    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }
    @Override
    public int getFrikik() {
        return frikik;
    }
    @Override
    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }
    @Override
    public int getK_karsiya() {
        return k_karsiya;
    }
    @Override
    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
    @Override
    public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }
    public Salah(String sporcu_isim, String sporcu_takim,boolean kart_kullan�ld�m�, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullan�ld�m�,img);
	}
    
}
class Mane extends futbolcu {
    private int penalti=65;
    private int frikik=70;
    private int k_karsiya=75;
    private String img="Mane.png";

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

       @Override
    public int getPenalti() {
        return penalti;
    }
    @Override
    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }
    @Override
    public int getFrikik() {
        return frikik;
    }
    @Override
    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }
    @Override
    public int getK_karsiya() {
        return k_karsiya;
    }
    @Override
    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
    @Override
    public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }
    public Mane(String sporcu_isim, String sporcu_takim,boolean kart_kullan�ld�m�, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullan�ld�m�,img);
	}
    
}
class Lewandoski extends futbolcu {
    private int penalti=85;
    private int frikik=65;
    private int k_karsiya=70;
    private String img="Lewandoski.png";

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

    @Override 
    public int getPenalti() {
        return penalti;
    }
    @Override
    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }
    @Override
    public int getFrikik() {
        return frikik;
    }
    @Override
    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }
    @Override
    public int getK_karsiya() {
        return k_karsiya;
    }
    @Override
    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
    @Override
     public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }
    public Lewandoski(String sporcu_isim, String sporcu_takim,boolean kart_kullan�ld�m�, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullan�ld�m�,img);
	}
    
}
class Modric extends futbolcu {
    private int penalti=90;
    private int frikik=60;
    private int k_karsiya=80;
    
   private String img="Modric.png";

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }

   @Override
    public int getPenalti() {
        return penalti;
    }
    @Override
    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }
    @Override
    public int getFrikik() {
        return frikik;
    }
    
    @Override
    public void setFrikik(int frikik) {
        this.frikik = frikik;
    }
    @Override
    public int getK_karsiya() {
        return k_karsiya;
    }
    @Override
    public void setK_karsiya(int k_karsiya) {
        this.k_karsiya = k_karsiya;
    }
    @Override
    public int sporcuPuanGoster(int penalti,int frikik,int k_karsiya){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= penalti ; 
       }
       if(secim==1){
         ozellik= frikik ; 
       }
       if(secim==2){
         ozellik= k_karsiya ; 
       }
     return ozellik;
   }
    public Modric(String sporcu_isim, String sporcu_takim,boolean kart_kullan�ld�m�, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullan�ld�m�,img);
	}

    
}

    

    
