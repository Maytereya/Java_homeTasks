import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HT_5 {
    static Map<String, String> phoneMap = new HashMap<>();

    public static void main(String[] args) {

        String name, phone, prevPhone;
        String[] chk = new String[]{"1", "2", "3"};
        boolean exit = false;

        while (!exit) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Меню:\n1 - добавить контакт\n2 - вывести все контакты\n3 - выход\nВведите команду: ");
            String sc = scanner.nextLine();

            if (sc.contains(chk[0]) || sc.contains(chk[1]) || sc.contains(chk[2])) {

                if (sc.equals("1")) {
                    System.out.print("1 - добавить контакт\nВведите имя: ");
                    name = scanner.nextLine();
                    if (phoneMap.containsKey(name)) {
                        prevPhone = phoneMap.get(name);
                        System.out.printf("[Имя %s присутствует]\n", name);
                        System.out.print("Введите дополнительный номер телефона: ");
                        phone = scanner.nextLine();
                        phone = prevPhone + ", " + phone;
                        phoneMap.put(name, phone);
                    } else {
                        System.out.printf("[Новый абонент, %s]\n", name);
                        System.out.print("Введите номер телефона: ");
                        phone = scanner.nextLine();
                        phoneMap.put(name, phone);
                    }
                    System.out.printf("[Добавлено: %s, phone: %s]\n", name, phoneMap.get(name));
                }
                if (sc.equals("2")) {
                    System.out.println("Вывод всех контактов: ");
                    for (var item : phoneMap.entrySet())
                        System.out.printf("[%s, phone(s): %s]\n", item.getKey(), item.getValue());
                }
                if (sc.equals("3")) {
                    System.out.println("Выход");
                    exit = true;
                } else
                    System.out.println("=======================");

            } else {
                System.out.println("Неправильная команда");
            }
        }
    }
}
