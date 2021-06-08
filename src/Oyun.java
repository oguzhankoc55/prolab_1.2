import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextPane;
import java.awt.Font;
public class Oyun extends JFrame {
	
	
	test testim=new test();
	bilgisayar pc=new bilgisayar(0,"compiter", 0);
	kullanýcý person=new kullanýcý(1,"person", 0);
	int sayac=0;
	int person_sonskor;
	int pc_sonskor;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Oyun frame = new Oyun();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Oyun() {
		
		
        testim.testim();
        testim.karistir();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Kullanicifutbol_1 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciFutbolcuKart.get(1).getImg())));
		Kullanicifutbol_1.setBounds(127, 550, 100, 180);
		contentPane.add(Kullanicifutbol_1);
		
		JButton Kullanicifutbol_2 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciFutbolcuKart.get(2).getImg())));
		Kullanicifutbol_2.setBounds(252, 550, 100, 180);
		contentPane.add(Kullanicifutbol_2);
		
		JButton Kullanicifutbol_3 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciFutbolcuKart.get(3).getImg())));
		Kullanicifutbol_3.setBounds(376, 550, 100, 180);
		contentPane.add(Kullanicifutbol_3);
		
		JButton Kullanicifutbol_0 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciFutbolcuKart.get(0).getImg())));
		Kullanicifutbol_0.setBounds(10, 550, 100, 180);
		contentPane.add(Kullanicifutbol_0);
		
		JButton Bilgisayarfutbol_0 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
		Bilgisayarfutbol_0.setVisible(true);
		Bilgisayarfutbol_0.setBounds(81, 11, 100, 180);
		contentPane.add(Bilgisayarfutbol_0);
		
		JButton Bilgisayarfutbol_1 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
		Bilgisayarfutbol_1.setVisible(true);
		Bilgisayarfutbol_1.setBounds(127, 11, 100, 180);
		contentPane.add(Bilgisayarfutbol_1);
		
		JButton Bilgisayarfutbol_2 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
		Bilgisayarfutbol_2.setVisible(true);
		Bilgisayarfutbol_2.setBounds(191, 11, 100, 180);
		contentPane.add(Bilgisayarfutbol_2);
		
		JButton Bilgisayarfutbol_3 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
		Bilgisayarfutbol_3.setVisible(true);
		Bilgisayarfutbol_3.setBounds(252, 11, 100, 180);
		contentPane.add(Bilgisayarfutbol_3);
		
		JButton Kullanicibasketbol_0 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(0).getImg())));
		Kullanicibasketbol_0.setBounds(517, 550, 100, 180);
		Kullanicibasketbol_0.setEnabled(false);
		contentPane.add(Kullanicibasketbol_0);
		
		JButton Kullanicibasketbol_1 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(1).getImg())));
		Kullanicibasketbol_1.setBounds(633, 550, 100, 180);
		Kullanicibasketbol_1.setEnabled(false);
		contentPane.add(Kullanicibasketbol_1);
		
		JButton Kullanicibasketbol_2 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(2).getImg())));
		Kullanicibasketbol_2.setBounds(765, 550, 100, 180);
		Kullanicibasketbol_2.setEnabled(false);
		contentPane.add(Kullanicibasketbol_2);
		
		JButton Kullanicibasketbol_3 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(3).getImg())));
		Kullanicibasketbol_3.setBounds(885, 550, 100, 180);
		Kullanicibasketbol_3.setEnabled(false);
		contentPane.add(Kullanicibasketbol_3);
		
		JButton Bilgisayarbasketbol_0 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
		Bilgisayarbasketbol_0.setVisible(true);
		Bilgisayarbasketbol_0.setBounds(593, 11, 100, 180);
		contentPane.add(Bilgisayarbasketbol_0);
		
		JButton Bilgisayarbasketbol_1 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
		Bilgisayarbasketbol_1.setVisible(true);
		
			
		Bilgisayarbasketbol_1.setBounds(636, 11, 100, 180);
		contentPane.add(Bilgisayarbasketbol_1);
		
		JButton Bilgisayarbasketbol_2 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
		Bilgisayarbasketbol_2.setVisible(true);
		Bilgisayarbasketbol_2.setBounds(703, 11, 100, 180);
		contentPane.add(Bilgisayarbasketbol_2);
		
		JButton Bilgisayarbasketbol_3 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
		Bilgisayarbasketbol_3.setVisible(true);
		Bilgisayarbasketbol_3.setBounds(765, 11, 100, 180);
		contentPane.add(Bilgisayarbasketbol_3);
		
		JButton Kullanicibasketbol_3_1 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
	
		Kullanicibasketbol_3_1.setBounds(1041, 550, 100, 180);
		contentPane.add(Kullanicibasketbol_3_1);
		
		JButton Bilgisayarbasketbol_3_1 = new JButton(new ImageIcon(getClass().getResource("Kart_Arka.png")));
	
		Bilgisayarbasketbol_3_1.setBounds(1041, 11, 100, 180);
		contentPane.add(Bilgisayarbasketbol_3_1);
		
		
		JTextPane Pc_tablo = new JTextPane();
		Pc_tablo.setEditable(false);
		Pc_tablo.setText("Bilgisayar Skor");
		Pc_tablo.setBounds(1220, 84, 100, 50);
		contentPane.add(Pc_tablo);
		
		JTextPane OyuncununSkoru = new JTextPane();
		OyuncununSkoru.setEditable(false);
		
		OyuncununSkoru.setText(""+person.getScor());
		OyuncununSkoru.setBounds(1220, 588, 100, 50);
		contentPane.add(OyuncununSkoru);
		
		JTextPane BilgisayarinSkoru = new JTextPane();
		BilgisayarinSkoru.setEditable(false);
		BilgisayarinSkoru.setText(""+pc.getScor());
		BilgisayarinSkoru.setBounds(1220, 209, 100, 50);
		contentPane.add(BilgisayarinSkoru);
		
		JTextPane Oyuncu_tablo = new JTextPane();
		Oyuncu_tablo.setText("Oyuncu Skor");
		Oyuncu_tablo.setEditable(false);
		Oyuncu_tablo.setBounds(1220, 438, 100, 50);
		contentPane.add(Oyuncu_tablo);
		
		JTextPane txtpnSeilenzellik = new JTextPane();
		txtpnSeilenzellik.setEditable(false);
		txtpnSeilenzellik.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnSeilenzellik.setText("Secilen Ozellik:");
		txtpnSeilenzellik.setBounds(992, 205, 207, 71);
		contentPane.add(txtpnSeilenzellik);
		
		JTextPane txtpnFutbocuSeiniz = new JTextPane();
		txtpnFutbocuSeiniz.setEditable(false);
		txtpnFutbocuSeiniz.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnFutbocuSeiniz.setText("Futbolcu Seciniz");
		txtpnFutbocuSeiniz.setBounds(399, 352, 294, 80);
		contentPane.add(txtpnFutbocuSeiniz);
		
		JTextPane txtpnSeilenzellik_1 = new JTextPane();
		txtpnSeilenzellik_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnSeilenzellik_1.setText("");
		txtpnSeilenzellik_1.setEditable(false);
		txtpnSeilenzellik_1.setBounds(992, 470, 199, 71);
		contentPane.add(txtpnSeilenzellik_1);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("Arkaplan.png")));
		lblNewLabel.setBounds(-73, 0, 1121, 800);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(getClass().getResource("VS.png")));
		lblNewLabel_1.setBounds(992, 0, 199, 759);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(new ImageIcon(getClass().getResource("skor_arkaplan.jpg")));
		lblNewLabel_1_1.setBounds(1190, 0, 190, 759);
		contentPane.add(lblNewLabel_1_1);
		
	 

		
		int [ ][] bilgisayarF ; // diziyi tanýmladýk
		bilgisayarF = new int [4][3]; // elaman sayýsýný belirledik
        Random r = new Random(); // random nesnesini oluþturduk
        int sayi=r.nextInt(4);


        for (int i = 0; i < bilgisayarF.length; i++) { //deðer atamak için döngü oluþturuldu.

        	if(bilgisayarF[sayi][1]==1) {
        		while(bilgisayarF[sayi][1]==1) {
        			sayi=r.nextInt(4);
        		}      	
        	}
        	
        	bilgisayarF[sayi][1]=1;
        	bilgisayarF[sayi][2]=i;
        }

        
        
        int [ ][] bilgisayarB ; // diziyi tanýmladýk
        bilgisayarB = new int [4][3]; // elaman sayýsýný belirledik
        Random a = new Random(4); // random nesnesini oluþturduk
        sayi=a.nextInt(4);

        for (int i = 0; i < bilgisayarB.length; i++) { //deðer atamak için döngü oluþturuldu.

        	if(bilgisayarB[sayi][1]==1) {
        		while(bilgisayarB[sayi][1]==1) {
        			sayi=a.nextInt(4);
        		}      	
        	}
        	
         	bilgisayarB[sayi][1]=1;
         	bilgisayarB[sayi][2]=i;
        }

        
			
			Kullanicibasketbol_0.addActionListener(new ActionListener()  {
				
				
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Kullanicibasketbol_0.setVisible(false);
					Kullanicibasketbol_0.setEnabled(false);
					Kullanicibasketbol_1.setEnabled(false);
					Kullanicibasketbol_2.setEnabled(false);
					Kullanicibasketbol_3.setEnabled(false);
					Kullanicifutbol_0.setEnabled(true);
					Kullanicifutbol_1.setEnabled(true);
					Kullanicifutbol_2.setEnabled(true);
					Kullanicifutbol_3.setEnabled(true);
					Bilgisayarbasketbol_0.setVisible(false);
					txtpnFutbocuSeiniz.setText("Futbolcu Seciniz");
					
		
					
					Kullanicibasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(0).getImg())));
					Bilgisayarbasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.bilgisayarBasketbolcuKart.get(bilgisayarB[0][2]).getImg())));
					
					karsilastirBasketbolcu(0,bilgisayarB[0][2]);
					
					OyuncununSkoru.setText(""+person.getScor());
					BilgisayarinSkoru.setText(""+pc.getScor());
					sayac++;
					if(sayac==4) {
						
						person_sonskor=person.getScor();
						pc_sonskor=pc.getScor();
						System.out.println(person_sonskor);
						System.out.println(pc_sonskor);
						 if(person_sonskor>pc_sonskor) {
								
						
							 txtpnFutbocuSeiniz.setText("Oyuncu Kazandý");	
								
							}
						 else if(person_sonskor<pc_sonskor) {
							 txtpnFutbocuSeiniz.setText("Bilgisayar Kazandý");
								
							}
						 else {
							 txtpnFutbocuSeiniz.setText("Berabere");
							}
					}
		
					
			
				}
				
			});
			
			Kullanicibasketbol_1.addActionListener(new ActionListener()  {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Kullanicibasketbol_1.setVisible(false);
					Kullanicibasketbol_0.setEnabled(false);
					Kullanicibasketbol_1.setEnabled(false);
					Kullanicibasketbol_2.setEnabled(false);
					Kullanicibasketbol_3.setEnabled(false);
					Kullanicifutbol_0.setEnabled(true);
					Kullanicifutbol_1.setEnabled(true);
					Kullanicifutbol_2.setEnabled(true);
					Kullanicifutbol_3.setEnabled(true);
					Bilgisayarbasketbol_1.setVisible(false);
					txtpnFutbocuSeiniz.setText("Futbolcu Seciniz");
					
					Kullanicibasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(1).getImg())));
					Bilgisayarbasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.bilgisayarBasketbolcuKart.get(bilgisayarB[1][2]).getImg())));
					
					karsilastirBasketbolcu(1,bilgisayarB[1][2]);
					
					OyuncununSkoru.setText(""+person.getScor());
					BilgisayarinSkoru.setText(""+pc.getScor());
					sayac++;
					if(sayac==4) {
						
						
						person_sonskor=person.getScor();
						pc_sonskor=pc.getScor();
						System.out.println(person_sonskor);
						System.out.println(pc_sonskor);
						 if(person_sonskor>pc_sonskor) {
								
							
							 txtpnFutbocuSeiniz.setText("Oyuncu Kazandý");	
								
							}
						 else if(person_sonskor<pc_sonskor) {
							 txtpnFutbocuSeiniz.setText("Bilgisayar Kazandý");
								
							}
						 else {
							 txtpnFutbocuSeiniz.setText("Berabere");
							}
					}
				
				}
				
			});
			
			Kullanicibasketbol_2.addActionListener(new ActionListener()  {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Kullanicibasketbol_2.setVisible(false);
					Kullanicibasketbol_0.setEnabled(false);
					Kullanicibasketbol_1.setEnabled(false);
					Kullanicibasketbol_2.setEnabled(false);
					Kullanicibasketbol_3.setEnabled(false);
					Kullanicifutbol_0.setEnabled(true);
					Kullanicifutbol_1.setEnabled(true);
					Kullanicifutbol_2.setEnabled(true);
					Kullanicifutbol_3.setEnabled(true);
					Bilgisayarbasketbol_2.setVisible(false);
					txtpnFutbocuSeiniz.setText("Futbolcu Seciniz");
					
					Kullanicibasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(2).getImg())));
					Bilgisayarbasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.bilgisayarBasketbolcuKart.get(bilgisayarB[2][2]).getImg())));
					
					karsilastirBasketbolcu(2,bilgisayarB[2][2]);
					
					OyuncununSkoru.setText(""+person.getScor());
					BilgisayarinSkoru.setText(""+pc.getScor());
					sayac++;
					if(sayac==4) {
						
						
						person_sonskor=person.getScor();
						pc_sonskor=pc.getScor();
						System.out.println(person_sonskor);
						System.out.println(pc_sonskor);
						 if(person_sonskor>pc_sonskor) {
								
							 //System.out.println("Oyuncu");
							 txtpnFutbocuSeiniz.setText("Oyuncu Kazandý");	
								
							}
						 else if(person_sonskor<pc_sonskor) {
							 txtpnFutbocuSeiniz.setText("Bilgisayar Kazandý");
								
							}
						 else {
							 txtpnFutbocuSeiniz.setText("Berabere");
							}
					}
					
				
				}
				
			});
			
			Kullanicibasketbol_3.addActionListener(new ActionListener()  {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Kullanicibasketbol_3.setVisible(false);
					Kullanicibasketbol_0.setEnabled(false);
					Kullanicibasketbol_1.setEnabled(false);
					Kullanicibasketbol_2.setEnabled(false);
					Kullanicibasketbol_3.setEnabled(false);
					Kullanicifutbol_0.setEnabled(true);
					Kullanicifutbol_1.setEnabled(true);
					Kullanicifutbol_2.setEnabled(true);
					Kullanicifutbol_3.setEnabled(true);
					Bilgisayarbasketbol_3.setVisible(false);
					txtpnFutbocuSeiniz.setText("Futbolcu Seciniz");
					
					Kullanicibasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(3).getImg())));
					Bilgisayarbasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.bilgisayarBasketbolcuKart.get(bilgisayarB[3][2]).getImg())));
					
					karsilastirBasketbolcu(3,bilgisayarB[3][2]);
					JButton Kullanicibasketbol_3_1 = new JButton(new ImageIcon(getClass().getResource(testim.kullaniciBasketbolcuKart.get(3).getImg())));
				
					Kullanicibasketbol_3_1.setBounds(1041, 550, 100, 180);
					contentPane.add(Kullanicibasketbol_3_1);
					OyuncununSkoru.setText(""+person.getScor());
					BilgisayarinSkoru.setText(""+pc.getScor());
					sayac++;
					if(sayac==4) {
					
						
						person_sonskor=person.getScor();
						pc_sonskor=pc.getScor();
					
						 if(person_sonskor>pc_sonskor) {
								
							 //System.out.println("Oyuncu");
							 txtpnFutbocuSeiniz.setText("Oyuncu Kazandý");	
								
							}
						 else if(person_sonskor<pc_sonskor) {
							 txtpnFutbocuSeiniz.setText("Bilgisayar Kazandý");
								
							}
						 else {
							 txtpnFutbocuSeiniz.setText("Berabere");
							}
					}
					
				
				}
				
			});
			
			
			
			Kullanicifutbol_0.addActionListener(new ActionListener()  {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Kullanicifutbol_0.setVisible(false);
					Kullanicifutbol_0.setEnabled(false);
					Kullanicifutbol_1.setEnabled(false);
					Kullanicifutbol_2.setEnabled(false);
					Kullanicifutbol_3.setEnabled(false);
					Kullanicibasketbol_0.setEnabled(true);
					Kullanicibasketbol_1.setEnabled(true);
					Kullanicibasketbol_2.setEnabled(true);
					Kullanicibasketbol_3.setEnabled(true);
					Bilgisayarfutbol_0.setVisible(false);
					txtpnFutbocuSeiniz.setText("Basketbolcu Seciniz");
					
					Kullanicibasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.kullaniciFutbolcuKart.get(0).getImg())));
					Bilgisayarbasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.bilgisayarFutbolcuKart.get(bilgisayarF[0][2]).getImg())));
					
					karsilastirFutbolcu(0,bilgisayarF[0][2]);
					OyuncununSkoru.setText(""+person.getScor());
					BilgisayarinSkoru.setText(""+pc.getScor());
				
			
				}
				
			});
			
			Kullanicifutbol_1.addActionListener(new ActionListener()  {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Kullanicifutbol_1.setVisible(false);
					Kullanicifutbol_0.setEnabled(false);
					Kullanicifutbol_1.setEnabled(false);
					Kullanicifutbol_2.setEnabled(false);
					Kullanicifutbol_3.setEnabled(false);
					Kullanicibasketbol_0.setEnabled(true);
					Kullanicibasketbol_1.setEnabled(true);
					Kullanicibasketbol_2.setEnabled(true);
					Kullanicibasketbol_3.setEnabled(true);
					Bilgisayarfutbol_1.setVisible(false);
					txtpnFutbocuSeiniz.setText("Basketbolcu Seciniz");
					Kullanicibasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.kullaniciFutbolcuKart.get(1).getImg())));
					Bilgisayarbasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.bilgisayarFutbolcuKart.get(bilgisayarF[1][2]).getImg())));
					karsilastirFutbolcu(1,bilgisayarF[1][2]);
					
					
					OyuncununSkoru.setText(""+person.getScor());
					BilgisayarinSkoru.setText(""+pc.getScor());
					
			
				}
				
			});
			
			Kullanicifutbol_2.addActionListener(new ActionListener()  {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Kullanicifutbol_2.setVisible(false);
					Kullanicifutbol_0.setEnabled(false);
					Kullanicifutbol_1.setEnabled(false);
					Kullanicifutbol_2.setEnabled(false);
					Kullanicifutbol_3.setEnabled(false);
					Kullanicibasketbol_0.setEnabled(true);
					Kullanicibasketbol_1.setEnabled(true);
					Kullanicibasketbol_2.setEnabled(true);
					Kullanicibasketbol_3.setEnabled(true);
					Bilgisayarfutbol_2.setVisible(false);
					txtpnFutbocuSeiniz.setText("Basketbolcu Seciniz");
					Kullanicibasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.kullaniciFutbolcuKart.get(2).getImg())));
					Bilgisayarbasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.bilgisayarFutbolcuKart.get(bilgisayarF[2][2]).getImg())));
					karsilastirFutbolcu(2,bilgisayarF[2][2]);
					OyuncununSkoru.setText(""+person.getScor());
					BilgisayarinSkoru.setText(""+pc.getScor());
					
			 
				}
				
			});
			
			Kullanicifutbol_3.addActionListener(new ActionListener()  {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Kullanicifutbol_3.setVisible(false);
					Kullanicifutbol_0.setEnabled(false);
					Kullanicifutbol_1.setEnabled(false);
					Kullanicifutbol_2.setEnabled(false);
					Kullanicifutbol_3.setEnabled(false);
					Kullanicibasketbol_0.setEnabled(true);
					Kullanicibasketbol_1.setEnabled(true);
					Kullanicibasketbol_2.setEnabled(true);
					Kullanicibasketbol_3.setEnabled(true);
					Bilgisayarfutbol_3.setVisible(false);
					txtpnFutbocuSeiniz.setText("Basketbolcu Seciniz");
					Kullanicibasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.kullaniciFutbolcuKart.get(3).getImg())));
					Bilgisayarbasketbol_3_1.setIcon(new ImageIcon(getClass().getResource(testim.bilgisayarFutbolcuKart.get(bilgisayarF[3][2]).getImg())));
					karsilastirFutbolcu(3,bilgisayarF[3][2]);
					OyuncununSkoru.setText(""+person.getScor());
					BilgisayarinSkoru.setText(""+pc.getScor());
					
				
					
				}
				
			});
				
			
			
		
	}
	
	public int karistir() {
		Random rand=new Random();
		int sayi=rand.nextInt(4);
		return sayi;
	}
	
	
	
	
		
	 public void karsilastirBasketbolcu(int sira,int sayi) {
		 int ozellik=testim.ozellikSec();
		 JTextPane txtpnSeilenzellik_1 = new JTextPane();
			txtpnSeilenzellik_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
			txtpnSeilenzellik_1.setText("");
			txtpnSeilenzellik_1.setEditable(false);
			txtpnSeilenzellik_1.setBounds(992, 470, 199, 71);
			contentPane.add(txtpnSeilenzellik_1);
			
			
 		
 		
 	
 		if(ozellik==0) {
 		
 			
 			if(testim.bilgisayarBasketbolcuKart.get(sayi).getIkilik()>testim.kullaniciBasketbolcuKart.get(sira).getIkilik()) {
 				
 				pc.puanEkle();
 			}else {
 				person.puanEkle();
 				
 			}
 			
 			txtpnSeilenzellik_1.setText("Ýkilik");
 		}
 		
 		if(ozellik==1) {
 			
 			if(testim.bilgisayarBasketbolcuKart.get(sayi).getUcluk()>testim.kullaniciBasketbolcuKart.get(sira).getUcluk()) {
 				pc.puanEkle();
 			}else {
 				person.puanEkle();
 				
 			}
 			
 			txtpnSeilenzellik_1.setText("Ucluk");
 		}
 		
 		if(ozellik==2) {
 			
 			if(testim.bilgisayarBasketbolcuKart.get(sayi).getS_atis()>testim.kullaniciBasketbolcuKart.get(sira).getS_atis()) {
 				pc.puanEkle();
 			}else {
 				person.puanEkle();
 				;
 			}
 			
 			
 			txtpnSeilenzellik_1.setText("S.Atis");
 		}
 		
 		
		
		
	    }
	 
	 
	 
	 public void karsilastirFutbolcu(int sira,int sayi) {
		 JTextPane txtpnSeilenzellik_1 = new JTextPane();
			txtpnSeilenzellik_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
			txtpnSeilenzellik_1.setText("");
			txtpnSeilenzellik_1.setEditable(false);
			txtpnSeilenzellik_1.setBounds(992, 470, 199, 71);
			contentPane.add(txtpnSeilenzellik_1);
	    
	    		
	    		int ozellik=testim.ozellikSec();
	    		
	    		
	    		if(ozellik==0) {
	    		
	    			
	    			if(testim.bilgisayarFutbolcuKart.get(sayi).getPenalti()>testim.kullaniciFutbolcuKart.get(sira).getPenalti()) {
	    				
	    				pc.puanEkle();
	    			}else {
	    				person.puanEkle();
	    				
	    			}
	    			
	    			txtpnSeilenzellik_1.setText("Penalti");
	    		}
	    		
	    		if(ozellik==1) {
	    			
	    			if(testim.bilgisayarFutbolcuKart.get(sayi).getFrikik()>testim.kullaniciFutbolcuKart.get(sira).getFrikik()) {
	    				pc.puanEkle();
	    			}else {
	    				person.puanEkle();
	    				
	    			}
	    			
	    			txtpnSeilenzellik_1.setText("Frikik");
	    		}
	    		
	    		if(ozellik==2) {
	    			
	    			if(testim.bilgisayarFutbolcuKart.get(sayi).getK_karsiya()>testim.kullaniciFutbolcuKart.get(sira).getK_karsiya()) {
	    				pc.puanEkle();
	    			}else {
	    				person.puanEkle();
	    				
	    			}

	    			txtpnSeilenzellik_1.setText("K.Karsiya");
	    		}
	    		
	    		
	    	}
}
	

