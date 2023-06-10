import java.io.*;
class program
  {
    public static void main(String [] args)
     {
       int A[][] = {{5,1,7},{7,4,2},{9,7,3}};
       int nMTres = 0;
       for (int f = 0; f < A.length; f++)
        {
          for (int c = 0; c < A.[f].length; c++)
           {
             if (A[f][c]>3)
               nMTres++;
           }
            System.out.println(nMTres);
        }
     }
  }