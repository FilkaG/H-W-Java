import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lesson_2 {
    public static void main(String[] args) {

        ////Задача 2
        //String str1 = "привет 23";
        //String str2 = "32 тевирп";
        //int count = 0;
        //if (str1.length() == str2.length()) {
        //    for (int i = 0; i < str1.length(); i++) {
        //        if (str1.charAt(i) == str2.charAt(str2.length() - i - 1)) {
        //            count++;
        //        }
        //    }
        //    if (count == str1.length()) {
        //        System.out.println("являются вращенеем");
        //    }
//
        //} else {
        //    System.out.println("не являются вращенеем");
        //}
        //// Задача 3
        //String str = "Hello my friend";
        //System.out.println(reverse_rec(str));
//
        //// Задача 4
        //int number_1 = 56;
        //int number_2 = 3;
        //StringBuilder str3 = new StringBuilder(Calc(number_1, number_2, "+"));
        //StringBuilder str4 = new StringBuilder(Calc(number_1, number_2, "+"));
        //System.out.println(str3);
        //// Задача 5
        //int index = str3.indexOf("=");
        //str3 = str3.deleteCharAt(index);
        //str3.insert(index, " Равно ");
        //System.out.println(str3);
        //// Задача 6
        //str4.replace(index,index+1," равно ");
        //System.out.println(str4);
//
        //// Задача 7
//
        //String Proverka_1 = "";
        //StringBuilder Proverka_2 = new StringBuilder("");
        //for (int i = 0; i < 101; i++) {
        //    Proverka_1 = Proverka_1 + "=";
        //    Proverka_2.append("=");
        //}
//
        //long start2 = System.currentTimeMillis();
        //int index2 = Proverka_2.indexOf("=");
        //while (index2 != -1) {
        //    Proverka_2.replace(index2,index2+1," равно ");
        //    index2 = Proverka_2.indexOf("=");
        //}
        //System.out.print("Time StringBuilder: ");
        //System.out.println(System.currentTimeMillis() - start2);
//
        //long start1 = System.currentTimeMillis();
        //String after_delete = "";
        //for (int i = 0; i < Proverka_1.length(); i++){
        //    char ravno = '=';
        //    if (Proverka_1.charAt(i) == ravno){
        //        after_delete = after_delete + "равно";
        //    }
        //    else {
        //        after_delete = after_delete + Proverka_1.charAt(i);
        //    }
        //}
        //System.out.print("Time String: ");
        //System.out.println(System.currentTimeMillis() - start1);

        //              УРОК 3!
        //Задача 1
        ArrayList<String> Li_1 = new ArrayList(10);
        ArrayList<String> Li_2 = new ArrayList(10);
        Li_1.add("Синий");
        Li_1.add("Красный");
        Li_1.add("Желтый");
        Li_1.add("Зеленый");
        Li_1.add("Белый");

        //Задача 2
        for (String i : Li_1) {
            i = i + "!";
            Li_2.add(i);
            System.out.println(i);
        }
        System.out.println();

        //Задача 3
        Li_2.add(0, "Фиолетовый");
        for (String i : Li_2) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 4
        String Elem = Li_2.get(2);
        System.out.println(Elem);
        System.out.println();

        //Задача 5
        Li_2.set(1, "Черный");

        //Задача 6
        Li_2.remove(2);

        //Задача 7
        int Index = Li_2.indexOf("Желтый!");
        System.out.println(Index);
        System.out.println();

        //Задача 8
        ArrayList<String> Li_3 = new ArrayList(10);
        Li_3.add(Li_2.get(0));
        Li_3.add(Li_2.get(2));
        Li_3.add(Li_2.get(4));

        //Задача 9
        for (String i : Li_3){
            int Index1 = Li_2.indexOf(i);
            if (Index1 != -1){
                Li_2.remove(Index1);
            }
        }
        //Задача 10
        Collections.sort(Li_1);

        //Задача 11
        System.out.println("          Задача 11");
        LinkedList<String> Spis1 = new LinkedList<>();
        ArrayList<String> Spis2 = new ArrayList();
        for (int i = 0; i < 10; i++){
            Spis1.add(0,"Зеленый");
        }
        for (int i = 0; i < 10; i++){
            Spis2.add(0,"Зеленый");
        }

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            Spis1.add(0,"Зеленый");
        }
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            Spis2.add(0,"Зеленый");
        }
        System.out.println(System.currentTimeMillis() - start2);



    }
        //END




        ////Задача 3 Метод
        //String str = "Hello my friend";
        //public static String reverse_rec(String str) {
        //    if (str.length() <= 1) {
        //        return str;
        //    }
        //    return reverse_rec(str.substring(1)) + str.charAt(0);
        //}
//
        ////Задача 4 Метод
        //public static StringBuilder Calc (int number_1, int number_2, String operation){
        //    StringBuilder str_answer = new StringBuilder();
        //    str_answer = str_answer.append(number_1);
        //    str_answer = str_answer.append(operation);
        //    str_answer = str_answer.append(number_2);
        //    str_answer = str_answer.append("=");
        //    if (operation == "-") {
        //        str_answer = str_answer.append(number_1 - number_2);
        //    }
        //    if (operation == "+") {
        //        str_answer = str_answer.append(number_1 + number_2);
        //    }
        //    if (operation == "*") {
        //        str_answer = str_answer.append(number_1 * number_2);
        //    }
        //    return str_answer;
        //}




}


