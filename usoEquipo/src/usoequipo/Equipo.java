
package usoequipo;

import java.util.List;
import javax.swing.JOptionPane;

public class Equipo {
    private String nomEquipo;
    private int anhoFundacion;
    private String direccion;
    private String colorCamiseta;
    private byte campGanados;
    int edad;

    
    public Equipo(String nomEquipo, int anhoFundacion, String direccion, String colorCamiseta, byte campGanados) {
        this.nomEquipo = nomEquipo;
        this.anhoFundacion = anhoFundacion;
        this.direccion = direccion;
        this.colorCamiseta = colorCamiseta;
        this.campGanados = campGanados;
    }

    public Equipo() {
    }
    
    public void agregaEquipo(List<Equipo>equipoFutbol, String nomEquipo, int anhoFundacion, String direccion, String colorCamiseta, byte campGanados){
        equipoFutbol.add(new Equipo(nomEquipo, anhoFundacion, direccion, colorCamiseta, campGanados));
    }
    
   public void imprimeEquipos(List<Equipo>equipoFutbol){
       for(int i=0;i<equipoFutbol.size();i++){
           System.out.println("nombre del equipo "+ equipoFutbol.get(i).getNomEquipo());
           System.out.println("año del equipo "+ equipoFutbol.get(i).getAnhoFundacion()); 
           System.out.println("direccion del equipo "+ equipoFutbol.get(i).getDireccion()); 
           System.out.println("color del equipo "+ equipoFutbol.get(i).getColorCamiseta()); 
           System.out.println("campeonatos del equipo "+ equipoFutbol.get(i).getCampGanados()); 
       }
       
   }
   /*public void mayorCampeonatos(List<Equipo>equipoFutbol){
       byte contador=0;
       String nom;
       for(int i=0;i<equipoFutbol.size();i++){
       if (contador <equipoFutbol.get(i).getCampGanados()){
           contador=equipoFutbol.get(i).getCampGanados();
           nom=equipoFutbol.get(i).getNomEquipo();
       }
           System.out.println("el equipo "+ nom +" tiene estos campeonatos"+contador);
          
   }*/
   public void masCampeonatos(List<Equipo>equipoFutbol){
       int mayor=0, ind=0;
       
       for (int i=0; i<equipoFutbol.size(); i++){
           if(equipoFutbol.get(i).getCampGanados()>mayor){
               mayor=equipoFutbol.get(i).getCampGanados();
           ind=1;
        }
       }
       System.out.println("nombre del equipo "+ equipoFutbol.get(ind).getNomEquipo());
           System.out.println("año del equipo "+ equipoFutbol.get(ind).getAnhoFundacion()); 
           System.out.println("direccion del equipo "+ equipoFutbol.get(ind).getDireccion()); 
           System.out.println("color del equipo "+ equipoFutbol.get(ind).getColorCamiseta()); 
           System.out.println("campeonatos del equipo "+ equipoFutbol.get(ind).getCampGanados()); 
   }
  
  
           

    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public int getAnhoFundacion() {
        return anhoFundacion;
    }

    public void setAnhoFundacion(int anhoFundacion) {
        this.anhoFundacion = anhoFundacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColorCamiseta() {
        return colorCamiseta;
    }

    public void setColorCamiseta(String colorCamiseta) {
        this.colorCamiseta = colorCamiseta;
    }

    public byte getCampGanados() {
        return campGanados;
    }

    public void setCampGanados(byte campGanados) {
        this.campGanados = campGanados;
    }
    
    
}
