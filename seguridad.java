/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import javax.swing.JOptionPane;

/**
 *
 * @author JEIMY
 */
class seguridad {
     principal login = new principal();
   String res;
    public void validarUsuario(String usuario[], String User, String password, int intentos){
        boolean encontrado=false;
       
        
        for (int i = 0; i < usuario.length; i++) {
            
            if((usuario[i].equalsIgnoreCase(User) && usuario[i+1].equals(password))){
              res="Bienvenido "  + User+", como estás? ";
              encontrado = true;
              JOptionPane.showMessageDialog(null, res, "INGRESANDO...", JOptionPane.INFORMATION_MESSAGE);
              intentos=0;
              principal.setIntentos(intentos);
              new principal().setVisible(true);
              
              
              break;
            }
                
        } //fin del for
            
    if (encontrado==false){
                
                res = "clave y/o usuario erroneos van" + intentos + "intentos fallidos";
                 JOptionPane.showMessageDialog(null, res, "INGRESANDO...", JOptionPane.ERROR_MESSAGE);
                                      
                        
            }
            if (intentos > 2 ){
                JOptionPane.showMessageDialog(null, "3 intentos erroneos, se bloquea", "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            
            }
    }
    
}
