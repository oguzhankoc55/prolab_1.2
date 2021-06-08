/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/*Oyuncu sınıfından kalıtım alacaktır.
 Yapıcı (constuctor) metotları (parametreli ve parametresiz olarak en az iki) yazılacak. Oyuncu
sınıfında bulunan oyuncuID, oyuncuAdi ve Skor özelliklerine atama yapmak için super()
kullanılacaktır.
 Oyuncu sınıfında bulunan kartSec() metotu override edilecektir. Bilgisayar random olarak
aldığı kartlar arasından yine random kart seçerek ortaya koyacaktır.

 */
public  class bilgisayar extends oyuncu{
    
      
    public bilgisayar(int oyuncuNo,String oyuncuIsim,int puan){     
        super(oyuncuNo,oyuncuIsim,puan);
    }
    
    
    @Override
    public int getOyuncuID(){
        return oyuncuID;
    }
    @Override
    public void setOyuncuID(int oyuncuID){
        this.oyuncuID=oyuncuID;
    }
    @Override
    public String getOyuncuAdi(){
        return oyuncuAdi;
    }
    @Override
    public void setOyuncuAdi(String oyuncuAdi){
        this.oyuncuAdi=oyuncuAdi;
    }
    @Override
    public int getScor(){
        return scor;
    }
    @Override
    public void setScor(int scor){
        this.scor=scor;
    }
    @Override
    public void puanEkle() {
    	this.scor+=10;
    }
    
    
}
