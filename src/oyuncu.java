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
Bilgisayar ve kullanıcı olmak üzere oyunu oynayan iki oyuncu olacaktır. Bu iki oyuncunun
farklı ve aynı özellikleri olacaktır. Aynı özelliklerini temsil etmek için Oyuncu temel sınıfı
oluşturulacaktır.
Bu sınıfta bulunnması gereken özellikler ve fonksiyonlar:
 oyuncuID, oyuncuAdi ve Skor özellikleri olmalı.
 Yapıcı (constuctor) metotları (parametreli ve parametresiz olarak en az iki) yazılacak.
Parametreler oyuncuID, oyuncuAdi ve Skor olmalı.
 kartListes@Override
	i özelliği ile oyuncuların elinde bulunan kartlar listede tutulacaktır.
 SkorGoster() fonksiyonu ile oyuncuların skorları gösterilecektir.
 kartSec() fonksiyonu yazılmalı fakat bu sınıf bilgisayar ve kullanıcı için farklı durumlarda
çalışacağı unutulmamalıdır. 
*/
public  class oyuncu {
    
      
    public int oyuncuID;
    public String oyuncuAdi;
    public int scor;
    
  
   public  oyuncu(int oyuncuNo,String oyuncuIsim,int puan){
        oyuncuID=oyuncuNo;
        oyuncuAdi=oyuncuIsim;
        scor=puan;
    }
    
    
    public int getOyuncuID(){
        return oyuncuID;
    }
    
    public void setOyuncuID(int oyuncuID){
        this.oyuncuID=oyuncuID;
    }
    
    public String getOyuncuAdi(){
        return oyuncuAdi;
    }
    
    public void setOyuncuAdi(String oyuncuAdi){
        this.oyuncuAdi=oyuncuAdi;
    }
    
    public int getScor(){
        return scor;
    }
    
    public void setScor(int scor){
        this.scor=scor;
    }
 
    public void puanEkle() {
    	this.scor+=10;
    }
   
   
    
}