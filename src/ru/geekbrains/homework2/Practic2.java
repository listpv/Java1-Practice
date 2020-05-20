package ru.geekbrains.homework2;


import java.sql.Array;
import java.util.Arrays;

public class Practic2
{
    public static void main(String[] args)
    {
        System.out.println("Задание 1");
        int[] a = {1, 1, 0, 1, 0, 1, 0, 0, 0, 1};
        changeElements(a);
        System.out.println("Задание 2");
        int[] b = new int[8];
        fullfillMassiv(b);
        System.out.println("Задание 3");
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyOn2(c);
        System.out.println("Задание 4");
        int[][] d = new int[9][9];
        diagFullfill(d);
        System.out.println("Задание 5");
        int[] e = {1, 56, 456, 1, 90, 456, 278};
        lookforMinMax(e);
        System.out.println("Задание 6");
        int[] f = {29, 2, 3, 4, 5, 6, 9};
        boolean res = hasEqualHalfs(f);
        System.out.println(res);
        System.out.println("Задание 7");
        int[] g = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 11 ,12};
        moveElements(g, 3);
        System.out.println("Задание 7");
        moveElements(g, -4);
    }

    /*  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
    static void changeElements(int[] a)
    {
        System.out.println("Первоначальный массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        for(int i = 0; i < a.length; i ++)
        {
            if(a[i] == 0)
            {
                a[i] = 1;
            }
            else
                {
                    a[i] = 0;
            }
        }
        System.out.println();
        System.out.println("Изменённый массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /* 2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    static void fullfillMassiv(int[] a)
    {
        System.out.println("Первоначальный массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        for(int i = 1; i < a.length; i++)
        {
            a[i] = a[i-1] + 3;
        }
        System.out.println();
        System.out.println("Изменённый массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    /* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2;
     */
    static void multiplyOn2(int [] a)
    {
        System.out.println("Первоначальный массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        for(int i = 0; i< a.length; i++)
        {
            if(a[i] < 6)
            {
                a[i] = a[i] * 2;
            }
        }
        System.out.println();
        System.out.println("Изменённый массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /* 4.  Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    static void diagFullfill(int[][] a)
    {
        System.out.println("Первоначальный массив");
        for (int i = 0; i < a.length; i++)
        {
            for( int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++)
        {
          a[i][i] = 1;
          a[i][a[i].length -1 -i] = 1;
        }
        System.out.println("Изменённый массив");
        for (int i = 0; i < a.length; i++)
        {
            for( int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    (без помощи интернета);
     */

    static void lookforMinMax(int[] a)
    {
        System.out.println("Первоначальный массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int max = a[0];
        int min = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        for(int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максимальное значение = " + max);
    }

    /* 6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    граница показана символами ||, эти символы в массив не входят.
     */
    static boolean hasEqualHalfs(int[] a)
    {
        System.out.println("Первоначальный массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int bigsum = 0;
        for(int i = 0; i < a.length; i++)
        {
            bigsum = bigsum + a[i];
            int sum = 0;
            for(int j = i + 1; j < a.length; j++)
            {
                sum = sum + a[j];
            }
            if(bigsum == sum)
            {
                return true;
            }

        }
        return false;
    }

    /* 7.  Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */
    static void moveElements(int[] a, int b)
    {
        System.out.println("Первоначальный массив");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("смещение  " + b);
        if (b % a.length == 0)                                                 // Прверка на обходимость обработки.
        {
            System.out.println("Финальный массив.");
            for (int i = 0; i < a.length; i++)
            {
                System.out.print(a[i] + " ");
            }
            return;
        }
        int shift = b;                                                           // смещение
        if (shift > a.length || shift < 0 && shift < (a.length * -1))            // если смещение больше
        {                                                                        // массива.
            shift = shift % a.length;
        }
        int temp1 = 0;                                 // переменная1 для запоминания значения эл-тов массива.
        int temp2;                                     // переменная2 та же цель.
        int index;                                     // счётчик1 для изменения смещения.
        int indshft = 0;                               // счётчик2 для изменения смещения.
        if (shift > 0)                                 // для положительного смещения.
        {
            temp2 = a[0];
            index = 0;
            for (int i = 0; i < a.length; i++)
            {
                if (a.length % shift == 0 && i != 0 && i % (a.length / shift) == 0)  // если по тому же кругу,
                {                                                                    // то сдвиг на одну позицию.
                    index++;
                    temp1 = a[indshft + 1];
                    temp2 = a[indshft + 1];
                }
                if (index >= a.length)                              // очередной круг.
                {
                    index = index - a.length;
                }
                indshft = index + shift;
                if (indshft >= a.length)                             // очередной круг.
                {
                    indshft = indshft - a.length;
                }
                if (i % 2 == 0)                                      // чётный цикл.
                {                                                    // присваивание и запоминание
                    temp1 = a[indshft];                              // на каждом цикле.
                    a[indshft] = temp2;
                } else                                               // нечётный цикл.
                    {
                    temp2 = a[indshft];
                    a[indshft] = temp1;
                }
                index = index + shift;
            }
        }
        else                                                          // для отрицательного смещения.
            {                                                         // смысл аналогичный.
                temp2 = a[a.length - 1];
                index = a.length - 1;
                int j = 0;
                for (int i = a.length - 1; i  >= 0; i--)
                {
                    if(a.length % shift == 0 && j != 0 && j % (a.length / shift) == 0)
                    {
                        index--;
                        if(indshft == 0)
                        {
                            temp1 = a[a.length -1];
                            temp2 = a[a.length -1];
                        }
                        else
                            {
                                temp1 = a[indshft - 1];
                                temp2 = a[indshft - 1];
                            }
                    }
                    if (index < 0)
                    {
                        index = index + a.length;
                    }
                    indshft = index + shift;
                    if (indshft < 0)
                    {
                        indshft = indshft + a.length;
                    }
                    if (j % 2 == 0)
                    {
                        temp1 = a[indshft];
                        a[indshft] = temp2;
                    }
                    else
                    {
                        temp2 = a[indshft];
                        a[indshft] = temp1;
                    }
                    index = index + shift;
                    j++;
                }
            }
            System.out.println("Изменённый массив");
            for (int i = 0; i < a.length; i++)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
    }
}

