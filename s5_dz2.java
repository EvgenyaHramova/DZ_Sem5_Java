import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class s5_dz2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(); 
        names.add("Иван Иванов");
        names.add("Наталья Натальина");
        names.add("Иван Иванов");
        names.add("Иван Петров");
        System.out.println(names);


        Map<String, Integer> name_count = new HashMap<>(); 

        for (String name : names) { 
            if (name_count.containsKey(name)) { 
                name_count.put(name, name_count.get(name) + 1);
            } else {
                name_count.put(name, 1); 
            }
        }

        List<Map.Entry<String, Integer>> countNameSort = new ArrayList<>(name_count.entrySet()); 

        Collections.sort(countNameSort, new Comparator<Map.Entry<String, Integer>>() { 
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : countNameSort) { 
            System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
        }
    }
}
