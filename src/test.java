/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





/**
 *
 * @author Arslan
 */

import java.util.ArrayList;
import java.util.Random;
/*
Futbolcu ve basketbolcuların isimleri ve özellikleri burada tanımlanmalıdır. Pozisyon bilgisi için bir
metot içermelidir.
Futbolcu seçimi yapılacağı zaman penaltı, serbest vuruş ve kaleciyle karşı karşıya pozisyonlarından;
basketbolcu seçimi yapılacağı zaman üçlük, ikilik ve serbest atış pozisyonlarından rastgele birinin
seçimi oyuncuların kart seçimi yapıldıktan sonra burada yapılmalıdır.
Futbolcu ve basketbolcuların özelliklerin ataması için getter ve setter metotları da, Constructor’da
kullanılabilmelidir.
Oyunun ilerleyişi buradan takip edilmelidir.
 */
public class test {
    
   static ArrayList<futbolcu> futbolcum = new ArrayList<futbolcu>();
   static ArrayList<basketbolcu> basketbolcum = new ArrayList<basketbolcu>();
   static ArrayList<futbolcu> kullaniciFutbolcuKart = new ArrayList<futbolcu>();
   static ArrayList<basketbolcu> kullaniciBasketbolcuKart = new ArrayList<basketbolcu>();
   static ArrayList<futbolcu> bilgisayarFutbolcuKart = new ArrayList<futbolcu>();
   static ArrayList<basketbolcu> bilgisayarBasketbolcuKart = new ArrayList<basketbolcu>();
   
   public void testim(){
        futbolcum.add(new Messi("Messi" ,"futbolcu",false,"Messi.png" ));
        futbolcum.add(new Ronaldo("Ronaldo","futbolcu",false,"Ronaldo.png"));
        futbolcum.add(new Neymar("Neymar","futbolcu",false,"Neymar.png"));
    	futbolcum.add(new Suarez("Suarez","futbolcu",false,"Suarez.png"));
    	futbolcum.add(new Salah("Salah","futbolcu",false,"Salah.png"));
    	futbolcum.add(new Mane("Mane","futbolcu",false,"Mane.png"));
    	futbolcum.add(new Lewandoski("Lewandoski","futbolcu",false,"Lewandoski.png"));
    	futbolcum.add(new Modric("Modric","futbolcu",false,"Modric.png"));
    	
        basketbolcum.add(new Harden("Harden","basketbolcu",false,"Harden.png"));
    	basketbolcum.add(new Cury("Cury","basketbolcu",false,"Cury.png"));            	
    	basketbolcum.add(new Lebron("Lebron","basketbolcu",false,"Lebron.png"));
    	basketbolcum.add(new Durant("Durant","basketbolcu",false,"Durant.png"));
    	basketbolcum.add(new Davis("Davis","basketbolcu",false,"Davis.png"));
    	basketbolcum.add(new Wade("Wade","basketbolcu",false,"Wade.png"));
    	basketbolcum.add(new Carmelo("Carmelo","basketbolcu",false,"Carmelo.png"));
    	basketbolcum.add(new Paul("Paul","basketbolcu",false,"Paul.png"));
    
        
      
      
    }
   
   
   public void karistir(){
       Random rand=new Random();
       
       
        for(int i=0; i<4; i++) {
            
    	    		int sayi = rand.nextInt(8);
                  
    		    if(futbolcum.get(sayi).kartKullanildimi==true) {
    		    	i--;
    		    	continue;
    		    }
    		    kullaniciFutbolcuKart.add(futbolcum.get(sayi));
    		    futbolcum.get(sayi).kartKullanildimi=true;					
    		}
    		
    		for(int i=0; i<4; i++) {	
    					
    				int sayi = rand.nextInt(8);
    		    
    		   
    		    if(futbolcum.get(sayi).kartKullanildimi==true) {
    		    	i--;
    		    	continue;
    		    }
    		    bilgisayarFutbolcuKart.add(futbolcum.get(sayi));
    		    futbolcum.get(sayi).kartKullanildimi=true;	
    		    
    		    
    		}
       
       
  
        for(int i=0; i<4; i++) {
            
    	    		int sayi = rand.nextInt(8);
                  
    		    if(basketbolcum.get(sayi).kartKullanildimi==true) {
    		    	i--;
    		    	continue;
    		    }
    		    kullaniciBasketbolcuKart.add(basketbolcum.get(sayi));
    		    basketbolcum.get(sayi).kartKullanildimi=true;					
    		}
    		
    		for(int i=0; i<4; i++) {	
    					
    				int sayi = rand.nextInt(8);
    		    
    		   
    		    if(basketbolcum.get(sayi).kartKullanildimi==true) {
    		    	i--;
    		    	continue;
    		    }
    		    bilgisayarBasketbolcuKart.add(basketbolcum.get(sayi));
    		    basketbolcum.get(sayi).kartKullanildimi=true;	
    		    
    		    
    		}
       
      
   
       
   }
   
   public int ozellikSec(){
       Random rand=new Random();
       int sayi;
         sayi=rand.nextInt(3);        
       return sayi;
   }
   
}
   