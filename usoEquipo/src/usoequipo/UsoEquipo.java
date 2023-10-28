
package usoequipo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class UsoEquipo {

    
    public static void main(String[] args) {
        Equipo x = new Equipo();
        List<Equipo>misEquipos = new ArrayList();
        byte opc=1;
        while(opc<4){
          opc=  Byte.parseByte(JOptionPane.showInputDialog(" 1.informacion equipos\n2.imprimir\n3.mas ganador\n4.colores\n5.campeonatos\n6.Salir"));
          switch(opc){
              case 1 : String nom=JOptionPane.showInputDialog("Digite el nombre del equipo");
                        int fund=Integer.parseInt(JOptionPane.showInputDialog("Digite la fundacion del equipo"));
                        String direc=JOptionPane.showInputDialog("Digite la direccion del equipo");
                        String color=JOptionPane.showInputDialog("Digite el color del equipo");
                        byte camp=Byte.parseByte(JOptionPane.showInputDialog("Digite los campeonatos del equipo"));
                  x.agregaEquipo(misEquipos, nom, fund, direc, color, camp);
              break;
              case 2: x.imprimeEquipos(misEquipos);
              break;
              case 3: if(misEquipos.isEmpty())
                      System.out.println("ingrese datos primero.");
              else
                      x.masCampeonatos(misEquipos);
          }
        }
        
                
    }
    
}
