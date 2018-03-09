
package boletin17;

import java.util.Random;

public class Boletin17 {
    int y;
    int r;
   int numeros[]= new int[6];//arrray int con 6 posiciones de tipo Integer
Random a= new Random();
public void operacion(){
      
    for(y=0;y<=5;y++){
    r=a.nextInt(51)+1;
      numeros[y]=r;
     
    }
    for( int e=5;e>=0;e=e-1){
     System.out.println(e+numeros[e]);
    }
}



    public static void main(String[] args) {
       Boletin17 a=new Boletin17();
       a.operacion();
       
    }
    
}

//Realiza un programa que cree un array chamado “numeros” con 6 numeros aleatorios dun rango de 1 a 50 .
//Seguidamente visualiza o array o revés ( 0 primeiro elemento visualizaráse  o último e asi sucesivamente)