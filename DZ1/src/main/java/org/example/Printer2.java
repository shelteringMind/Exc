package org.example;
import java.util.Arrays;

class Answer2 {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if(a.length==b.length){
            int [] c = new int[a.length];
            for (int i=0;i<c.length;i++) {
                c[i] = a[i] / b[i];
            }
            return c;
        } else {
            return new int[]{0};
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer2 ans = new Answer2();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}

