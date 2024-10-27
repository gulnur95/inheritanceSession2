import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*   Task 2     Session       Inheritance
        Создайте класс technique.Technique с полями(name, brand, version) и метод turnOnOff(); возвращает
        "name + включена" или "name + выключена" пользователь должен дать с консоли именно какую технику он хочет
        включить или выключить.Если он выбирает телефон или компьютер запросите пароль  Создайте класс technique.Phone, technique.Computer,
        technique.SmartWatch, все эти классы должны наследоваться от класса technique.Technique и в каждом классе должен быть по
        одному уникальному полю. Вызовите методы Parent classа и переопределите их в каждом классе. В main
        создайте по 2 объекта каждого выводите всю информацию и вызовите методы. */

        Scanner scanner = new Scanner(System.in);


        Technique[] devices = {
                new Phone("Телефон", "Samsung", "Galaxy S21", "+123456789"),
                new Phone("Телефон", "Apple", "iPhone 13", "+987654321"),
                new Computer("Компьютер", "HP", "ProBook 450", "Windows 10"),
                new Computer("Компьютер", "Apple", "MacBook Air", "macOS"),
                new SmartWatch("Смарт-часы", "Garmin", "Forerunner", true),
                new SmartWatch("Смарт-часы", "Fitbit", "Sense", false)
        };


        for (Technique device : devices) {
            System.out.println(device.toString());

            System.out.print("Хотите включить или выключить " + device.getName() + "? Выберите yes или no: ");
            String response = scanner.nextLine();

            if ("yes".equalsIgnoreCase(response)) {
                System.out.println(device.turnOnOff());
            } else {
                System.out.println(device.getName() + " остается выключенным.");
            }
            System.out.println();
        }





    }




}