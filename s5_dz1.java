import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2

public class s5_dz1 {

    public static Map<String, List<Integer>> book_phone = new HashMap<>();
    public static Scanner inputText = new Scanner(System.in, "cp866");

    public static Map<String, List<Integer>> b_ph() {

        book_phone.put("Иван Иванов", List.of(12345, 67890));
        book_phone.put("Петр Петров", List.of(15951));
        book_phone.put("Маша Машина", List.of(95123, 78963));
        book_phone.put("Вася Васильев", List.of(75357, 25852));
        book_phone.put("Оля Ольгина", List.of(65456, 54789, 21478));
        book_phone.put("Андрей Андреев", List.of(90804));
        return book_phone;

        // System.out.println(book_phone);
    }

    public static Map<String, List<Integer>> new_phone(Map<String, List<Integer>> book_phone) {
        System.out.println("Введите имя: ");
        String name = inputText.nextLine();
        // 

                    System.out.printf("%s: %s ", name, book_phone.get(name) + "\n");
                    System.out.print("Желаете добавить номер в запись: " + name + ", тогда нажмите Y");
                    String yes = inputText.next().toLowerCase();
                    if (yes.equals("Y")) {
                        System.out.println("Введите дополнительный номер телефона: ");
                        Integer new_num = inputText.nextInt();
                        for (Map.Entry<String, List<Integer>> item : book_phone.entrySet()) {
                            if (item.getKey().equals(name)){
                                List<Integer> val = new ArrayList<>(book_phone.get(name));
                                val.add(new_num);
                                book_phone.put(name, val);
                            }  
                            else {
                                System.out.println("Записи с указанными данными нет в списке контактов");
                            } 
                        }
                        System.out.printf("Номера телефонов", name, ": %s ", book_phone.get(name));
                    }
                    else {
                        System.out.println("Ок");
                    }
                   
        inputText.close();
        return book_phone;
    }


    // public static void new_phone(Map<String, List<Integer>> book_phone) {
    //     System.out.println("Введите имя: ");
    //     String name = inputText.nextLine();
    //     if(book_phone.containsKey(name)){
    //         System.out.println("Введите дополнительный номер телефона: ");
    //         Integer new_num = inputText.nextInt();
    //         book_phone.get(name).add(new_num);
    //         System.out.printf("Номера телефонов", name, ": %s ", book_phone.get(name));
    //     }
    // }

    public static void main(String[] args) {
        b_ph();
        new_phone(book_phone);        
    }       
}