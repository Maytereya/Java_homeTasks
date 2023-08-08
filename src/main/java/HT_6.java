import java.util.*;

public class HT_6 {
    public static void main(String[] args) {
        Laptop HP = new Laptop("HP", 15.6, "Win11", "Black", 512, 8);
        Laptop PB = new Laptop("Packard Bell", 16.4, "Win10", "Black", 1024, 16);
        Laptop MacBookPro = new Laptop("Apple MacBook Pro", 16.0, "MacOS", "Silver", 2048, 32);
        Laptop MacBookAir = new Laptop("Apple MacBook Air", 14.0, "MacOS", "Silver", 1024, 8);
        Laptop Samsung = new Laptop("Samsung", 15.0, "Win11", "White", 1024, 16);

        HP.setOS("FreeDOS");

        String choice, string_available;
        int num_available = 0;
        int exists = 0;
        String[] ck = new String[]{"1", "2", "3", "4"};
        Scanner scanner = new Scanner(System.in);

        ArrayList<Laptop> laptopList = new ArrayList<>();
        Set<Integer> num_set = new TreeSet<>();
        Set<String> str_set = new HashSet<>();
        laptopList.add(HP);
        laptopList.add(PB);
        laptopList.add(MacBookPro);
        laptopList.add(MacBookAir);
        laptopList.add(Samsung);

        System.out.print("Здравствуйте!\nМеню параметров:\nОЗУ - 1\nНАКОПИТЕЛЬ - 2\nОС - 3\nЦвет - 4\nВведите номер:");
        choice = scanner.nextLine();

        if (choice.contains(ck[0]) || choice.contains(ck[1])
                || choice.contains(ck[2]) || choice.contains(ck[3])) {

            switch (choice) {
                case "1" -> {
                    for (Laptop value : laptopList) {
                        num_set.add(value.getRAM());
                    }
                    System.out.print("Доступный объем оперативной памяти, GB: " + num_set + "\nВведите требуемый: ");
                    try {
                        num_available = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Неправильный ввод");
                    }
                    for (Laptop laptop : laptopList) {
                        if (num_available == laptop.getRAM()) {
                            System.out.print(laptop);
                            exists++;
                        }

                    }
                    if (exists == 0)
                        System.out.println("Не найдено");
                }
                case "2" -> {
                    for (Laptop value : laptopList) {
                        num_set.add(value.getSSD());
                    }
                    System.out.print("Доступный объем твердотельной памяти, GB: " + num_set + "\nВведите требуемый: ");
                    try {
                        num_available = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Неправильный ввод");
                    }
                    for (Laptop laptop : laptopList) {
                        if (num_available == laptop.getSSD()) {
                            System.out.print(laptop);
                            exists++;
                        }
                    }
                    if (exists == 0)
                        System.out.println("Не найдено");
                }
                case "3" -> {
                    for (Laptop value : laptopList) {
                        str_set.add(value.getOS());
                    }
                    System.out.print("Доступные операционные системы: " + str_set + "\nНапишите требуемую: ");
                    string_available = scanner.nextLine();
                    for (Laptop laptop : laptopList) {
                        if (string_available.equals(laptop.getOS())) {
                            System.out.print(laptop);
                            exists++;
                        }
                    }
                    if (exists == 0)
                        System.out.println("Не найдено");
                }
                case "4" -> {
                    for (Laptop laptop : laptopList) {
                        str_set.add(laptop.getBody_color());
                    }
                    System.out.print("Доступные цвета: " + str_set + "\nНапишите требуемый: ");
                    string_available = scanner.nextLine();
                    for (Laptop laptop : laptopList) {
                        if (string_available.equals(laptop.getBody_color())) {
                            System.out.print(laptop);
                            exists++;
                        }
                    }
                    if (exists == 0)
                        System.out.println("Не найдено");
                }
                default -> System.out.println("==========");
            }
        } else
            System.out.println("Неправильная команда");
    }
}
