/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notaalumnos;

/**
 *
 * @author angel
 */
public class notas {
   private double not[]= new double[15],  promedio, porcentaje, contador=0, sum=0, menor;
    private int j=0, posicion;
    
    public notas(double []not){
        this.not= not;
        
    }
    public void setnotaM(){
       
        for (int i=0;i<not.length;i++){
            if(not[i]>not[j]){
                j=i;
            }
        }
    }
    public void setPorcentaje(){
       for( int i=0;i<not.length;i++){
        if( not[i]>=3.0){
            contador++;
        porcentaje=(contador*100)/not.length;
        
    }
       }
    }
    public void setpromedio(){
        for( int i=0;i<not.length;i++){
            sum+=not[i];
            promedio=sum/not.length;
        }
         
    }
     public void setposicion(){
         
        menor = (double) not[0];
        posicion = 0;
         for (int i=0; i<not.length;i++){
             if (not[i]<menor){
                 menor= (double)not[i]; 
                 posicion=i;
             }
           
        }
    }
            
    public int getnotaM(){
        System.out.println("la nota mayor es "+not[j]);
        return j;
    }
    public double getporcentaje(){
        System.out.println("porcentaje de aprobados: "+porcentaje+"%");
        return porcentaje;
    }
    public double getpromedio(){
        System.out.println("promedio de notas: "+promedio);
        return promedio;
    }
    public double getposicion(){
         System.out.println("nota menor: "+menor+", posicion nota menor: "+posicion);
         return posicion;
    }
}
