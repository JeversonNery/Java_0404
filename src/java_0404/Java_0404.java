/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_0404;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String st = JOptionPane.showInputDialog(null, "Informe um número inteiro: ");
        int it_1 = Integer.parseInt(st);
        
        double num = Math.pow(it_1, 2);
        int it_2 = (int)num;
        
        JOptionPane.showMessageDialog(null, "O quadrado de " + st + " é: " + it_2);
    }
    
}
