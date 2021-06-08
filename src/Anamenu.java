import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;



public class Anamenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anamenu frame = new Anamenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Anamenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Quit = new JButton(new ImageIcon(getClass().getResource("Quit.png")));
		Quit.setBounds(653, 460, 128, 128);
		contentPane.add(Quit);
		
		JButton Start = new JButton(new ImageIcon(getClass().getResource("play.png")));
		Start.setBounds(653, 153, 128, 128);
		contentPane.add(Start);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("Baslangic_ekrani.png")));
		lblNewLabel.setBounds(0, -35, 1371, 784);
		contentPane.add(lblNewLabel);
		
		
		Start.addActionListener(new ActionListener()  {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Oyun frame = new Oyun();
				Anamenu anamenu=new Anamenu();
				anamenu.setVisible(false);
				frame.setVisible(true);
				
			}
	

	});
		Quit.addActionListener(new ActionListener()  {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Oyun frame = new Oyun();
				Anamenu anamenu=new Anamenu();
				System.exit(0);
			}
	

	});
}
}
