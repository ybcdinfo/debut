package moi.exos.graphique;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

class Fen1Bouton extends JFrame implements ActionListener{
	
	public Fen1Bouton(){
		setTitle("Deux Boutons");
		setSize(300,200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		monBouton1=new JButton("Bouton A");
		monBouton2=new JButton("Bouton B");
		Container contenu=getContentPane();
		contenu.setLayout(new FlowLayout());
		contenu.add(monBouton1);
		contenu.add(monBouton2);
		monBouton1.addActionListener(this);
		monBouton2.addActionListener(this);
	}
	
	private JButton monBouton1,monBouton2;

	public void actionPerformed(ActionEvent ev){
		String nom=ev.getActionCommand();
		System.out.println("action sur le "+nom);
	}
}
public class Bouton{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fen1Bouton fen=new Fen1Bouton();
		fen.setVisible(true);

	}

}
