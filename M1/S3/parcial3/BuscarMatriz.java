import java.io.*;
class BuscarMatriz
  {
   public static void main (String[] args)
     {
      int[] buscar = {{0,9,4}, {1,3,7}, {5,4,3,}};
      int encontrado = 0, numBuscado = 10;
      for (int f=0; f< buscar.length; f++)
       {
           for (int c= 0; c<buscar.length; c++)
            {
             if (numBuscado == buscar[f][c])
               encontrado=1;
            }
       }
       if (numE == 1)
         System.out.println("Numero: "numBuscado+", encontrado");
       else 
         System.out.printl("Numero: "+numBuscado+", NO encontrado");
      }
  }