import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(5);
        mylist.add(4);
        mylist.add(6);
        mylist.add(6);
        mylist.add(2);
        mylist.add(2);
        mylist.add(1);
        mylist.add(10);
        mylist.add(15);
        mylist.add(17);
        mylist.add(21);
        List<Integer> result = mylist.stream().distinct().toList();
        System.out.println(result);
        //mylist.stream()-делаю стрим, distinct()удлаить повторяющиеся значения,toList()-возвращаю из стрима лист
        List<Integer> result2 = mylist.stream().filter(value -> value % 2 == 0 && value > 7 && value < 17).toList();
        //filter(value->value%2==0)-ищет четные
        System.out.println(result2);
        List<Integer> result3 = mylist.stream().map(value -> value * 2).toList();
        //map-преобразовать из одного в другое
        System.out.println(result3);
        List<Integer> result4 = mylist.stream().sorted().limit(4).toList();
        System.out.println(result4);
        long result5 = mylist.stream().count();
        //count-вывести количество элементов в стриме
        System.out.println(result5);
        double result6 = mylist.stream().mapToDouble(val -> val).average().orElse(Double.NaN);
        //mapToDouble(val->val)-преобразуем Integer в Double
        // .average().orElse(Double.NaN)-седнее значение stream
        System.out.println(result6);
    }
}