import java.io.*;
class program
  {
    public static void main(String [] args)
     {
       int A[][] = {{7,5},{4,9}};
       int Suma = 0;
       for (int f = 0; f < A.length; f++)
        {
          for (int c = 0; c < A.[f].length; c++)
           {
             Suma = Suma + A[f][c];
           }
            System.out.println(Suma);
        }
     }
  }