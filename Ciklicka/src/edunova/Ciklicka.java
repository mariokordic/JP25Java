package edunova;

import javax.swing.JOptionPane;

public class Ciklicka {
public static void main(String[] args) {
	   int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
       int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
       int tablica[][] = new int[x][y];
       int red=0,krajreda=x-1;
       int stupac=0,krajstupca=y-1;
       int brojac=1;
       while(red<=krajreda && stupac <=krajstupca) {
           for(int i=krajstupca;i>=stupac;i--) {
               tablica[krajreda][i]=brojac;
               brojac++;              
           }
           if(brojac>x*y) {        
               break;
           }
           krajreda--;
           
       }
       for(int i=0;i<x;i++) {
           for(int j=0;j<y;j++) {
               System.out.print(tablica[i][j] + "\t");
           }
           System.out.println();
       }
}
}
