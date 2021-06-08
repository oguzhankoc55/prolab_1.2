/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 public class basketbolcu extends sporcu{
   public boolean kartKullanildimi;
   
    private int ikilik;
    private int ucluk;
    private String img;
    
    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getS_atis() {
        return s_atis;
    }

    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }
    private int s_atis;
    
    public basketbolcu(String sporcu_isim,String sporcu_takim,boolean kartKullanildimi, String img){
        super(sporcu_isim,sporcu_takim);
        this.kartKullanildimi=kartKullanildimi;
        
    }

    @Override
    public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
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
class Harden extends basketbolcu {
    private int ikilik=60;
    private int ucluk=95;
    private int s_atis=85;
    private String img="Harden.png";
   
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   
   @Override
    public int getIkilik() {
        return ikilik;
    }
@Override
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }
@Override
    public int getUcluk() {
        return ucluk;
    }
@Override
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }
@Override
    public int getS_atis() {
        return s_atis;
    }
@Override
    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }

    @Override
     public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
       }
     return ozellik;
   }
    
    
    public Harden(String sporcu_isim, String sporcu_takim,boolean kart_kullanýldýmý, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullanýldýmý,img);
	}
    
}
class Cury extends basketbolcu {
    private int ikilik=95;
    private int ucluk=80;
    private int s_atis=90;
    private String img="Cury.png";
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

   @Override
    public int getIkilik() {
        return ikilik;
    }
@Override
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }
@Override
    public int getUcluk() {
        return ucluk;
    }
@Override
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }
@Override
    public int getS_atis() {
        return s_atis;
    }
@Override
    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }
    @Override
    public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
       }
     return ozellik;
   }
    public Cury(String sporcu_isim, String sporcu_takim,boolean kart_kullanýldýmý, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullanýldýmý,img);
	}
    
}
class Lebron extends basketbolcu {
    private int ikilik=80;
    private int ucluk=85;
    private int s_atis=95;
    private String img="Lebron.png";
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

   @Override
    public int getIkilik() {
        return ikilik;
    }
@Override
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }
@Override
    public int getUcluk() {
        return ucluk;
    }
@Override
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }
@Override
    public int getS_atis() {
        return s_atis;
    }
@Override
    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }
    @Override
     public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
       }
     return ozellik;
   }
    public Lebron(String sporcu_isim, String sporcu_takim,boolean kart_kullanýldýmý, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullanýldýmý,img);
	}
    
}
class Durant extends basketbolcu {
    private int ikilik=75;
    private int ucluk=90;
    private int s_atis=60;
    private String img="Durant.png";
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

   @Override
    public int getIkilik() {
        return ikilik;
    }
@Override
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }
@Override
    public int getUcluk() {
        return ucluk;
    }
@Override
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }
@Override
    public int getS_atis() {
        return s_atis;
    }
@Override
    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }
   @Override
    public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
       }
     return ozellik;
   }
    public Durant(String sporcu_isim, String sporcu_takim,boolean kart_kullanýldýmý, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullanýldýmý,img);
	}
    
}
class Davis extends basketbolcu {
    private int ikilik=70;
    private int ucluk=75;
    private int s_atis=65;
    private String img="Davis.png";
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

   @Override
    public int getIkilik() {
        return ikilik;
    }
@Override
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }
@Override
    public int getUcluk() {
        return ucluk;
    }
@Override
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }
@Override
    public int getS_atis() {
        return s_atis;
    }
@Override
    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }
     @Override
    public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
       }
     return ozellik;
   }
    public Davis(String sporcu_isim, String sporcu_takim,boolean kart_kullanýldýmý, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullanýldýmý,img);
	}
    
}
class Wade extends basketbolcu {
    private int ikilik=65;
    private int ucluk=70;
    private int s_atis=75;
    private String img="Wade.png";
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

   @Override
    public int getIkilik() {
        return ikilik;
    }
@Override
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }
@Override
    public int getUcluk() {
        return ucluk;
    }
@Override
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }
@Override
    public int getS_atis() {
        return s_atis;
    }
@Override
    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }
    @Override
   public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
       }
     return ozellik;
   }
    public Wade(String sporcu_isim, String sporcu_takim,boolean kart_kullanýldýmý, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullanýldýmý,img);
	}
    
}
class Carmelo extends basketbolcu {
    private int ikilik=85;
    private int ucluk=65;
    private int s_atis=70;
    private String img="Carmelo.png";
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   

   @Override
    public int getIkilik() {
        return ikilik;
    }
@Override
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }
@Override
    public int getUcluk() {
        return ucluk;
    }
@Override
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }
@Override
    public int getS_atis() {
        return s_atis;
    }
@Override
    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }
    @Override
   public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
       }
     return ozellik;
   }
    public Carmelo(String sporcu_isim, String sporcu_takim,boolean kart_kullanýldýmý, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullanýldýmý,img);
	}
    
}
class Paul extends basketbolcu {
    private int ikilik=90;
    private int ucluk=60;
    private int s_atis=80;
    
    private String img="Paul.png";
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }
   
   @Override
    public int getIkilik() {
        return ikilik;
    }
@Override
    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }
@Override
    public int getUcluk() {
        return ucluk;
    }
@Override
    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }
@Override
    public int getS_atis() {
        return s_atis;
    }
@Override
    public void setS_atis(int s_atis) {
        this.s_atis = s_atis;
    }
    @Override
    public int sporcuPuanGoster(int ikilik,int ucluk,int s_atis){
       test nesne =new test();
       int secim=nesne.ozellikSec();
       int ozellik=5;
              
       if(secim==0){
        ozellik= ikilik ; 
       }
       if(secim==1){
         ozellik= ucluk ; 
       }
       if(secim==2){
         ozellik= s_atis ; 
       }
     return ozellik;
   }
    public Paul(String sporcu_isim, String sporcu_takim,boolean kart_kullanýldýmý, String img) {        
		super(sporcu_isim,sporcu_takim,kart_kullanýldýmý,img);
	}
    
}