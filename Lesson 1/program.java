import java.util.Random;
import java.util.random;
public class program {
 
    public static void main(String[] args) {

        //Задача 1 
        Random rand = new Random();
        int i = rand.nextInt(-1000,1001);
        System.out.println("Выпавшее число: " + i);

        //Задача 2
        int n = high_bit(i);
        System.out.println("Старший бит: " + n);

        //Задача 3
        int[] array_m1 = numbers_max_value(i, n);
        int[] array_m2 = numbers_min_value(i, n);

        //Задача 4

    }
        
    
//Метод к задаче 2
    public static int high_bit(int k){
        int number = 0;
        if (k<0){ k = k*-1;}
        while (k!=1){
            k >>=1;
            number++;
        }
        return number;
    }
//Метод к задаче 3.1
    public static int[] numbers_max_value(int i,int n){
        int count = 0;
        int[] array = new int[Short.MAX_VALUE-i];
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j%n == 0){
                array[count] = j;
                count++;
            }
            
        }
        return array;
    }
//Метод к задаче 3.2
    public static int[] numbers_min_value(int i,int n){
        int count = 0;
        int[] array = new int[i-Short.MIN_VALUE];
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j%n != 0){
                array[count] = j;
                count++;
            }
            
        }
        return array;
    }


}
         
    





