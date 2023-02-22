// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.


import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class task_2 {
 public static void main(String[] args) {
 Random rnd = new Random();
 ArrayList<Integer> list1 = new ArrayList<Integer>();
 for (int i = 0; i < 10; i++) {
 int val = rnd.nextInt(-100, 100);
 list1.add(val);
        }
 System.out.printf("Изначальный список: %s\n", list1);
 int max = max(list1);
 int min = min(list1);
 int maxItem = list1.get(0);
 int minItem = list1.get(0);
 int sumItems = 0;
 for (int item : list1) {
 if (item > maxItem) {
 maxItem = item;
            }
 if (item < minItem) {
 minItem = item;
            }
 sumItems += item;
        }
 float average = (float)sumItems/list1.size();
 System.out.printf("max: %s\n", max);
 System.out.printf("min: %s\n", min);
 System.out.printf("Среднее арифметическое: %s\n", average);
    }
}