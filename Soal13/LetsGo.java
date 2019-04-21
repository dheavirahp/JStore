 
import java.util.*;

/**
 * Write a description of class LetsGo here.
 * 
 * @author Dheavira Hadina Putri - 1606831773 
 */
public class LetsGo
{
   private static int[] arrayDelay = new int[3];
   public static void main(String args[]) {
      int i;
      for(i=0;i<3;i++)
      {
          arrayDelay[i] = random();
      }
      arrayDelay = sorting(arrayDelay);
      RunForYourLife R1 = new RunForYourLife( "Lionel", arrayDelay[2]);
      R1.start();
      
      arrayDelay = sorting(arrayDelay);
      RunForYourLife R2 = new RunForYourLife( "Andres", arrayDelay[1]);
      R2.start();
      
      arrayDelay = sorting(arrayDelay);
      RunForYourLife R3 = new RunForYourLife( "Messi", arrayDelay[0]);
      R3.start();
   }   
   
   public static int random(){
      //untuk menghasilkan angka random
      Random rand = new Random();
      return rand.nextInt(100)+1;
   }
   
   public static int[] sorting(int[] arr){
      //untuk sorting angka random yang dihasilkan
      for (int i = 0; i < arr.length - 1; i++)
      {
          int index = i;
          for (int j = i + 1; j < arr.length; j++)
              if (arr[j] < arr[index])
                  index = j;
      
         int smallerNumber = arr[index]; 
         arr[index] = arr[i];
         arr[i] = smallerNumber;
        }
        return arr;
    }
}
