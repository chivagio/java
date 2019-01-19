package chivagiovanni2019;

import javax.swing.JOptionPane;

public class Myfirstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		JOptionPane.showMessageDialog(null, "Message Type 0", "title",0);
		JOptionPane.showMessageDialog(null, "Message Type 1", "title",1);
		JOptionPane.showMessageDialog(null, "Message Type 2", "title",2);
		JOptionPane.showMessageDialog(null, "Message Type 3", "title",3);
		
		String nom = JOptionPane.showInputDialog("Donnez-moi votre nom: ");
		
		System.out.println(nom);
	}
}