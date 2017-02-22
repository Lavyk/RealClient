/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Super i3
 */
public class Principal {
    
      
    public static void main (String[] args) throws InterruptedException{
        
        Functions funcoes = new Functions();
        Antenna log = new Antenna();
        Login splash = new Login(new javax.swing.JFrame(), true);
        
        splash.setVisible(true);
        
        
        
        System.out.println("Terminou");
        
        log.setVisible(true);
        System.out.println("Começou");
        funcoes.Pausa();
        splash.setVisible(false);
    }
    
    public void load() throws InterruptedException{
        
        Functions funcoes = new Functions();
        Antenna log = new Antenna();
        Login splash = new Login(new javax.swing.JFrame(), true);
        
        }
}
